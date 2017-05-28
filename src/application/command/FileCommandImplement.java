package application.command;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import application.function.FTPClientSocket;

public class FileCommandImplement implements FileCommandCompose{
	static FTPClientSocket ftpClientSocket=null;
	String info=null;
	@Override
	public void rmdir(String dir){
		// TODO Auto-generated method stub
		String command=new String("rmdir "+dir);
		ftpClientSocket.getPw().write(command);
		ftpClientSocket.getPw().flush();	
		try {
			info=ftpClientSocket.getBr().readLine().trim();
			System.out.println(info);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("receiveMessageError");
			e.printStackTrace();
		}
	}

	@Override
	public String ls(String dir) {
		// TODO Auto-generated method stub
		String command=new String("ls "+dir);
		ftpClientSocket.getPw().write(command);
		ftpClientSocket.getPw().flush();
		try {			
			info=ftpClientSocket.getBr().readLine().trim();
			System.out.println(info);
			return info;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("receiveMessageError");
			e1.printStackTrace();
		}
		return null;
	}


	@Override
	public void binary() {
		// TODO Auto-generated method stub
		String command=new String("binary");
		ftpClientSocket.getPw().write(command);
		ftpClientSocket.getPw().flush();
		try {
			clearBuffered();
			System.out.println(ftpClientSocket.getBr().readLine());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("receiveMessageError");
			e1.printStackTrace();
		}
	}

	@Override
	public void type(String type) {
		// TODO Auto-generated method stub
		String command=new String("type "+type);
		ftpClientSocket.getPw().write(command);
		ftpClientSocket.getPw().flush();
		try {
			clearBuffered();
			System.out.println(ftpClientSocket.getBr().readLine().trim());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("receiveMessageError");
			e1.printStackTrace();
		}
	}

	@Override
	public void mkdir(String dirName, String parentDir) {
		// TODO Auto-generated method stub
		String currentDir=pwd();
		if(!currentDir.equals(parentDir)){
			cd(parentDir);
		}
		String command=new String("mkdir "+dirName);
		ftpClientSocket.getPw().write(command);
		ftpClientSocket.getPw().flush();
		try {
			info=ftpClientSocket.getBr().readLine().trim();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("receiveMessageError");
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String fileName, String dir) {
		// TODO Auto-generated method stub
		String currentDir=pwd();
		if(!currentDir.equals(dir)){
			cd(dir);
		}
		String command=new String("delete "+fileName);
		ftpClientSocket.getPw().write(command);
		ftpClientSocket.getPw().flush();
		try {
			clearBuffered();
			info=ftpClientSocket.getBr().readLine().trim();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("receiveMessageError");
			e.printStackTrace();
		}
	}

	@Override
	public String get(String fileName, String dir,String remoteDir) {
		// TODO Auto-generated method stub
		String currentDir=pwd();
		if(!currentDir.equals(remoteDir)){
			cd(remoteDir);
		}
		String command=new String("get "+fileName);
		ftpClientSocket.getPw().write(command);
		ftpClientSocket.getPw().flush();
//		 try {
//	  			info=ftpClientSocket.getBr().readLine();
//	  		} catch (IOException e) {
//	  			// TODO Auto-generated catch block
//	  			System.out.println("receiveMessageError");
//	  			e.printStackTrace();
//	  		}		
		//文件传输
		DataInputStream dis=null;
		FileOutputStream fos=null;
	      try { 
	          dis = new DataInputStream(ftpClientSocket.getIs()); 	   
	          File file = new File(dir+ "\\" + fileName); 
	          fos = new FileOutputStream(file); 
	   
	          // 开始接收文件 
	          byte[] bytes = new byte[1024]; 
	          int length = 0; 
	          while((length = dis.read(bytes, 0, bytes.length)) != -1) { 
	            fos.write(bytes, 0, length); 
	            fos.flush(); 
	          } 
	        } catch (Exception e) { 
	          e.printStackTrace(); 
	        } finally { 
	          try { 
	            if(fos != null) 
	              fos.close(); 
	            if(dis != null) 
	              dis.close(); 
	          } catch (Exception e) {} 
	        }  
		return null;
	}

	
	@Override
	public void put(String fileName,String dir,boolean isASCII, String remoteDir) {
		// TODO Auto-generated method stub
		String currentDir=pwd();
		if(!currentDir.equals(remoteDir)){
			cd(remoteDir);
		}
		if(isASCII){
			 FileInputStream fis=null;
			 DataOutputStream dos=null;
		    try { 
		        File file = new File(fileName+dir); 
		        if(file.exists()) { 
		          fis = new FileInputStream(file); 
		          dos = new DataOutputStream(ftpClientSocket.getOs()); 
		   
		          // 文件名和长度 
		          dos.writeUTF(file.getName()); 
		          dos.flush(); 
		          dos.writeLong(file.length()); 
		          dos.flush(); 
		   
		          // 开始传输文件 
		          System.out.println("======== 开始传输文件 ========"); 
		          byte[] bytes = new byte[1024]; 
		          int length = 0; 
		          long progress = 0; 
		          while((length = fis.read(bytes, 0, bytes.length)) != -1) { 
		            dos.write(bytes, 0, length); 
		            dos.flush(); 
		            progress += length; 
		            System.out.print("| " + (100*progress/file.length()) + "% |"); 
		          } 
//		          clearBuffered();
		          System.out.println(ftpClientSocket.getBr().readLine().trim()); 
		          System.out.println(); 
		        } 
		      } catch (Exception e) { 
		        e.printStackTrace(); 
		      } finally { 
		        if(fis != null)
					try {
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        if(dos != null)
					try {
						dos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		      } 
		}
	}
	
	
	
	public static String pwd() {
		// TODO Auto-generated method stub
		String command=new String("pwd");
		ftpClientSocket.getPw().write(command);
		ftpClientSocket.getPw().flush();
		try {
//			clearBuffered();
			String currentDir=ftpClientSocket.getBr().readLine().trim();
			System.out.println(currentDir);
			return currentDir;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("receiveMessageError");
			e1.printStackTrace();
		}
		return null;
	}
	
	
	
	public static String cd(String dir) {
		// TODO Auto-generated method stub
		String command=new String("cd "+dir);
		ftpClientSocket.getPw().write(command);
		ftpClientSocket.getPw().flush();
		try {
			clearBuffered();
			String info=ftpClientSocket.getBr().readLine().trim();
			System.out.println(info);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("receiveMessageError");
			e1.printStackTrace();
		}
		return null;
	}
	public static void clearBuffered(){
		char[] cbuf = new char[1024];
		try {
			ftpClientSocket.getBr().read(cbuf);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void setFTPClientSocket(FTPClientSocket ftpClientSocket){
		FileCommandImplement.ftpClientSocket=ftpClientSocket;
	}

}

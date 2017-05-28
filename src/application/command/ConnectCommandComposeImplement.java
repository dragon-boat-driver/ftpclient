package application.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import application.function.FTPClientSocket;
import application.tool.SiteRecord;

public class ConnectCommandComposeImplement implements ConnectCommandCompose{
	static FTPClientSocket ftpClientSocket=null;
	@Override
	public void open(SiteRecord siteRecord){
		// TODO Auto-generated method stub
		
		String command=new String("open "+siteRecord.getHostName()+":"+siteRecord.getPort());
		PrintWriter pw = ftpClientSocket.getPw();
		pw.write(command);
		pw.flush();
		String info=null;
		try {
			
//			do{					
			BufferedReader br=ftpClientSocket.getBr();
//			clearBuffered();
			System.out.println(br.readLine());
			pw.write("login "+siteRecord.getUserName()+" "+siteRecord.getPassword());
			pw.flush();
//			clearBuffered();
			info=br.readLine().trim();
			System.out.println(info);
//			ftpClientSocket.setConfirmTime(ftpClientSocket.getConfirmTime()+1);
//			}while(!info.trim().equals("LOGIN_ERROR")&&ftpClientSocket.getConfirmTime()<=3);
			if(info.equals("OK")){
				System.out.println("login succeed!");
			}else{
				System.out.println("login failed!");
				ftpClientSocket.closeSocket();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("getMessageFailed");
			e.printStackTrace();
		}
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		closeImplement("close");
		
	}

	@Override
	public void bye() {
		// TODO Auto-generated method stub
		closeImplement("bye");
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		closeImplement("quit");
	}
	private void closeImplement(String command){
		ftpClientSocket.getPw().write(command);
		ftpClientSocket.getPw().flush();
		try {
//			clearBuffered();
			Boolean isClose=false;
			String info=null;
			while(!isClose){
				info=ftpClientSocket.getBr().readLine();
				if(info.trim().equals("LOGOUT")){
					isClose=true;
					System.out.println(info);
					ftpClientSocket.closeSocket();
				}else{
					closeImplement(command);
				}
				
			}
			
//			System.out.println("logout");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("receiveCloseMessageError");
			e.printStackTrace();
			
		}
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
		ConnectCommandComposeImplement.ftpClientSocket=ftpClientSocket;
	}
}

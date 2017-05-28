package application.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class FTPClientSocket {
	private Socket socket=null;
	private OutputStream os=null;
	private PrintWriter pw=null;
	private InputStream is=null;
	private BufferedReader br=null;
	private int confirmTime=0;
	private static final String HOSTS="192.168.199.133";
	private static final int PORT=8888;
	public int getConfirmTime() {
		return confirmTime;
	}
	public void setConfirmTime(int confirmTime) {
		this.confirmTime = confirmTime;
	}
	public Socket getSocket() {
		return socket;
	}
	public OutputStream getOs() {
		return os;
	}
	public PrintWriter getPw() {
		return pw;
	}

	public InputStream getIs() {
		return is;
	}

	public BufferedReader getBr() {
		return br;
	}

//	public static void main(String[] args) throws IOException {
//		FTPClientSocket ftpClientSocket=new FTPClientSocket();
//		ftpClientSocket.start();
//		ftpClientSocket.closeSocket();
//	}
	
	public FTPClientSocket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FTPClientSocket(String hosts,int port){
		try {
			this.socket=new Socket(hosts,port);
			this.os=socket.getOutputStream();
			pw=new PrintWriter(os);
			is=socket.getInputStream();
			br=new BufferedReader(new InputStreamReader(is));			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//	public  void start() throws IOException{
//		//1、创建客户端Socket，指定服务器地址和端口
//		socket=new Socket(HOSTS,PORT);
//		socket.setSoTimeout(0);
//		//2、获取输出流，向服务器端发送信息
//		os = socket.getOutputStream();//字节输出流
//		pw =new PrintWriter(os);//将输出流包装成打印流
//		pw.write("用户名：admin；密码：admin");
//		pw.flush();
//		pw.write("hello");
//		pw.flush();
////		socket.shutdownOutput();
//		//3、获取输入流，并读取服务器端的响应信息
//		is = socket.getInputStream();
//		br = new BufferedReader(new InputStreamReader(is));
//		String info = null;
//		while((info=br.readLine())!=null){
//		 System.out.println("Hello,我是客户端，服务器说："+info);
//		}
//	}
	
	public void closeSocket() throws IOException{
		br.close();
		is.close();
		pw.close();
		os.close();
		socket.close();
	}
	
}

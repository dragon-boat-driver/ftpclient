package application.test;

import java.net.Socket;

import application.command.ConnectCommandComposeImplement;
import application.command.FileCommandImplement;
import application.function.FTPClientSocket;
import application.tool.SiteRecord;

public class FTPClientTest extends Socket{
	  private static final String SERVER_IP = "192.168.199.133"; // 服务端IP 
	  private static final int SERVER_PORT = 8888; // 服务端端口

	/**
	 * 入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FTPClientSocket ftpClientSocket = new FTPClientSocket(SERVER_IP, SERVER_PORT);
		SiteRecord siteRecord = new SiteRecord("record001", null, SERVER_IP, SERVER_PORT, false, false, "user001",
				"user001", false);
		ConnectCommandComposeImplement connectCommandComposeImplement = new ConnectCommandComposeImplement();
		ConnectCommandComposeImplement.setFTPClientSocket(ftpClientSocket);
		connectCommandComposeImplement.open(siteRecord);
//		connectCommandComposeImplement.bye();
//		connectCommandComposeImplement.close();
//		connectCommandComposeImplement.quit();
//		FileCommandImplement fileCommandImplement=new FileCommandImplement();
		FileCommandImplement.setFTPClientSocket(ftpClientSocket);
		FileCommandImplement.pwd();
	}
}

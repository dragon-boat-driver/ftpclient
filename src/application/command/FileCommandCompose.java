package application.command;

import application.function.FTPClientSocket;

public interface FileCommandCompose{
	public void mkdir(String dirName,String parentDir);
	public void delete(String fileName,String dir);
	public void rmdir(String dir);
	public String ls(String dir);
	public void binary();
	public void type(String type);
	public String get(String fileName,String dir,String remoteDir);
	public void put(String fileName,String dir,boolean isASCII,String remoteDir);
	
}

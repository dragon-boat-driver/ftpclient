package application.function;

import application.tool.SiteRecord;

public interface ConectionManager {
	SiteRecord siteRecord=null;
	public void open(SiteRecord siteRecord);
	public void close(SiteRecord siteRecord);
	public void mkdir();
	public void rename(String fileName,Boolean isFile);
	public void delete(String fileName,Boolean isFile);
	public void dir();
	public void ls();
	public void get();
	public void put();
}

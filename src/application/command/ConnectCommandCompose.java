package application.command;

import application.tool.SiteRecord;

public interface ConnectCommandCompose {
	public void open(SiteRecord siteRecord) ;
	public void close();
	public void bye();
	public void quit();
}

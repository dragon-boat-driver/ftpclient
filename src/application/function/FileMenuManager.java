package application.function;

import application.tool.SiteRecord;

public interface FileMenuManager {
	public void openSiteAdmin();
	public SiteRecord copyCurrentConnectToSiteAdmin();
	public void ConnectToDefaultAdmin();
	public void exit();
}

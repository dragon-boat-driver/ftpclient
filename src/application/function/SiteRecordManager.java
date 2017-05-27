package application.function;

import application.tool.SiteRecord;

public interface SiteRecordManager {
	public String parentDir=null;
	public SiteRecord newSiteRecord=null;
	//Õ¾µã
	public SiteRecord createSiteRecord(String parentDir,SiteRecord newSiteRecord,Boolean canSave);
	
	public SiteRecord displaySiteRecord(String parentDir,String siteRecordName);
		
	public void deleteSiteRecord(String parentDir,String siteRecordName);
	
	public void renameSiteRecord(String oldSiteRecordName,String newSiteRecordName);
	
	public void copySiteRecord(String oldParentDir,String siteRecordName,String newParentDir);
	
	//Õ¾µãÄ¿Â¼
	public void createSiteAdmirDir(String newSiteAdminDir);
	
	public void renameSiteAdminDir(String oldDir,String newDir);
	
	public void deleteSiteAdminDir(String deleteDir,Boolean isFree);
	
	public void copySiteAdminDir(String oldDir,String newDir);
}

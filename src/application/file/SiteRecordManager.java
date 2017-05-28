package application.file;

import application.tool.SiteRecord;

public interface SiteRecordManager {
	public void saveSiteRecord(SiteRecord siteRecord,String parentDir);
	public void readSiteRecord(String siteRecordName);
	public void copyDir(String oldDir,String newDir);
	public void deleteSiteRecord(String filePath);
	public void deleteDir(String dir);
	public void renameSiteRecord(String oldFileName,String newFileName);
	public void renameDir(String oldDir,String newDir);
}

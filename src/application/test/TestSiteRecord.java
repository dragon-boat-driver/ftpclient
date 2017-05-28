package application.test;

import application.file.SiteRecordManagerImplements;
import application.tool.SiteRecord;

public class TestSiteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SiteRecord siteRecord=new SiteRecord("a.property", "C:\\Users\\mosha\\workspace\\FTPClient\\property", "127.0.0.1", 21, false, false, "xiaoming", "123456", false);
		SiteRecordManagerImplements siteRecordManagerImplements=new SiteRecordManagerImplements();
		siteRecordManagerImplements.readSiteRecord("C:\\Users\\mosha\\workspace\\FTPClient\\b.property");
		
	}

}

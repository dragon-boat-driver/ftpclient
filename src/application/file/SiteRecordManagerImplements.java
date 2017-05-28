package application.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import application.tool.SiteRecord;

public class SiteRecordManagerImplements implements SiteRecordManager{
//	   userName 
	/*
	 * property¼ÇÂ¼Ë³Ðò:
	 * siteRecordName parentUrl
	 * hostName port
	 * isAnonimity isSavePassword
	 * userName password
	 * isDefaultSite
	 * */
	@Override
	public void saveSiteRecord(SiteRecord siteRecord, String parentDir) {
		// TODO Auto-generated method stub
		Properties properties=new Properties();
		try {
			FileOutputStream fos=new FileOutputStream(parentDir+"\\"+siteRecord.getSiteRecordName());
			properties.setProperty("siteRecordName",siteRecord.getHostName());
			properties.setProperty("parentUrl", siteRecord.getParentUrl());
			properties.setProperty("hostName",siteRecord.getHostName() );
			properties.setProperty("port", siteRecord.getPort().toString());
			properties.setProperty("isAnonimity",siteRecord.getIsAnonimity().toString() );
			properties.setProperty("isSavePassword", siteRecord.getIsSavePassword().toString());
			properties.setProperty("userName", siteRecord.getUserName());
			properties.setProperty("password", siteRecord.getPassword());
			properties.setProperty("isDefaultSite",siteRecord.getIsDefaultSite().toString());
			try {
				properties.store(fos, null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void readSiteRecord(String filePath) {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		InputStream is;
		try {
			is = new FileInputStream(new File(filePath));

			try {
				// siteRecordName parentUrl
				// * hostName port
				// * isAnonimity isSavePassword
				// * userName password
				// * isDefaultSite
				properties.load(is);
				System.out.println(properties.getProperty("siteRecordName"));
				System.out.println(properties.getProperty("parentUrl"));
				System.out.println(properties.getProperty("hostName"));
				System.out.println(properties.getProperty("port"));
				System.out.println(properties.getProperty("isAnonimity"));
				System.out.println(properties.getProperty("isSavePassword"));
				System.out.println(properties.getProperty("userName"));
				System.out.println(properties.getProperty("password"));
				System.out.println(properties.getProperty("isDefaultSite"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void copyDir(String oldDir, String newDir) {
		// TODO Auto-generated method stub
		File oldDirectory=new File(oldDir);
		if(oldDirectory.isDirectory()){
			File[] files=oldDirectory.listFiles();
			for(int i=0;i<files.length;i++){
				
			}
		}
	}

	@Override
	public void deleteSiteRecord(String filePath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDir(String dir) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renameSiteRecord(String oldFileName, String newFileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renameDir(String oldDir, String newDir) {
		// TODO Auto-generated method stub
		
	}

}

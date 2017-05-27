package application.tool;

public class SiteRecord {
	private String siteRecordName;
	private String parentUrl;
	private String hostName;
	private Integer port;
	private Boolean isAnonimity;
	private Boolean isSavePassword;
	private String userName;
	private String password;
	private Boolean isDefaultSite;
	
	
	
	public SiteRecord(String siteRecordName,String parentUrl,String hostName, Integer port, Boolean isAnonimity, Boolean isSavePassword, String userName,
			String password, Boolean isDefaultSite) {
		super();
		this.siteRecordName=siteRecordName;
		this.parentUrl=parentUrl;
		this.hostName = hostName;
		this.port = port;
		this.isAnonimity = isAnonimity;
		this.isSavePassword = isSavePassword;
		this.userName = userName;
		this.password = password;
		this.isDefaultSite = isDefaultSite;
	}
	
	
	public String getSiteRecordName() {
		return siteRecordName;
	}


	public void setSiteRecordName(String siteRecordName) {
		this.siteRecordName = siteRecordName;
	}


	public String getParentUrl() {
		return parentUrl;
	}


	public void setParentUrl(String parentUrl) {
		this.parentUrl = parentUrl;
	}


	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public Boolean getIsAnonimity() {
		return isAnonimity;
	}
	public void setIsAnonimity(Boolean isAnonimity) {
		this.isAnonimity = isAnonimity;
	}
	public Boolean getisSavePassword() {
		return isSavePassword;
	}
	public void setisSavePassword(Boolean isSavePassword) {
		this.isSavePassword = isSavePassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIsDefaultSite() {
		return isDefaultSite;
	}
	public void setIsDefaultSite(Boolean isDefaultSite) {
		this.isDefaultSite = isDefaultSite;
	}
	
}

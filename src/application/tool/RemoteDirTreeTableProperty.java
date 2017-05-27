package application.tool;

import javafx.beans.property.SimpleStringProperty;

public final class RemoteDirTreeTableProperty {
	private final SimpleStringProperty remoteFileName = new SimpleStringProperty();
	private final SimpleStringProperty remoteFileSize = new SimpleStringProperty();
	private final SimpleStringProperty remoteFileType = new SimpleStringProperty();
	private final SimpleStringProperty remoteFileChangeTime = new SimpleStringProperty();
	private final SimpleStringProperty remoteFileJurisdiction = new SimpleStringProperty();
	
	public RemoteDirTreeTableProperty(String remoteFileName,String remoteFileSize,String remoteFileType,String remoteFileChangeTime,String remoteFileJurisdiction){
		setRemoteFileName(remoteFileName);
		setRemoteFileSize(remoteFileSize);
		setRemoteFileType(remoteFileType);
		setRemoteFileChangeTime(remoteFileChangeTime);
	}
	
	//set
	public void setRemoteFileName(String remoteFileName) {
		this.remoteFileName.set(remoteFileName);
	}
	public void setRemoteFileSize(String remoteFileSize) {
		this.remoteFileSize.set(remoteFileSize);
	}
	public void setRemoteFileType(String remoteFileType) {
		 this.remoteFileType.set(remoteFileType);
	}
	public void setRemoteFileChangeTime(String remoteFileChangeTime) {
		 this.remoteFileChangeTime.set(remoteFileChangeTime);
	}
	public void setRemoteFileJurisdiction(String remoteFileJurisdiction){
		this.remoteFileJurisdiction.set(remoteFileJurisdiction);
	}
	
	
	//get
	public String getRemoteFileName(){
		return this.remoteFileName.get();
	}
	public String getRemoteFileSize(){
		return this.remoteFileSize.get();
	}
	public String getRemoteFileType(){
		return this.remoteFileType.get();
	}
	public String getRemoteFileChangeTime(){
		return this.remoteFileChangeTime.get();
	}
	public String getRemoteFileJurisdiction(){
		return this.remoteFileJurisdiction.get();
	}
	
	//·µ»ØSimpleStringProperty
	public SimpleStringProperty  getRemoteFileNameProperty(){
		return remoteFileName;
	}
	public SimpleStringProperty  getRemoteFileSizeProperty(){
		return remoteFileSize;
	}
	public SimpleStringProperty  getRemoteFileTypeProperty(){
		return remoteFileType;
	}
	public SimpleStringProperty  getRemoteFileChangeTimeProperty(){
		return remoteFileChangeTime;
	}
	public SimpleStringProperty  getRemoteFileJurisdictionProperty(){
		return remoteFileJurisdiction;
	}
	
}

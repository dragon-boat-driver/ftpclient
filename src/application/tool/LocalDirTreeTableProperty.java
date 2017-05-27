package application.tool;

import javafx.beans.property.SimpleStringProperty;

public final class LocalDirTreeTableProperty {
	private final SimpleStringProperty localFileName = new SimpleStringProperty();
	private final SimpleStringProperty localFileSize = new SimpleStringProperty();
	private final SimpleStringProperty localFileType = new SimpleStringProperty();
	private final SimpleStringProperty localFileChangeTime = new SimpleStringProperty();
	public void setLocalFileName(String localFileName) {
		this.localFileName.set(localFileName);
	}
	public void setLocalFileSize(String localFileSize) {
		this.localFileSize.set(localFileSize);
	}
	public void setLocalFileType(String localFileType) {
		 this.localFileType.set(localFileType);
	}
	public void setLocalFileChangeTime(String localFileChangeTime) {
		 this.localFileChangeTime.set(localFileChangeTime);
	}
	public String getLocalFileName(){
		return this.localFileName.get();
	}
	public String getLocalFileSize(){
		return this.localFileSize.get();
	}
	public String getLocalFileType(){
		return this.localFileType.get();
	}
	public String getLocalFileChangeTime(){
		return this.localFileChangeTime.get();
	}
	
}

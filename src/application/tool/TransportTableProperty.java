package application.tool;

import javafx.beans.property.SimpleStringProperty;

public final class TransportTableProperty {
	private final SimpleStringProperty transportlocalFile = new SimpleStringProperty();
	private final SimpleStringProperty transportFileSize = new SimpleStringProperty();
	private final SimpleStringProperty transportFileOrient = new SimpleStringProperty();
	private final SimpleStringProperty transportRemoteFile = new SimpleStringProperty();
	private final SimpleStringProperty transportRemoteUrl = new SimpleStringProperty();
	private final SimpleStringProperty transportFileStatus = new SimpleStringProperty();
	public TransportTableProperty(String transportlocalFile,String transportFileSize,String transportRemoteFile,String transportRemoteUrl){
		setTransportlocalFile(transportlocalFile);
		setTransportFileSize(transportFileSize);
		setTransportRemoteFile(transportRemoteFile);
		setTransportRemoteUrl(transportRemoteUrl);
	}
	
	//set
	public void setTransportlocalFile(String transportlocalFile) {
		this.transportlocalFile.set(transportlocalFile);
	}
	public void setTransportFileSize(String transportFileSize) {
		this.transportFileSize.set(transportFileSize);
	}
	public void setTransportRemoteFile(String transportRemoteFile) {
		 this.transportRemoteFile.set(transportRemoteFile);
	}
	public void setTransportRemoteUrl(String transportRemoteUrl) {
		 this.transportRemoteUrl.set(transportRemoteUrl);
	}
	public void setTransportFileOrient(boolean transportFileOrient) {
		 if(transportFileOrient){
			 this.transportFileOrient.set("-->");
		 }else{
			 this.transportFileOrient.set("<--");
		 }
	}
	public void setTranSportFileStatus(boolean transportFileStatus){
		if(transportFileStatus){
			this.transportFileStatus.set("正在传输");
		}else{
			this.transportFileStatus.set("传输结束");
		}
	}
	//get
	public String getTransportlocalFile(){
		return this.transportlocalFile.get();
	}
	public String getTransportFileSize(){
		return this.transportFileSize.get();
	}
	public String getTransportRemoteFile(){
		return this.transportRemoteFile.get();
	}
	public String getTransportRemoteUrl(){
		return this.transportRemoteUrl.get();
	}
	public String getTransportFileOrient(){
		return this.transportFileOrient.get();
	}
	public String getTransportFileStatus(){
		return this.transportFileStatus.get();
	}
	
	//返回SimpleStringProperty
	public SimpleStringProperty  getTransportlocalFileProperty(){
		return transportlocalFile;
	}
	public SimpleStringProperty  gettransportFileSizeProperty(){
		return transportFileSize;
	}
	public SimpleStringProperty  getTransportRemoteFileProperty(){
		return transportRemoteFile;
	}
	public SimpleStringProperty  getTransportRemoteUrlProperty(){
		return transportRemoteUrl;
	}
	public SimpleStringProperty  getTransportFileOrientProperty(){
		return transportFileOrient;
	}
	public SimpleStringProperty  getTransportFileStatusProperty(){
		return transportFileStatus;
	}
}

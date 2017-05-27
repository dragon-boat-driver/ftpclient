package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.tool.LocalDirTreeTableProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;

public class MainController implements Initializable {
	//菜单设置
		
	//连接设置
	@FXML
	private TextField RemoteUrl;
	@FXML
	private TextField username;
	@FXML
	private TextField password;
	@FXML
	private TextField port;
	@FXML
	private ChoiceBox<?> connectMethod;
	
	//显示当前目录
	@FXML
	private TextField localCurrentDir;
	@FXML 
	private TextField remoteCurentDir;
	
	//本地目录树
//	@FXML
//	private TreeTableView<LocalDirTreeTableProperty> localDir;
//	@FXML
//	private TreeTableColumn<S, T> localFileName;
//	@FXML
//	private TreeTableColumn<S, T> localFileSize;
//	@FXML
//	private TreeTableColumn<S, T> localFileType;
//	@FXML
//	private TreeTableColumn<S, T> localFileChangeTime;
	
//	//远程目录树
//	@FXML
//	private TreeTableView<S> remoteDir;
//	@FXML
//	private TreeTableColumn<S, T> remotelFileName;
//	@FXML
//	private TreeTableColumn<S, T> remoteFileSize;
//	@FXML
//	private TreeTableColumn<S, T> remoteFileType;
//	@FXML
//	private TreeTableColumn<S, T> remoteFileChangeTime; 
//	@FXML
//	private TreeTableColumn<S, T> remoteFileJurisdiction;
	
//	//显示传输队列
//	@FXML
//	private TableView<S> transportQueneTable;
//	@FXML
//	private TableColumn<S, T> transportLocalFile;
//	@FXML
//	private TableColumn<S, T> transportFileSize;
//	@FXML
//	private TableColumn<S, T> transportFileOrient;
//	@FXML
//	private TableColumn<S, T> transportRemoteFile;
//	@FXML
//	private TableColumn<S, T> transportRemoteUrl;
//	@FXML
//	private TableColumn<S, T> transportStatus;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}

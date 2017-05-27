package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TreeView;

public class SiteAdminController implements Initializable {
	//ChoiceBox类型不对，需修改
	@FXML
	private TreeView SiteTree;
	@FXML
	private TextField hostName;
	@FXML
	private TextField port;
	@FXML
	private TextField userName;
	@FXML
	private TextField password;
	@FXML
	private ChoiceBox<String> serverType;
	
	//登录方式按钮组
	@FXML
	private RadioButton isAnonimity;
	@FXML
	private RadioButton isNormal;
	
	//设置登录方式
	private ToggleGroup group;
	@FXML
	private RadioButton isSavePassword;
	@FXML
	private RadioButton isDefaultSite;
	
	//按钮
	@FXML
	private Button newSiteRecordBut;
	@FXML
	private Button newDirBut;
	@FXML
	private Button copyBut;
	@FXML
	private Button renameBut;
	@FXML
	private Button delBut;
	@FXML
	private Button connectBut;
	@FXML
	private Button cancelBut;
	@FXML
	private Button saveBut;
	@FXML
	private Button exitBut;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	
	public void initializeRadioButtonGroup(){
		group=new ToggleGroup();
		isAnonimity.setToggleGroup(group);
		isAnonimity.setSelected(true);
		isAnonimity.requestFocus();
		isNormal.setToggleGroup(group);
		isNormal.setSelected(false);
		
	}
}

package application;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class IndexController implements Initializable {

	 @FXML
	    private TextField socialSecurityNumberFld;

	    @FXML
	    private PasswordField passwordFld;

	    @FXML
	    private Button signInBtn;

	    @FXML
	    private Label errorLabel;

	    @FXML
	    void onSignInButtonPress(ActionEvent event) {
	    	JOptionPane.showMessageDialog(null, "Sign in pressed");
	    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("_________________________" +"\nIndex Controller");
	}

}

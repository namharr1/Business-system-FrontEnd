package application;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import application.model.NumberParserValidator;
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

	private NumberParserValidator numberParserValidator;
	private long socialSecurityNumber;
	private String password;

	// When sign in button pressed.
	@FXML
	void onSignInButtonPress(ActionEvent event) {
		errorLabel.setText("");
		System.out.println("Sign in button Pressed");

		// Check if the fields are empty
		if (checkIfFieldsAreEmptyAndSize(socialSecurityNumberFld.getText(), passwordFld.getText())) {
			// Control if Social Security number text format is the correct data
			// type.
			if (!numberParserValidator.parseLong(socialSecurityNumberFld.getText())) {
				errorLabel.setText("Social security number fromat is invalid.");
				System.err.println("Social securty number format is invalid.");
			} else {
				socialSecurityNumber = Long.parseLong(socialSecurityNumberFld.getText());
				password = passwordFld.getText();
				createAcountValidation(socialSecurityNumber, password);
			}

		}
	}

	/*
	 * Check if the fields are correct filled in. 
	 * Check if Social security number is not empty.
	 * Check if password field is not empty. 
	 * Check if social security number is 10 number.
	 * Check if password is to short.
	 * Check if password is to long.
	 */
	private boolean checkIfFieldsAreEmptyAndSize(String socialSecurityNumber, String password) {
		if (socialSecurityNumber.trim().length() == 0) {
			errorLabel.setText("Social security number must not be empty.");
			System.err.println("Social security number field is empty!");
			return false;

		} else if (password.trim().length() == 0) {
			errorLabel.setText("Password field must not be empty.");
			System.err.println("Password field is empty!");
			return false;

		} else if (socialSecurityNumber.length() != 10) {
			errorLabel.setText("Social security number must be 10 numbers.");
			System.err.println("Social security number is not 10 numbers. Current size: " + socialSecurityNumber.length());
			return false;

		} else if (password.length() < 6) {
			errorLabel.setText("Password is to short.");
			System.err.println("Password is to short. Current size: " + password.length());
			return false;

		} else if (password.length() > 30) {
			errorLabel.setText("Password is to long.");
			System.err.println("Password is over 30 chars. Current size: " + password.length());
			return false;

		} else {
			return true;
		}

	}
	
	/*TODO
	 * Add obj for validation
	 * send validation to server
	 * Get Respond, validate it 
	 * send to next scene.
	 * */
	
	// Create Account validation when every thing is success , send it to server for validation.
	private void createAcountValidation(long socialSecurityNumber, String password) {
		// TODO comment this part when AccountValidation class is up and
		// ready. + remove JOPtionPane.
		// AccountValidation accountValidation = new
		// AccountValidation(socialSecurityNumber, password);
		JOptionPane.showMessageDialog(null, "Account Validation : " + socialSecurityNumber +  "  " + password);
		
		// When validation is done and success ->
		changeToNextScene();
	}
	
	// Change scene when every thing is correct.
	private void changeToNextScene() {
		JOptionPane.showMessageDialog(null, "Did not find the next scene!");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Clear fields & labels.
		socialSecurityNumberFld.clear();
		passwordFld.clear();
		errorLabel.setText("");
		
		// Add number parser validator.
		numberParserValidator = new NumberParserValidator();

		// Remove the focus form the fields so the user can see the hint text.
		socialSecurityNumberFld.setFocusTraversable(false);
		passwordFld.setFocusTraversable(false);
	}

}

/*TODO  
 * Add validation class .  
 * Send validation to Database.  
 * Change scene.
  */

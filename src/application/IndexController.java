package application;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class IndexController implements Initializable {

	@FXML
	private Button button1;

	@FXML
	void onButton1press(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "teesting");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("_________________________" +"\nIndex Controller");
	}

}

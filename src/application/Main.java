package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		System.out.println("Start Up - Business System - Front end"); 
		Parent root = FXMLLoader.load(getClass().getResource("Index.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Business System 1.0"); 
		primaryStage.setResizable(false); 
		primaryStage.show();
	}
	
	public static void main(String[] start)
	{
		Application.launch(start);
	}
	
}
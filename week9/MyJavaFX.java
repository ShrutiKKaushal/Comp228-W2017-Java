package week9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class MyJavaFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 200,250);//Passes in he components then w + h 
		
		primaryStage.setTitle("My JavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args){
	launch(args);
	}
	
}

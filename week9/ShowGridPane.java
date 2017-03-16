package week9;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(5.5); //sets horizontal gap
		pane.setVgap(5.5); //sets vertical gap
		
		// Place nodes in the pane
	    pane.add(new Label("First Name:"), 0, 0); //Component, Column, Row
	    pane.add(new TextField(), 1, 0);
	    pane.add(new Label("MI:"), 0, 1); 
	    pane.add(new TextField(), 1, 1);
	    pane.add(new Label("Last Name:"), 0, 2);
	    pane.add(new TextField(), 1, 2);
	    Button btAdd = new Button("Add Name");
	    pane.add(btAdd, 1, 3);
	    GridPane.setHalignment(btAdd, HPos.RIGHT);
	    
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(pane);
	    primaryStage.setTitle("ShowGridPane"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

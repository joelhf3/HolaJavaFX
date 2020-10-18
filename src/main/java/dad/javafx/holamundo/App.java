package dad.javafx.holamundo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class App extends Application {
	
	private Controller controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		controller = new Controller();
		
		Scene scene = new Scene(controller.getView(), 320, 200);
		
		Stage stage = new Stage();
		stage.setTitle("Hola Mundo");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

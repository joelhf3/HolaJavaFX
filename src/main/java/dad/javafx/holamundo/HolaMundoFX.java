package dad.javafx.holamundo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaMundoFX extends Application {
	
	private Label saludoLabel;
	private Button saludarButton;
	private TextField nombreText;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		nombreText = new TextField();
		nombreText.setPrefColumnCount(5);
		nombreText.setPromptText("Introduce un nombre");
		nombreText.setMaxWidth(150);
		
		saludoLabel = new Label();
		saludoLabel.setText("Aquí saldrá el saludo");
		
		saludarButton = new Button();
		saludarButton.setText("Saludar");
		saludarButton.setOnAction(e -> onSaludarButtonAction(e));
		saludarButton.setDefaultButton(true);
	
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText, saludarButton, saludoLabel);

		Scene escena = new Scene(root, 320, 200);
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("Hola Mundo Mejorado");
		primaryStage.show();
	}

	private void onSaludarButtonAction(ActionEvent e) {
		String nombre = nombreText.getText();
		saludoLabel.setText("¡Hola " + nombre + "!");
		saludoLabel.setStyle("-fx-text-fill: blue; -fx-font: italic bold 30 sans-serif;");
	}

	public static void main(String[] args) {
		launch(args);
	}

}

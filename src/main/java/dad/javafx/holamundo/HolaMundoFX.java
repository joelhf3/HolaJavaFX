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
	private VBox root;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// creamos el cuadro de texto
		nombreText = new TextField();
		nombreText.setPromptText("Introduce un nombre");
		nombreText.setMaxWidth(150); // ancho del cuadro de texto  
		
		// creamos una etiqueta
		saludoLabel = new Label();
		saludoLabel.setText("Aquí saldrá el saludo");
		
		// creamos un botón 
		saludarButton = new Button();
		saludarButton.setText("Saludar");
		saludarButton.setOnAction(e -> onSaludarButtonAction(e));
		saludarButton.setDefaultButton(true); // establece el botón de saludar como botón por defecto
	
		// panel con disposición vertical
		root = new VBox();
		root.setSpacing(15);
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
		saludoLabel.setStyle("-fx-text-fill: red; -fx-font: bold 40 consolas;");
	}

	public static void main(String[] args) {
		launch(args);
	}

}

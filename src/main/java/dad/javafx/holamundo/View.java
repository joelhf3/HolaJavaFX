package dad.javafx.holamundo;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class View extends VBox {

	private TextField tf;
	private Button btn;
	private Label lbl;
	
	public View() {
		super();
		
		tf = new TextField();
		btn = new Button("Saludar");
		lbl = new Label();		
		
		this.setSpacing(5);
		this.setFillWidth(false);
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(tf, btn, lbl);
	}

	public TextField getTf() {
		return tf;
	}

	public Button getBtn() {
		return btn;
	}

	public Label getLbl() {
		return lbl;
	}
	
}

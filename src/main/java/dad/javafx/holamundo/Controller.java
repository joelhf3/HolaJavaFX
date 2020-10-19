package dad.javafx.holamundo;

import javafx.event.ActionEvent;

public class Controller {

	private View view = new View();
	private Model model = new Model();
	
	public Controller() {
		
		
		model.nombreProperty().bind(view.getTf().textProperty());
		
		view.getLbl().textProperty().bind(model.saludoProperty());
		
		view.getBtn().setOnAction(e -> click(e));
		
		model.setSaludo("Aquí va a salir un saludo");
		
	}

	private void click(ActionEvent e) {	
		model.setSaludo("¡Hola " + model.getNombre() + "!");
		view.getLbl().setStyle("-fx-text-fill: #5566ff; -fx-font: bold 50 consolas;");
	}

	public View getView() {
		return view;
	}

	public Model getModel() {
		return model;
	}
	
}

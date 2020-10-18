package dad.javafx.holamundo;

import javafx.event.ActionEvent;

public class Controller {

	private View view = new View();
	private Model model = new Model();
	
	public Controller() {
		
		
		view.getTf().textProperty().bindBidirectional(view.getLbl().textProperty());
		
		view.getLbl().textProperty().bindBidirectional(model.valorProperty());
		
		view.getBtn().setOnAction(e -> click(e));
		
	}

	private void click(ActionEvent e) {	
		model.setValor("Hola " + model.getValor());
	}

	public View getView() {
		return view;
	}

	public Model getModel() {
		return model;
	}
	
}

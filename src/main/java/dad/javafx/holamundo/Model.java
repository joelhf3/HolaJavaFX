package dad.javafx.holamundo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

	private StringProperty valor = new SimpleStringProperty();

	public final StringProperty valorProperty() {
		return this.valor;
	}
	

	public final String getValor() {
		return this.valorProperty().get();
	}
	

	public final void setValor(final String valor) {
		this.valorProperty().set(valor);
	}
	
}

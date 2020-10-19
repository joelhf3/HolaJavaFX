package dad.javafx.holamundo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

	private StringProperty nombre = new SimpleStringProperty();
	private StringProperty saludo = new SimpleStringProperty();

	public final StringProperty nombreProperty() {
		return this.nombre;
	}

	public final String getNombre() {
		return this.nombreProperty().get();
	}

	public final void setNombre(final String nombre) {
		this.nombreProperty().set(nombre);
	}

	public final StringProperty saludoProperty() {
		return this.saludo;
	}

	public final String getSaludo() {
		return this.saludoProperty().get();
	}

	public final void setSaludo(final String saludo) {
		this.saludoProperty().set(saludo);
	}

}

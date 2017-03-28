package controlador;

import vista.articulo.GestionArticulo;
import vista.articulo.NuevoArticulo;

public class ControladorArticulo {

	private GestionArticulo gestionArticulo;
	private NuevoArticulo nuevoArticulo;

	// Getters y Setters
	public GestionArticulo getGestionArticulo() {
		return gestionArticulo;
	}

	public void setGestionArticulo(GestionArticulo gestionArticulo) {
		this.gestionArticulo = gestionArticulo;
	}

	public NuevoArticulo getNuevoArticulo() {
		return nuevoArticulo;
	}

	public void setNuevoArticulo(NuevoArticulo nuevoArticulo) {
		this.nuevoArticulo = nuevoArticulo;
	}

	public void abrirGestionArticulo() {

		gestionArticulo.setVisible(true);

	}

	public void abrirNuevoArticulo() {

		nuevoArticulo.setVisible(true);

	}

}

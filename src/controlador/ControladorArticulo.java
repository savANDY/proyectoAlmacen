package controlador;

import vista.articulo.GestionArticulo;

public class ControladorArticulo {
	
	private GestionArticulo gestionArticulo;
	
	
	// Getters y Setters
	public GestionArticulo getGestionArticulo() {
		return gestionArticulo;
	}



	public void setGestionArticulo(GestionArticulo gestionArticulo) {
		this.gestionArticulo = gestionArticulo;
	}



	public void abrirGestionArticulo() {
		
		gestionArticulo.setVisible(true);
		
	}
	
}

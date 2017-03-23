package controlador;

import vista.cliente.*;

public class ControladorCliente {

	private GestionCliente gestionCliente;

	// Constructor vacio
	public ControladorCliente() {
		super();
	}

	// Getters y Setters
	public GestionCliente getGestionCliente() {
		return gestionCliente;
	}

	public void setGestionCliente(GestionCliente gestionCliente) {
		this.gestionCliente = gestionCliente;
	}
	
	// Funciones
	
	public void abrirGestionCliente() {
		
		gestionCliente.setVisible(true);
		
	}
	
	
}

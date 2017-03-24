package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;
import vista.cliente.*;

public class ControladorCliente {

	private GestionCliente gestionCliente;
	private VerClientes verClientes;
	private ModeloCliente modeloCliente;

	// Constructor vacio
	public ControladorCliente() {
		super();
	}

	// Getters y Setters
	
	public VerClientes getVerClientes() {
		return verClientes;
	}

	public void setVerClientes(VerClientes verClientes) {
		this.verClientes = verClientes;
	}
	
	public GestionCliente getGestionCliente() {
		return gestionCliente;
	}

	public void setGestionCliente(GestionCliente gestionCliente) {
		this.gestionCliente = gestionCliente;
	}

	public ModeloCliente getModeloCliente() {
		return modeloCliente;
	}

	public void setModeloCliente(ModeloCliente modeloCliente) {
		this.modeloCliente = modeloCliente;
	}

	// Funciones

	public void abrirGestionCliente() {

		gestionCliente.setVisible(true);

	}

	public void abrirVerClientes() {

		ArrayList<Cliente> clientes;

		try {
			
			clientes = modeloCliente.seleccionarTodos();
			verClientes.rellenarTabla(clientes);

			verClientes.setVisible(true);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR AL SELECCIONAR CLIENTES");
//			e.printStackTrace();
//			e.getMessage();
		}
	}

}

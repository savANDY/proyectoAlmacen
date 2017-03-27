package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;
import vista.cliente.*;

public class ControladorCliente {

	private GestionCliente gestionCliente;
	private VerClientes verClientes;
	private NuevoCliente nuevoCliente;
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

	public NuevoCliente getNuevoCliente() {
		return nuevoCliente;
	}

	public void setNuevoCliente(NuevoCliente nuevoCliente) {
		this.nuevoCliente = nuevoCliente;
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
			// e.printStackTrace();
			// e.getMessage();
		}
	}

	public void abrirNuevoCliente() {

		nuevoCliente.setVisible(true);

	}

	public void insertarCliente(String id, String nombre, String direccion, String codPostal, String telefono) {

		Cliente cliente = new Cliente();

		cliente.setId(id);
		cliente.setNombre(nombre);
		cliente.setDireccion(direccion);
		cliente.setCodPostal(codPostal);
		cliente.setTelefono(telefono);

		try {
			modeloCliente.insertar(cliente);
			
			JOptionPane.showMessageDialog(null, "CLIENTE INSERTADO EN LA BD");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR CLIENTE");
			//e.printStackTrace();
		}
		
		
		
	}

}

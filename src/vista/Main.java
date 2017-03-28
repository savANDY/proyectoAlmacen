package vista;

import controlador.*;
import modelo.*;
import vista.*;
import vista.articulo.*;
import vista.cliente.*;

public class Main {

	public static void main(String[] args) {

		// Crear controladores como variables locales del main

		ControladorCliente controladorCliente = new ControladorCliente();
		ControladorDetallesPedido controladorDetallesPedido = new ControladorDetallesPedido();
		ControladorPedido controladorPedido = new ControladorPedido();
		ControladorArticulo controladorArticulo = new ControladorArticulo();

		ModeloArticulo modeloArticulo = new ModeloArticulo();
		ModeloCliente modeloCliente = new ModeloCliente();
		ModeloDetallesPedido modeloDetallesPedido = new ModeloDetallesPedido();
		ModeloPedido modeloPedido = new ModeloPedido();

		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
		ventanaPrincipal.setControladorCliente(controladorCliente);
		ventanaPrincipal.setControladorDetallesPedido(controladorDetallesPedido);
		ventanaPrincipal.setControladorPedido(controladorPedido);
		ventanaPrincipal.setControladorArticulo(controladorArticulo);

		// CLIENTE

		// Crear ventanas como variables locales del main
		GestionCliente gestionCliente = new GestionCliente(ventanaPrincipal, true);
		gestionCliente.setControladorCliente(controladorCliente);
		

		VerClientes verClientes = new VerClientes(gestionCliente, true);
		verClientes.setControladorCliente(controladorCliente);
		
		NuevoCliente nuevoCliente = new NuevoCliente(gestionCliente, true);
		nuevoCliente.setControladorCliente(controladorCliente);
		
		controladorCliente.setGestionCliente(gestionCliente);
		controladorCliente.setModeloCliente(modeloCliente);
		controladorCliente.setVerClientes(verClientes);
		controladorCliente.setNuevoCliente(nuevoCliente);
		
		// ARTICULO
		
		GestionArticulo gestionArticulo = new GestionArticulo(ventanaPrincipal, true);
		gestionArticulo.setControladorArticulo(controladorArticulo);
		
		NuevoArticulo nuevoArticulo = new NuevoArticulo(gestionArticulo, true);
		nuevoArticulo.setControladorArticulo(controladorArticulo);
		
		controladorArticulo.setGestionArticulo(gestionArticulo);
		controladorArticulo.setNuevoArticulo(nuevoArticulo);
		
		
		

		// Abrir la ventana principal
		ventanaPrincipal.setVisible(true);

	}

}

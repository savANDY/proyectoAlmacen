package vista;

import controlador.*;
import modelo.*;
import vista.cliente.*;

public class Main {

	public static void main(String[] args) {
		
		// Crear controladores como variables locales del main

				ControladorCliente controladorCliente = new ControladorCliente();
				ControladorDetallesPedido controladorDetallesPedido = new ControladorDetallesPedido();
				ControladorPedido controladorPedido = new ControladorPedido();
				ControladorArticulo controladorProducto = new ControladorArticulo();

				ModeloCliente modeloCliente = new ModeloCliente();
				ModeloDetallesPedido modeloDetallesPedido = new ModeloDetallesPedido();
				ModeloPedido modeloPedido = new ModeloPedido();

				VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
				ventanaPrincipal.setControladorCliente(controladorCliente);
				ventanaPrincipal.setControladorDetallesPedido(controladorDetallesPedido);
				ventanaPrincipal.setControladorPedido(controladorPedido);
				ventanaPrincipal.setControladorProducto(controladorProducto);

				// CLIENTE
				
				// Crear ventanas como variables locales del main
				GestionCliente gestionCliente = new GestionCliente(ventanaPrincipal, true);
				gestionCliente.setControladorCliente(controladorCliente);
				controladorCliente.setGestionCliente(gestionCliente);
				
				VerClientes verClientes = new VerClientes(gestionCliente, true);
				controladorCliente.setVerClientes(verClientes);
				//abrir la ventana principal
				ventanaPrincipal.setVisible(true);
				
	}

}

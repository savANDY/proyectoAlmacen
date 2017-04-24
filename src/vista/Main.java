package vista;

import javax.swing.UIManager;

import controlador.*;
import modelo.*;
import vista.articulo.*;
import vista.cliente.*;
import vista.pedido.GestionPedido;
import vista.pedido.VerPedidos;

public class Main {

	public static void main(String[] args) {
		
//		para usar otro tema: "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
//		 try 
//		    { 
//		        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
//		    } 
//		    catch(Exception e){ 
//		    }

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
		ventanaPrincipal.setControladorArticulo(controladorArticulo);
		ventanaPrincipal.setControladorDetallesPedido(controladorDetallesPedido);
		ventanaPrincipal.setControladorPedido(controladorPedido);
		

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
		
		VerArticulos verArticulos = new VerArticulos(gestionArticulo, true);
		verArticulos.setControladorArticulo(controladorArticulo);
		
		NuevoArticulo nuevoArticulo = new NuevoArticulo(gestionArticulo, true);
		nuevoArticulo.setControladorArticulo(controladorArticulo);
		
		ModificarArticulo modificarArticulo = new ModificarArticulo(gestionArticulo, true);
		modificarArticulo.setControladorArticulo(controladorArticulo);
		
		BorrarArticulo borrarArticulo = new BorrarArticulo(gestionArticulo, true);
		borrarArticulo.setControladorArticulo(controladorArticulo);
		
		controladorArticulo.setGestionArticulo(gestionArticulo);
		controladorArticulo.setModeloArticulo(modeloArticulo);
		controladorArticulo.setVerArticulos(verArticulos);
		controladorArticulo.setNuevoArticulo(nuevoArticulo);
		controladorArticulo.setModificarArticulo(modificarArticulo);
		controladorArticulo.setBorrarArticulo(borrarArticulo);
		
		// PEDIDOS
		GestionPedido gestionPedido = new GestionPedido(ventanaPrincipal, true);
		gestionPedido.setControladorPedido(controladorPedido);
		
		VerPedidos verPedidos = new VerPedidos(gestionPedido, true);
		verPedidos.setControladorPedido(controladorPedido);
		
		
		controladorPedido.setGestionPedido(gestionPedido);
		controladorPedido.setModeloPedido(modeloPedido);
		controladorPedido.setVerPedidos(verPedidos);
		
		
		

		// Abrir la ventana principal
		ventanaPrincipal.setVisible(true);

	}

}

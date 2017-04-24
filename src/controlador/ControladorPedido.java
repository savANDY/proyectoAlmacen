package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Articulo;
import modelo.ModeloPedido;
import modelo.Pedido;
import vista.pedido.GestionPedido;
import vista.pedido.VerPedidos;

public class ControladorPedido {
	
	private VerPedidos verPedidos;
	private GestionPedido gestionPedido;
	private ModeloPedido modeloPedido;
	
	
	//Getters y Setters
	
	public GestionPedido getGestionPedido() {
		return gestionPedido;
	}

	public void setGestionPedido(GestionPedido gestionPedido) {
		this.gestionPedido = gestionPedido;
	}
	
	public VerPedidos getVerPedidos() {
		return verPedidos;
	}

	public void setVerPedidos(VerPedidos verPedidos) {
		this.verPedidos = verPedidos;
	}
	
	public ModeloPedido getModeloPedido() {
		return modeloPedido;
	}

	public void setModeloPedido(ModeloPedido modeloPedido) {
		this.modeloPedido = modeloPedido;
	}

	public void abrirVerPedidos() {
		
		ArrayList<Pedido> pedidos;

		try {

			pedidos = modeloPedido.seleccionarTodos();
			verPedidos.rellenarTabla(pedidos);

			verPedidos.setVisible(true);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR AL SELECCIONAR PEDIDOS");
			e.printStackTrace();
			// e.getMessage();
		}
		
	}

	public void abrirGestionPedido() {
		
		gestionPedido.setVisible(true);
		
	}
}

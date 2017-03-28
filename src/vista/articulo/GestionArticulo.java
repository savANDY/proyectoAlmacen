package vista.articulo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.*;
import vista.VentanaPrincipal;

public class GestionArticulo extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private ControladorArticulo controladorProducto;

	// Getters y Setters
	public ControladorArticulo getControladorProducto() {
		return controladorProducto;
	}

	public void setControladorArticulo(ControladorArticulo controladorProducto) {
		this.controladorProducto = controladorProducto;
	}

	/**
	 * Create the dialog.
	 */
	public GestionArticulo(VentanaPrincipal parent, boolean modal) {

		super(parent, modal);
		setTitle("Gestion de Productos");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnVerProductos = new JButton("Ver productos");
		btnVerProductos.setBounds(73, 53, 111, 23);
		contentPanel.add(btnVerProductos);
		
		JButton btnNuevoProducto = new JButton("Nuevo producto");
		btnNuevoProducto.setBounds(73, 87, 111, 23);
		contentPanel.add(btnNuevoProducto);
	}

}

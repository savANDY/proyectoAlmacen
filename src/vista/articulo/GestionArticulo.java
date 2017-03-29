package vista.articulo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.*;
import vista.VentanaPrincipal;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionArticulo extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private ControladorArticulo controladorArticulo;

	// Getters y Setters
	public ControladorArticulo getControladorProducto() {
		return controladorArticulo;
	}

	public void setControladorArticulo(ControladorArticulo controladorProducto) {
		this.controladorArticulo = controladorProducto;
	}

	/**
	 * Create the dialog.
	 */
	public GestionArticulo(VentanaPrincipal parent, boolean modal) {

		super(parent, modal);
		setTitle("Gestion de Articulos");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnVerProductos = new JButton("Ver articulos");
		btnVerProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controladorArticulo.abrirVerArticulos();
				
			}
		});
		btnVerProductos.setBounds(73, 53, 136, 23);
		contentPanel.add(btnVerProductos);
		
		JButton btnNuevoProducto = new JButton("Nuevo articulo");
		btnNuevoProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controladorArticulo.abrirNuevoArticulo();
				
			}
		});
		btnNuevoProducto.setBounds(73, 87, 136, 23);
		contentPanel.add(btnNuevoProducto);
		
		JButton btnModificarArticulo = new JButton("Modificar articulo");
		btnModificarArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controladorArticulo.abrirModificarArticulo();
				
			}
		});
		btnModificarArticulo.setBounds(73, 121, 136, 23);
		contentPanel.add(btnModificarArticulo);
	}
}

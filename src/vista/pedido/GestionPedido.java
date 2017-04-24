package vista.pedido;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.*;
import vista.VentanaPrincipal;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class GestionPedido extends JDialog {

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
	public GestionPedido(VentanaPrincipal parent, boolean modal) {

		super(parent, modal);
		setTitle("Gestion de Articulos");
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(225, 47, 180, 160);
		panel.setBorder(BorderFactory.createTitledBorder("Elige una opción"));
		contentPanel.add(panel);
		
		JButton btnVerProductos = new JButton("Ver articulos");
		
		JButton btnNuevoProducto = new JButton("Nuevo articulo");
		
		JButton btnModificarArticulo = new JButton("Modificar articulo");
		
		JButton btnBorrarArticulo = new JButton("Borrar articulo");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnVerProductos, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
						.addComponent(btnNuevoProducto, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnModificarArticulo, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
						.addComponent(btnBorrarArticulo, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(4)
					.addComponent(btnVerProductos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNuevoProducto)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnModificarArticulo)
					.addGap(5)
					.addComponent(btnBorrarArticulo)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		btnBorrarArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controladorArticulo.abrirBorrarArticulo();
				
			}
		});
		btnModificarArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controladorArticulo.abrirModificarArticulo();
				
			}
		});
		btnNuevoProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controladorArticulo.abrirNuevoArticulo();
				
			}
		});
		btnVerProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controladorArticulo.abrirVerArticulos();
				
			}
		});
	}
}

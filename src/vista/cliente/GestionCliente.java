package vista.cliente;

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

public class GestionCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private ControladorCliente controladorCliente;

	// Getters y Setters
	public ControladorCliente getControladorCliente() {
		return controladorCliente;
	}

	public void setControladorCliente(ControladorCliente controladorCliente) {
		this.controladorCliente = controladorCliente;
	}

	/**
	 * Create the dialog.
	 */
	public GestionCliente(VentanaPrincipal parent, boolean modal) {

		super(parent, modal);
		setTitle("Gestion de Clientes");
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(parent);;
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnVerClientes = new JButton("Ver clientes");
		btnVerClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				controladorCliente.abrirVerClientes();
				
			}
		});
		btnVerClientes.setBounds(40, 50, 117, 27);
		contentPanel.add(btnVerClientes);
	}
}

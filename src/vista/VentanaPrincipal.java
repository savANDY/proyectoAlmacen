package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.*;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	private ControladorCliente controladorCliente;
	private ControladorDetallesPedido controladorDetallesPedido;
	private ControladorPedido controladorPedido;
	private ControladorArticulo controladorArticulo;
	private final JLabel label = new JLabel("BackGround");

	// Getters y Setters
	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public ControladorCliente getControladorCliente() {
		return controladorCliente;
	}

	public void setControladorCliente(ControladorCliente controladorCliente) {
		this.controladorCliente = controladorCliente;
	}

	public ControladorDetallesPedido getControladorDetallesPedido() {
		return controladorDetallesPedido;
	}

	public void setControladorDetallesPedido(ControladorDetallesPedido controladorDetallesPedido) {
		this.controladorDetallesPedido = controladorDetallesPedido;
	}

	public ControladorPedido getControladorPedido() {
		return controladorPedido;
	}

	public void setControladorPedido(ControladorPedido controladorPedido) {
		this.controladorPedido = controladorPedido;
	}
	
	public ControladorArticulo getControladorArticulo() {
		return controladorArticulo;
	}

	public void setControladorArticulo(ControladorArticulo controladorArticulo) {
		this.controladorArticulo = controladorArticulo;
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("Gesti\u00F3n Almac\u00E9n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setBounds(80, 52, 115, 115);
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				controladorCliente.abrirGestionCliente();
				
			}
		});
		
		JButton btnPedidos = new JButton("Pedidos");
		btnPedidos.setBounds(80, 177, 115, 115);
		
		JButton btnDetallespedidos = new JButton("DetallesPedidos");
		btnDetallespedidos.setBounds(205, 177, 115, 115);
		btnDetallespedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnProductos = new JButton("Productos");
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controladorArticulo.abrirGestionArticulo();
				
			}
		});
		btnProductos.setBounds(205, 303, 115, 115);
		getContentPane().setLayout(null);
		getContentPane().add(btnClientes);
		getContentPane().add(btnPedidos);
		getContentPane().add(btnProductos);
		getContentPane().add(btnDetallespedidos);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/Clientes.png")));
		label_1.setBounds(205, 52, 115, 115);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/Productos.png")));
		label_2.setBounds(80, 303, 115, 115);
		getContentPane().add(label_2);
		label.setBounds(0, 0, 400, 500);
		label.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/DarkBlueBackground.jpg")));
		getContentPane().add(label);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}

package vista.pedido;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import controlador.ControladorArticulo;
import controlador.ControladorCliente;
import controlador.ControladorPedido;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import vista.VentanaPrincipal;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.Color;

public class VerPedidos extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private ControladorPedido controladorPedido;
	private JTable tabla;

	
	// Getters y Setters
	
	public ControladorPedido getControladorPedido() {
		return controladorPedido;
	}

	public void setControladorPedido(ControladorPedido controladorPedido) {
		this.controladorPedido = controladorPedido;
	}

	/**
	 * Create the dialog.
	 */
	public VerPedidos(GestionPedido parent, boolean modal) {

		super(parent, modal);
		setTitle("Todos los pedidos");
		{
			setBounds(100, 100, 800, 480);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
		}
		contentPanel.setLayout(null);

		// Texto "Articulos: "
		JTextPane txtpnClientes = new JTextPane();
		txtpnClientes.setEditable(false);
		txtpnClientes.setText("Pedidos:");
		txtpnClientes.setBounds(31, 24, 77, 20);
		txtpnClientes.setOpaque(false);
		contentPanel.add(txtpnClientes);

		JSeparator separator = new JSeparator();
		separator.setBounds(30, 47, 350, 2);
		contentPanel.add(separator);

		// Tabla información Clientes
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(30, 60, 350, 180);
		contentPanel.add(scrollPane_1);

		tabla = new JTable();
		tabla.setSelectionBackground(new Color(255, 204, 153));
		tabla.setModel(new DefaultTableModel(new Object[][] {}, new String[] {}));
		
		scrollPane_1.setViewportView(tabla);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(413, 60, 350, 180);
		contentPanel.add(scrollPane);
		
		JTextPane txtpnDetalles = new JTextPane();
		txtpnDetalles.setText("Detalles:");
		txtpnDetalles.setOpaque(false);
		txtpnDetalles.setEditable(false);
		txtpnDetalles.setBounds(414, 24, 77, 20);
		contentPanel.add(txtpnDetalles);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(413, 47, 350, 2);
		contentPanel.add(separator_1);
		
	}

	public void rellenarTabla(ArrayList<Pedido> pedidos) {
		// cargar la tabla
		DefaultTableModel dtm = new DefaultTableModel();

		String[] encabezados = { "ID Pedido", "ID Cliente", "Fecha", "Cod. Postal" };

		dtm.setColumnIdentifiers(encabezados);
		for (Pedido pedido : pedidos) {
			String[] fila = { String.valueOf(pedido.getId()), pedido.getIdCliente(), String.valueOf(pedido.getFecha()), pedido.getCodPostal() };
			dtm.addRow(fila);
		}
		tabla.setModel(dtm);
		TableRowSorter<DefaultTableModel> modeloOrdenado = new TableRowSorter<DefaultTableModel>(dtm);
		tabla.setRowSorter(modeloOrdenado);
	}	
}

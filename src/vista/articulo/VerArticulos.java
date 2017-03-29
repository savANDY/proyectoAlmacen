package vista.articulo;

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
import modelo.Articulo;
import modelo.Cliente;
import vista.VentanaPrincipal;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.Color;

public class VerArticulos extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private ControladorArticulo controladorArticulo;
	private JTable tabla;

	/**
	 * Create the dialog.
	 */
	public VerArticulos(GestionArticulo parent, boolean modal) {

		super(parent, modal);
		setTitle("Todos los articulos");
		{
			setBounds(100, 100, 600, 300);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
		}
		contentPanel.setLayout(null);

		// Texto "Articulos: "
		JTextPane txtpnClientes = new JTextPane();
		txtpnClientes.setEditable(false);
		txtpnClientes.setText("Articulos:");
		txtpnClientes.setBounds(31, 24, 77, 20);
		txtpnClientes.setOpaque(false);
		contentPanel.add(txtpnClientes);

		JSeparator separator = new JSeparator();
		separator.setBounds(30, 47, 520, 2);
		contentPanel.add(separator);

		// Tabla información Clientes
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(30, 60, 520, 180);
		contentPanel.add(scrollPane_1);

		tabla = new JTable();
		tabla.setSelectionBackground(new Color(255, 204, 153));
		tabla.setModel(new DefaultTableModel(new Object[][] {}, new String[] {}));
		
		scrollPane_1.setViewportView(tabla);
		
	}

	public void rellenarTabla(ArrayList<Articulo> articulos) {
		// cargar la tabla
		DefaultTableModel dtm = new DefaultTableModel();

		String[] encabezados = { "ID", "NOMBRE", "PROVEEDOR", "PRECIO", "EXISTENCIAS" };

		dtm.setColumnIdentifiers(encabezados);
		for (Articulo articulo : articulos) {
			String[] fila = { String.valueOf(articulo.getId()), articulo.getNombre(), articulo.getProveedor(), String.valueOf(articulo.getPrecio()),
					String.valueOf(articulo.getExistencias()) };
			dtm.addRow(fila);
		}
		tabla.setModel(dtm);
		TableRowSorter<DefaultTableModel> modeloOrdenado = new TableRowSorter<DefaultTableModel>(dtm);
		tabla.setRowSorter(modeloOrdenado);
	}

	public ControladorArticulo getControladorArticulo() {
		return controladorArticulo;
	}

	public void setControladorArticulo(ControladorArticulo controladorArticulo) {
		this.controladorArticulo = controladorArticulo;
	}

	
}

package vista.cliente;

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

import controlador.ControladorCliente;
import modelo.Cliente;
import vista.VentanaPrincipal;

public class VerClientes extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private ControladorCliente controladorCliente;
	private JTable tabla;

	/**
	 * Create the dialog.
	 */
	public VerClientes(GestionCliente parent, boolean modal) {

		super(parent, modal);
		{
			setBounds(100, 100, 450, 300);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
		}
		contentPanel.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(34, 61, 359, 178);
		contentPanel.add(scrollPane_1);

		tabla = new JTable();
		tabla.setModel(new DefaultTableModel(new Object[][] {}, new String[] {}));
		scrollPane_1.setViewportView(tabla);

	}

	public void rellenarTabla(ArrayList<Cliente> clientes) {
		// cargar la tabla
		DefaultTableModel dtm = new DefaultTableModel();

		String[] encabezados = { "TITULO", "AUTOR", "NUM PAGINAS" };

		dtm.setColumnIdentifiers(encabezados);
		for (Cliente cliente : clientes) {
			String[] fila = { cliente.getNombre(), cliente.getDireccion(), cliente.getCodPostal(),
					cliente.getTelefono() };
			dtm.addRow(fila);
		}
		tabla.setModel(dtm);
		TableRowSorter<DefaultTableModel> modeloOrdenado = new TableRowSorter<DefaultTableModel>(dtm);
		tabla.setRowSorter(modeloOrdenado);
	}
}

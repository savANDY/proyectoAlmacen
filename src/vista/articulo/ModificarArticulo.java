package vista.articulo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorArticulo;
import modelo.Articulo;

import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class ModificarArticulo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField id;
	private JTextField nombre;
	private JTextField proveedor;
	private JTextField existencias;
	private JTextField precio;

	private ControladorArticulo controladorArticulo;
	private JComboBox comboBoxArticulos;

	// Getters y Setters
	public ControladorArticulo getControladorArticulo() {
		return controladorArticulo;
	}

	public void setControladorArticulo(ControladorArticulo controladorArticulo) {
		this.controladorArticulo = controladorArticulo;
	}

	/**
	 * Create the dialog.
	 */
	public ModificarArticulo(GestionArticulo parent, boolean modal) {

		super(parent, modal);
		setTitle("Modificar Articulo");
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		comboBoxArticulos = new JComboBox();
		comboBoxArticulos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nombreArticulo = (String) comboBoxArticulos.getSelectedItem();
				String nombreDefault = "Selecciona un artículo...";
				if ((nombreArticulo != null) && (!nombreArticulo.equals(nombreDefault))) {
					String[] partes = nombreArticulo.split(":");
					// en la parte 0 esta el id del socio

					controladorArticulo.rellenarModificarArticulo(Integer.parseInt(partes[0]));
				}

			}
		});
		comboBoxArticulos.setModel(new DefaultComboBoxModel(new String[] { "Selecciona un art\u00EDculo..." }));
		comboBoxArticulos.setBounds(86, 22, 249, 46);
		contentPanel.add(comboBoxArticulos);

		JTextPane txtpnId = new JTextPane();
		txtpnId.setEditable(false);
		txtpnId.setText("Id:");
		txtpnId.setOpaque(false);
		txtpnId.setBounds(33, 103, 29, 20);
		contentPanel.add(txtpnId);
		{
			JTextPane txtpnNombre = new JTextPane();
			txtpnNombre.setEditable(false);
			txtpnNombre.setText("Nombre:");
			txtpnNombre.setOpaque(false);
			txtpnNombre.setBounds(33, 134, 55, 20);
			contentPanel.add(txtpnNombre);
		}

		id = new JTextField();
		id.setEditable(false);
		id.setBounds(106, 103, 50, 20);
		contentPanel.add(id);
		id.setColumns(10);

		nombre = new JTextField();
		nombre.setColumns(10);
		nombre.setBounds(106, 134, 283, 20);
		contentPanel.add(nombre);

		JTextPane txtpnProveedor = new JTextPane();
		txtpnProveedor.setEditable(false);
		txtpnProveedor.setText("Proveedor:");
		txtpnProveedor.setOpaque(false);
		txtpnProveedor.setBounds(33, 165, 63, 20);
		contentPanel.add(txtpnProveedor);

		proveedor = new JTextField();
		proveedor.setColumns(10);
		proveedor.setBounds(106, 165, 167, 20);
		contentPanel.add(proveedor);

		JTextPane txtpnPrecio = new JTextPane();
		txtpnPrecio.setEditable(false);
		txtpnPrecio.setText("Precio:");
		txtpnPrecio.setOpaque(false);
		txtpnPrecio.setBounds(166, 103, 50, 20);
		contentPanel.add(txtpnPrecio);

		existencias = new JTextField();
		existencias.setColumns(10);
		existencias.setBounds(349, 103, 40, 20);
		contentPanel.add(existencias);

		precio = new JTextField();
		precio.setColumns(10);
		precio.setBounds(226, 103, 40, 20);
		contentPanel.add(precio);

		JTextPane txtpnExistencias = new JTextPane();
		txtpnExistencias.setEditable(false);
		txtpnExistencias.setText("Existencias:");
		txtpnExistencias.setOpaque(false);
		txtpnExistencias.setBounds(276, 103, 63, 20);
		contentPanel.add(txtpnExistencias);

		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				limpiarCampos();
				controladorArticulo.rellenarComboArticulos();
			}
		});
		btnLimpiar.setBounds(291, 165, 98, 23);
		contentPanel.add(btnLimpiar);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						modificacion();

					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						limpiarCampos();
						setVisible(false);

					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	protected void modificacion() {

		controladorArticulo.modificarArticulo(Integer.parseInt(this.id.getText()), this.nombre.getText(),
				this.proveedor.getText(), this.precio.getText(), this.existencias.getText());

	}

	protected void limpiarCampos() {

		this.comboBoxArticulos.removeAllItems();
		comboBoxArticulos.setModel(new DefaultComboBoxModel(new String[] { "Selecciona un art\u00EDculo..." }));
		this.id.setText("");
		this.nombre.setText("");
		this.proveedor.setText("");
		this.precio.setText("");
		this.existencias.setText("");
		

	}

	public void rellenarCampos(Articulo articulo) {

		this.id.setText(String.valueOf(articulo.getId()));
		this.nombre.setText(articulo.getNombre());
		this.proveedor.setText(articulo.getProveedor());
		this.precio.setText(String.valueOf(articulo.getPrecio()));
		this.existencias.setText(String.valueOf(articulo.getExistencias()));

	}

	public void rellenarComboArticulos(ArrayList<Articulo> articulos) {

		Iterator<Articulo> iterator = articulos.iterator();
		while (iterator.hasNext()) {
			Articulo articulo = iterator.next();
			this.comboBoxArticulos
					.addItem(articulo.getId() + ": " + articulo.getNombre() + " " + articulo.getProveedor());
		}

	}
}

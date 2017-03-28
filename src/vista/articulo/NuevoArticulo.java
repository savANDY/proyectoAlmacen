package vista.articulo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorArticulo;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoArticulo extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private JTextField textoId;
	private JTextField textoNombre;
	private JTextField textoProveedor;
	private JTextField textoPrecio;
	private JTextField textoExistencias;

	private ControladorArticulo controladorArticulo;

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
	public NuevoArticulo(GestionArticulo parent, boolean modal) {

		super(parent, modal);
		setTitle("Nuevo Articulo");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JTextPane textPane = new JTextPane();
		textPane.setText("Id");
		textPane.setOpaque(false);
		textPane.setEditable(false);
		textPane.setBounds(139, 43, 67, 20);
		contentPanel.add(textPane);

		JTextPane txtpnNombre = new JTextPane();
		txtpnNombre.setText("Nombre");
		txtpnNombre.setOpaque(false);
		txtpnNombre.setEditable(false);
		txtpnNombre.setBounds(139, 74, 67, 20);
		contentPanel.add(txtpnNombre);

		JTextPane txtpnProveedor = new JTextPane();
		txtpnProveedor.setText("Proveedor");
		txtpnProveedor.setOpaque(false);
		txtpnProveedor.setEditable(false);
		txtpnProveedor.setBounds(139, 105, 67, 20);
		contentPanel.add(txtpnProveedor);

		JTextPane txtpnPrecio = new JTextPane();
		txtpnPrecio.setText("Precio");
		txtpnPrecio.setOpaque(false);
		txtpnPrecio.setEditable(false);
		txtpnPrecio.setBounds(139, 136, 67, 20);
		contentPanel.add(txtpnPrecio);

		JTextPane txtpnExistencias = new JTextPane();
		txtpnExistencias.setText("Existencias");
		txtpnExistencias.setOpaque(false);
		txtpnExistencias.setEditable(false);
		txtpnExistencias.setBounds(139, 167, 67, 20);
		contentPanel.add(txtpnExistencias);

		textoId = new JTextField();
		textoId.setBounds(216, 43, 86, 20);
		contentPanel.add(textoId);
		textoId.setColumns(10);

		textoNombre = new JTextField();
		textoNombre.setColumns(10);
		textoNombre.setBounds(216, 74, 86, 20);
		contentPanel.add(textoNombre);

		textoProveedor = new JTextField();
		textoProveedor.setColumns(10);
		textoProveedor.setBounds(216, 105, 86, 20);
		contentPanel.add(textoProveedor);

		textoPrecio = new JTextField();
		textoPrecio.setColumns(10);
		textoPrecio.setBounds(216, 136, 86, 20);
		contentPanel.add(textoPrecio);

		textoExistencias = new JTextField();
		textoExistencias.setColumns(10);
		textoExistencias.setBounds(216, 167, 86, 20);
		contentPanel.add(textoExistencias);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						System.out.println("Boton OK clickeado");
						
						controladorArticulo.insertarArticulo(Integer.parseInt(textoId.getText()), textoNombre.getText(),
								textoProveedor.getText(), Double.parseDouble(textoPrecio.getText().toString()),
								Integer.parseInt(textoExistencias.getText()));

					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

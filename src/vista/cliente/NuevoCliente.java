package vista.cliente;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorCliente;
import modelo.Cliente;
import vista.VentanaPrincipal;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class NuevoCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textoId;
	private JTextField textoNombre;
	private JTextField textoDireccion;
	private JTextField textoCodPostal;
	private JTextField textoTelefono;


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
	public NuevoCliente(GestionCliente parent, boolean modal) {

		super(parent, modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
				textoId = new JTextField();
				textoId.setColumns(10);
				textoId.setBounds(214, 39, 86, 20);
				contentPanel.add(textoId);

		textoNombre = new JTextField();
		textoNombre.setBounds(214, 70, 86, 20);
		contentPanel.add(textoNombre);
		textoNombre.setColumns(10);

		textoDireccion = new JTextField();
		textoDireccion.setColumns(10);
		textoDireccion.setBounds(214, 101, 86, 20);
		contentPanel.add(textoDireccion);

		textoCodPostal = new JTextField();
		textoCodPostal.setColumns(10);
		textoCodPostal.setBounds(214, 132, 86, 20);
		contentPanel.add(textoCodPostal);

		textoTelefono = new JTextField();
		textoTelefono.setColumns(10);
		textoTelefono.setBounds(214, 163, 86, 20);
		contentPanel.add(textoTelefono);
		
				JTextPane txtpnId = new JTextPane();
				txtpnId.setEditable(false);
				txtpnId.setText("Id");
				txtpnId.setOpaque(false);
				txtpnId.setBounds(137, 39, 67, 20);
				contentPanel.add(txtpnId);

		JTextPane txtpnNombre = new JTextPane();
		txtpnNombre.setEditable(false);
		txtpnNombre.setText("Nombre");
		txtpnNombre.setBounds(137, 70, 67, 20);
		txtpnNombre.setOpaque(false);
		contentPanel.add(txtpnNombre);

		JTextPane txtpnDireccion = new JTextPane();
		txtpnDireccion.setEditable(false);
		txtpnDireccion.setText("Direccion");
		txtpnDireccion.setOpaque(false);
		txtpnDireccion.setBounds(137, 101, 67, 20);
		contentPanel.add(txtpnDireccion);

		JTextPane txtpnCodPostal = new JTextPane();
		txtpnCodPostal.setEditable(false);
		txtpnCodPostal.setText("Cod postal");
		txtpnCodPostal.setOpaque(false);
		txtpnCodPostal.setBounds(137, 132, 67, 20);
		contentPanel.add(txtpnCodPostal);

		JTextPane txtpnTelefono = new JTextPane();
		txtpnTelefono.setEditable(false);
		txtpnTelefono.setText("Telefono");
		txtpnTelefono.setOpaque(false);
		txtpnTelefono.setBounds(137, 163, 67, 20);
		contentPanel.add(txtpnTelefono);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						controladorCliente.insertarCliente(textoId.getText(), textoNombre.getText(),
								textoDireccion.getText(), textoCodPostal.getText(), textoTelefono.getText());

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

	protected void limpiarCampos() {
		
		textoId.setText("");
		textoNombre.setText("");
		textoDireccion.setText("");
		textoCodPostal.setText("");
		textoTelefono.setText("");
		
	}
}

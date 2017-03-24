package vista.producto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.*;
import vista.VentanaPrincipal;

public class GestionProducto extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private ControladorArticulo controladorProducto;

	// Getters y Setters
	public ControladorArticulo getControladorProducto() {
		return controladorProducto;
	}

	public void setControladorProducto(ControladorArticulo controladorProducto) {
		this.controladorProducto = controladorProducto;
	}

	/**
	 * Create the dialog.
	 */
	public GestionProducto(VentanaPrincipal parent, boolean modal) {

		super(parent, modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
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

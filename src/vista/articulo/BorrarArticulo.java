package vista.articulo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorArticulo;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Panel;
import javax.swing.JEditorPane;
import javax.swing.JLabel;

public class BorrarArticulo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private ControladorArticulo controladorArticulo;
	
	
	public ControladorArticulo getControladorArticulo() {
		return controladorArticulo;
	}


	public void setControladorArticulo(ControladorArticulo controladorArticulo) {
		this.controladorArticulo = controladorArticulo;
	}


	/**
	 * Create the dialog.
	 */
	public BorrarArticulo(GestionArticulo parent, boolean modal) {

		super(parent, modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(57, 99, 232, 97);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setLayout(null);
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(71, 5, 89, 23);
		panel.add(btnNewButton);
		contentPanel.add(panel);
		{
			Panel panel_1 = new Panel();
			panel_1.setBounds(49, 25, 111, 55);
			contentPanel.add(panel_1);
		}
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(212, 25, 144, 55);
		panel_1.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		contentPanel.add(panel_1);
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

package telas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classeNormais.Macaco;

@SuppressWarnings("serial")
public class Comfirma1 extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		Comfirma1 dialog = new Comfirma1();
		dialog.setVisible(true);
	}

	public Comfirma1() {
		setTitle("Confirm");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(600, 300, 264, 140);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JButton btnYes = new JButton("Yes");
		btnYes.setBounds(52, 54, 65, 23);
		contentPanel.add(btnYes);
		getRootPane().setDefaultButton(btnYes);

		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Comfirma2 dialog = new Comfirma2();
				dialog.setVisible(true);
			}
		});

		JButton btnNo = new JButton("No");
		btnNo.setBounds(127, 54, 65, 23);
		contentPanel.add(btnNo);

		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Comfirma2 dialog = new Comfirma2();
				dialog.setVisible(true);
			}
		});

		JLabel lblComfirma1 = new JLabel("O animal que voce pensou " + Macaco.getOqEleFaz() + "?");
		lblComfirma1.setBounds(10, 19, 234, 14);
		contentPanel.add(lblComfirma1);
	}
}
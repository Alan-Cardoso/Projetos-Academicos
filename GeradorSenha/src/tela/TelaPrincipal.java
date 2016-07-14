package tela;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author AlanCardoso
 *
 */
@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtfld_NumeroDeCaracteres;
	private JMenuBar menuBar;
	private JTextField txtfld_SenhaGerada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		TelaPrincipal frame = new TelaPrincipal();
		frame.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbl_NumeroDeCaracteres = new JLabel(
				"Numero de Caracteres a ser Gerado:");
		lbl_NumeroDeCaracteres.setBounds(10, 32, 185, 20);
		contentPane.add(lbl_NumeroDeCaracteres);

		txtfld_NumeroDeCaracteres = new JTextField();
		txtfld_NumeroDeCaracteres.setBounds(10, 58, 95, 20);
		contentPane.add(txtfld_NumeroDeCaracteres);
		txtfld_NumeroDeCaracteres.setColumns(10);

		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 524, 21);
		contentPane.add(menuBar);

		JMenu mnAaaa = new JMenu("aaaa");
		menuBar.add(mnAaaa);

		JMenuItem mntmBbb = new JMenuItem("bbb");
		mnAaaa.add(mntmBbb);

		Checkbox chekbox_Numeros = new Checkbox("N\u00FAmeros");
		chekbox_Numeros.setBounds(10, 84, 95, 22);
		contentPane.add(chekbox_Numeros);

		Checkbox checkbox_LetraMaiuscula = new Checkbox("Letra Maiuscula");
		checkbox_LetraMaiuscula.setBounds(10, 112, 95, 22);
		contentPane.add(checkbox_LetraMaiuscula);

		Checkbox checkbox_LetraMinuscula = new Checkbox("Letra Minuscula");
		checkbox_LetraMinuscula.setBounds(10, 140, 95, 22);
		contentPane.add(checkbox_LetraMinuscula);

		Checkbox checkbox_Simbulos = new Checkbox("Simbulos");
		checkbox_Simbulos.setBounds(10, 168, 95, 22);
		contentPane.add(checkbox_Simbulos);

		Label lbl_SenhaGerada = new Label("Senha Gerada:");
		lbl_SenhaGerada.setBounds(189, 84, 81, 22);
		contentPane.add(lbl_SenhaGerada);

		Button btn_GerarSenha = new Button("Gerar Senha");
		btn_GerarSenha.setBounds(199, 150, 71, 22);
		contentPane.add(btn_GerarSenha);

		txtfld_SenhaGerada = new JTextField();
		txtfld_SenhaGerada.setBounds(189, 112, 185, 20);
		contentPane.add(txtfld_SenhaGerada);
		txtfld_SenhaGerada.setColumns(10);
	}
}

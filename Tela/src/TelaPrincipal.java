import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtCep;
	private JTextField txtRua;
	private JTextField txtBairro;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtNascimento;
	private JTextField txtEmail;
	private JTextField textField_9;
	private JTextField txtCelular;
	private JTextField txtTelefone;
	static int contador = 0;
	Cadastro[] usuario = new Cadastro[5];
	private JTextField txtCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("NOME :");
		lblNome.setBounds(20, 21, 91, 29);
		contentPane.add(lblNome);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(362, 28, 46, 14);
		contentPane.add(lblCpf);

		txtNome = new JTextField();
		txtNome.setBounds(20, 43, 304, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtCpf = new JTextField();
		txtCpf.setBounds(362, 43, 186, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);

		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(292, 199, 63, 14);
		contentPane.add(lblEndereo);

		JLabel lblRua = new JLabel("RUA");
		lblRua.setBounds(20, 392, 46, 14);
		contentPane.add(lblRua);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 21, 618, 2);
		contentPane.add(separator);

		JLabel lblDadosGerais = new JLabel("Dados Gerais");
		lblDadosGerais.setBounds(292, 3, 116, 14);
		contentPane.add(lblDadosGerais);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 224, 618, 2);
		contentPane.add(separator_1);

		txtCep = new JTextField();
		txtCep.setBounds(20, 255, 116, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);

		txtRua = new JTextField();
		txtRua.setBounds(20, 304, 335, 20);
		contentPane.add(txtRua);
		txtRua.setColumns(10);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(20, 237, 46, 14);
		contentPane.add(lblCep);

		JLabel lblRua_1 = new JLabel("RUA:");
		lblRua_1.setBounds(20, 286, 46, 14);
		contentPane.add(lblRua_1);

		txtBairro = new JTextField();
		txtBairro.setBounds(362, 304, 232, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);

		JLabel lblBairro = new JLabel("BAIRRO:");
		lblBairro.setBounds(362, 286, 46, 14);
		contentPane.add(lblBairro);

		txtNumero = new JTextField();
		txtNumero.setBounds(146, 255, 115, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);

		txtComplemento = new JTextField();
		txtComplemento.setBounds(271, 255, 293, 20);
		contentPane.add(txtComplemento);
		txtComplemento.setColumns(10);

		JLabel lblComplemento = new JLabel("COMPLEMENTO:");
		lblComplemento.setBounds(271, 237, 84, 14);
		contentPane.add(lblComplemento);

		JLabel lblNumero = new JLabel("NUMERO:");
		lblNumero.setBounds(146, 237, 63, 14);
		contentPane.add(lblNumero);

		txtNascimento = new JTextField();
		txtNascimento.setBounds(20, 95, 126, 20);
		contentPane.add(txtNascimento);
		txtNascimento.setColumns(10);

		JLabel lblDataDeNascimento = new JLabel("DATA DE NASCIMENTO :");
		lblDataDeNascimento.setBounds(20, 74, 126, 14);
		contentPane.add(lblDataDeNascimento);

		JLabel lblEmail = new JLabel("EMAIL :");
		lblEmail.setBounds(20, 140, 46, 14);
		contentPane.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setBounds(20, 165, 304, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(334, 165, 260, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);

		txtCelular = new JTextField();
		txtCelular.setBounds(156, 95, 168, 20);
		contentPane.add(txtCelular);
		txtCelular.setColumns(10);

		txtTelefone = new JTextField();
		txtTelefone.setBounds(362, 95, 168, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);

		JLabel lblCelular = new JLabel("CELULAR:");
		lblCelular.setBounds(158, 74, 63, 14);
		contentPane.add(lblCelular);

		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setBounds(362, 74, 63, 14);
		contentPane.add(lblTelefone);

		JLabel lblCodigo = new JLabel("codigo");
		lblCodigo.setBounds(30, 336, 70, 15);
		contentPane.add(lblCodigo);

		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(107, 336, 57, 19);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (contador < 5) {
					txtCodigo.setText(Integer.toString(contador));
					System.out.println(txtCodigo);
					usuario[contador] = new Cadastro();
					usuario[contador].setNome(txtNome.getText());
					usuario[contador].setCelular(txtCelular.getText());
					usuario[contador].setTelefone(txtTelefone.getText());
					usuario[contador].setBairro(txtBairro.getText());
					usuario[contador].setBairro(txtBairro.getText());
					usuario[contador].setComplemento(txtComplemento.getText());
					usuario[contador].setCpf(txtCpf.getText());
					usuario[contador].setCodigo(Integer.parseInt(txtCodigo.getText()));

					contador++;
				} else {
					JOptionPane.showMessageDialog(null, "Só pode salvar 5 usuarios");
				}

			}
		});
		btnSalvar.setBounds(249, 336, 117, 25);
		contentPane.add(btnSalvar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				usuario[0] = new Cadastro();
				usuario[0].setNome("");
				usuario[0].setCelular("");
				usuario[0].setTelefone("");
				usuario[0].setBairro("");
				usuario[0].setBairro("");
				usuario[0].setComplemento("");
				usuario[0].setCpf("");
			}
		});
		btnExcluir.setBounds(389, 336, 117, 25);
		contentPane.add(btnExcluir);

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				usuario[contador] = new Cadastro();
				usuario[contador].setNome(txtNome.getText());
				usuario[contador].setCelular(txtCelular.getText());
				usuario[contador].setTelefone(txtTelefone.getText());
				usuario[contador].setBairro(txtBairro.getText());
				usuario[contador].setBairro(txtBairro.getText());
				usuario[contador].setComplemento(txtComplemento.getText());
				usuario[contador].setCpf(txtCpf.getText());
			}
		});
		btnAtualizar.setBounds(532, 336, 117, 25);
		contentPane.add(btnAtualizar);
	}
}

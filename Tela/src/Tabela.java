import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tabela extends JFrame {

	private JPanel contentPane;
	private JTable table;
	TelaPrincipal tp = new TelaPrincipal();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Tabela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{tp.usuario[0].getCodigo(), tp.usuario[0].getNome(), tp.usuario[0].getTelefone(), tp.usuario[0].getEmail(), tp.usuario[0].getRua()},
				{tp.usuario[1].getCodigo(), tp.usuario[1].getNome(), tp.usuario[1].getTelefone(), tp.usuario[1].getEmail(), tp.usuario[1].getRua()},
				{tp.usuario[2].getCodigo(), tp.usuario[2].getNome(), tp.usuario[2].getTelefone(), tp.usuario[2].getEmail(), tp.usuario[2].getRua()},
				{tp.usuario[3].getCodigo(), tp.usuario[3].getNome(), tp.usuario[3].getTelefone(), tp.usuario[3].getEmail(), tp.usuario[3].getRua()},
				{tp.usuario[4].getCodigo(), tp.usuario[4].getNome(), tp.usuario[4].getTelefone(), tp.usuario[4].getEmail(), tp.usuario[4].getRua()},
			},
			new String[] {
				"Codigo", "Nome", "Telefone", "Email", "Rua"
			}
		));
		table.setBounds(32, 22, 605, 208);
		contentPane.add(table);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tp.setVisible(true);
				
			}
		});
		btnCadastrar.setBounds(258, 238, 117, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(400, 238, 117, 25);
		contentPane.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnExcluir.setBounds(129, 238, 117, 25);
		contentPane.add(btnExcluir);
	}
}
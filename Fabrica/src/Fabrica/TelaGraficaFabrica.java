package Fabrica;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaGraficaFabrica extends JFrame {
	JFrame Tela= new JFrame();
	Container Principal = getContentPane();
	public TelaGraficaFabrica(){
		super ("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Principal.setLayout(null);
		setSize(800, 600);
		setLocation(300,300);
		setVisible(true);
		
		JLabel nome = new JLabel("Nome: ");
		Principal.add(nome);
		nome.setSize(40 , 20);
		nome.setLocation(3 , 3);
		
		JTextField txtNome = new JTextField("JONATA HANK DE ALMEIDA GALVAO DA SILVA SAURO JUNIOR");
		Principal.add(txtNome);
		txtNome.setLocation(42, 3);
		txtNome.setSize(360, 20);
		
		JLabel endereco = new JLabel("Endereço: ");
		Principal.add(endereco);
		endereco.setSize(60 , 20);
		endereco.setLocation(40, 80);
		
		JTextField txtEndereco = new JTextField("Rua das acacias ");
		Principal.add(txtEndereco);
		txtEndereco.setLocation(80, 80);
		txtEndereco.setSize(360, 20);
		
	}
	public static void main (String []args){
		new TelaGraficaFabrica();
		
	}
}

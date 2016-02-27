package ClasesTelas;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial extends JFrame {

	private static JFrame jFrame = new JFrame();

	public TelaInicial() {

		super("Banco Imobiliário");
	
		// Fazer menu
		
		JMenuBar jMenuBar = new JMenuBar();
		JMenu jMenu = new JMenu();
				
		Container c = getContentPane();
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 350);
		setVisible(true);

	}

	public static void main(String[] args) {

		new TelaInicial();

	}
}
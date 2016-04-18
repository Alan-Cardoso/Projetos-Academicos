package com.JardimDoEder.tela;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.JardimDoEder.classe.Humano;
import com.JardimDoEder.classe.Monstro;

@SuppressWarnings("serial")
public class Tabuleiro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		Tabuleiro frame = new Tabuleiro();
		frame.setVisible(true);

	}

	public Tabuleiro() {
		
		Humano homen = new Humano(100, 82, 112);
		Humano mulher = new Humano(100, 74, 128);
		Monstro monstroVerde = new Monstro(100, 1366, 93);
		Monstro monstroRosa = new Monstro(100, 108, 93);
		
		setTitle("Jardim do Eden");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(0, 0);
		setSize(getMaximumSize());
		contentPane = new JPanel();

		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbl_Arvore = new JLabel("");
		lbl_Arvore.setBounds(10, 11, 285, 321);
		lbl_Arvore
				.setIcon(new ImageIcon(
						"C:\\Users\\AlanCardoso\\OneDrive\\Projetos eclipse - Java\\JardimDoEdem\\src\\com\\JardimDoEder\\arquivo\\Arvore.jpg"));
		contentPane.add(lbl_Arvore);

		JLabel label_Monstro01 = new JLabel("");
		label_Monstro01.setIcon(new ImageIcon(
						"C:\\Users\\AlanCardoso\\OneDrive\\Projetos eclipse - Java\\JardimDoEdem\\src\\com\\JardimDoEder\\arquivo\\monstro01.jpg"));
		label_Monstro01.setBounds(monstroVerde.setPosicaoLinha(387), monstroVerde.setPosicaoColuna(43), 93, 93);
		contentPane.add(label_Monstro01);

		JLabel label_Monstro02 = new JLabel("");
		label_Monstro02.setIcon(new ImageIcon(
						"C:\\Users\\AlanCardoso\\OneDrive\\Projetos eclipse - Java\\JardimDoEdem\\src\\com\\JardimDoEder\\arquivo\\monstro02.jpg"));
		label_Monstro02.setBounds(monstroRosa.setPosicaoLinha(316), monstroRosa.setPosicaoColuna(169), 108, 93);
		contentPane.add(label_Monstro02);

		JLabel label_Mulher = new JLabel("");
		label_Mulher.setIcon(new ImageIcon(
						"C:\\Users\\AlanCardoso\\OneDrive\\Projetos eclipse - Java\\JardimDoEdem\\src\\com\\JardimDoEder\\arquivo\\Mulher.jpg"));
		label_Mulher.setBounds(mulher.setPosicaoLinha(475), mulher.setPosicaoColuna(231), 74, 128);
		contentPane.add(label_Mulher);

		JLabel label_Homen = new JLabel("");
		label_Homen.setIcon(new ImageIcon(
				"C:\\Users\\AlanCardoso\\OneDrive\\Projetos eclipse - Java\\JardimDoEdem\\src\\com\\JardimDoEder\\arquivo\\Homen.jpg"));
		label_Homen.setBounds(homen.setPosicaoLinha(646), homen.setPosicaoColuna(150), 82, 102);
		contentPane.add(label_Homen);
		
		JLabel label_Grama = new JLabel("");
		label_Grama.setBounds(84, 414, 46, 14);
		contentPane.add(label_Grama);
	}
}

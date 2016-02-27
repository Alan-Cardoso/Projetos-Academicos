package ClasesTelas;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Container;
import java.awt.FlowLayout;

import ClasesNormais.Carta;
import ClasesNormais.Jogador;
import ClasesNormais.Terreno;

public class Tabuleiro extends JFrame {

	private static final int NUMERO_DOS_DADOS = 7;
	private static Jogador[] jogador = new Jogador[6];
	private static Carta[] carta = new Carta[32];
	private static Terreno[] terreno = new Terreno[30];
	private static Random random = new Random();
	private static JFrame jframe = new JFrame();
	
	public Tabuleiro() {

		super("Banco Imobiliário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(getMaximumSize());
		setVisible(true);
	}
	
	//Apagar metodo main
	
	public static void main(String[] args) {

		new Tabuleiro();

	}

	private static void PreencheCartas() {
		// Não Iniciado
	}

	private static void PreencheTerreno() {

		String[] nomeTerreno = {};
		Double[] valorCompraTerreno = {};
		Double[] valorVendaTerreno = {};
		Double[] valorIpotecaTerreno = {};
		Integer[] posicaoLinhaTerreno = {};
		Integer[] posicaoColunaTerreno = {};
		
		Boolean statusCompra = null;
		Boolean statusAluguel= null;
		Boolean statusIpoteca= null;


		for (int i = 0; i < terreno.length; i++) {

			terreno[i] = new Terreno(nomeTerreno[i], valorCompraTerreno[i],
					valorVendaTerreno[i], valorIpotecaTerreno[i],
					posicaoLinhaTerreno[i], posicaoColunaTerreno[i], statusCompra, statusAluguel, statusIpoteca);
		}
	}

	private static void PreencheJogador() {
		// Não Iniciado
	}

	private static void ImprimirTabuleiro() {
		// Não Iniciado
	}

	private static void JogarDados() {
		int dado1;
		int dado2;

		dado1 = random.nextInt(NUMERO_DOS_DADOS);
		dado2 = random.nextInt(NUMERO_DOS_DADOS);
		int somaDados = (dado1 + 1) + (dado2 + 1);
	}

}
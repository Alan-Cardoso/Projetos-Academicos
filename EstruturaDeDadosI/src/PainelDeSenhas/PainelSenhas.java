package PainelDeSenhas;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author alancardoso
 * 
 */
public class PainelSenhas {

	private static final int POSICAO_CAIXA_NORMAL = 1;
	private static final int POSICAO_CAIXA_PREFERENCIAL = 0;
	private static Clientes[] clientes = {};
	private static Caixa[] caixa = {};
	private static Scanner t = new Scanner(System.in);
	private static Random random = new Random();

	public static void main(String[] args) {

		ChamaMetodos();
	}

	// Métodos

	private static void QuantCaixais() {
		int[] quantidadeCaixas = new int[2];

		System.out.println("Digite a quantidade se caixas Preferenciais:");
		quantidadeCaixas[POSICAO_CAIXA_PREFERENCIAL] = t.nextInt();
		System.out.println("Digite a quantidade se caixas Normais:");
		quantidadeCaixas[POSICAO_CAIXA_NORMAL] = t.nextInt();

	}

	private static void Opcoes() {
		int opcoes = t.nextInt();
		

		switch (opcoes) {
		case 1:
			QuantCaixais();
			break;
		case 2:
			ProximoCliente();
			break;
		case 3:
			// Método que inserra a aplicaçao.
			break;
		default:
			break;
		}
	}

	private static void ProximoCliente() {
		// TODO Auto-generated method stub
		
	}

	private static String GerarSenha() {
		
		int tipoSenha = random.nextInt(2);
		String tipoCliente = null;
		if (tipoSenha == 0) {
			tipoCliente = "Preferencial";
		} else if (tipoSenha == 1) {
			tipoCliente = "Normal";
		}
		return tipoCliente;
	}

	private static void Menu() {
		
		System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("$$                                            $$");
		System.out.println("$$    Software de gerenciamento de senhas!    $$");
		System.out.println("$$                                            $$");
		System.out.println("$$    1 - Adicionar/Alterar Caixas.           $$");
		System.out.println("$$    2 - Proxímo Cliente.                    $$");
		System.out.println("$$    3 - Sair.                               $$");
		System.out.println("$$                                            $$");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("\nDigite uma Opcão: ");
	}
	
	private static void ChamaMetodos() {
		
//		Menu();
//		Opcoes();
		ImprimeSenhas();
	}

	private static void ImprimeSenhas() {
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println(GerarSenha());
		}
		
		if (GerarSenha().equals("Preferencial")) {
			
		} else if (GerarSenha().equals("Normal")){

		}
		
		
		
//		System.out.println("\nCaixa    Senha");
//		System.out.println(" n1       001 ");
		
	}
}
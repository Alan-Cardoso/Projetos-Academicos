package br.com.alvorada.gerenciadordealunos.v1_0_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * SOFTWARE DE GERENCIAMENTO DE ALUNOS
 * 
 * @version 1.0.1<br>
 *          - Adicionado método para verificar se a exclusão será feita pelo
 *          indice ou pelo nome do aluno<br>
 *          - O método de leitura agora usa o método BufferedReader e
 *          StreamReader em detrimento do Scanner usado antigamente.
 * 
 */

public class CadastroDeAlunos {

	private static String[] cadastroDeAlunos = new String[10];
	private static int primeiraPosicaoLivre = 0;

	// METODOS ACESSORIOS
	private static int capturarInteiro(String enunciado) {
		System.out.println(enunciado);
		boolean continuarWhile = true;
		int numero = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				numero = Integer.parseInt(br.readLine());
				continuarWhile = false;
			} catch (Exception e) {
				System.err.println("Você precisa digitar um número inteiro: \n" + enunciado);
				continuarWhile = true;
			}
		} while (continuarWhile);
		return numero;
	}

	private static String capturarString(String enunciado) {
		System.out.println(enunciado);
		String textoDeRetorno = null;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			textoDeRetorno = br.readLine().toUpperCase();
		} catch (Exception e) {
		}
		return textoDeRetorno;
	}

	private static boolean validarNumero(String textoParaValidar) {
		boolean retorno = false;
		String[] numerosDe0Ate9 = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (int i = 0; i < textoParaValidar.length(); i++) {
			retorno = false;
			
			for (int j = 0; j < numerosDe0Ate9.length; j++) {
				if(textoParaValidar.substring(i, i+1).equals(numerosDe0Ate9[j])){
					retorno = true;
					break;
				}
			}
			if (retorno == false) {
				break;
			}
		}
		return retorno;
	}

	// MÉTODOS DO MENU DO PROGRAMA
	private static void organizarBaseDeDadosDepoisDeExcluirUmAluno(int indiceExcluido) {
		for (int i = indiceExcluido; i < primeiraPosicaoLivre; i++) {
			if (i == primeiraPosicaoLivre - 1) {
				cadastroDeAlunos[i] = null;
			} else {
				cadastroDeAlunos[i] = cadastroDeAlunos[i + 1];
			}
		}

	}

	/*
	 * Altera o valor de uma posicao especifica do array, é usado para inserir novos
	 * alunos nas posicoes livres existentes
	 */
	private static void alterarONomeDeUmAluno(int indiceDoArray, String novoValor) {
		cadastroDeAlunos[indiceDoArray] = novoValor;
	}

	/*
	 * Faz uma busca no array pelo um valor passado no parametro, usado para
	 * encontrar o primeiro valor livre passando null como parametro
	 */
	private static int encontrarONomeDeUmAluno(String valorASerEncontrado) {
		int i = 0;
		boolean encontrei = false;
		while ((i < primeiraPosicaoLivre) && (encontrei == false)) {
			if (valorASerEncontrado.equals(cadastroDeAlunos[i])) {
				break;
			}
			i++;
		}
		return i;
	}

	// MENU DE OPÇÕES

	/* Imprimir o menu com as opcoes disponiveis */
	private static void imprimirMenuDeOpcoes() {
		System.out.println("###########  BEM VINDOS AO SOFTWARE DE GERENCIAMENTO DE ALUNOS ############### \n");

		System.out.println(" ESCOLHA A OPÇÃO QUE DESEJA ACESSAR: \n \n"
				+ " DIGITE 1 – ADICIONAR UMA VÁRIOS ALUNOS \n DIGITE 2 – EXIBIR A LISTA DE ALUNOS NA ORDEM CADASTRADA \n "

		+ "DIGITE 3 – ADICIONAR UM NOVO ALUNO \n DIGITE 4 – EXCLUIR UM ALUNO  \n DIGITE 5 – MOSTRAR NÚMERO DE ALUNOS CADASTRADOS E ESPAÇOS LIVRES \n"

		+ " DIGITE 6-  EXIBIR LISTA DE ALUNOS NA ORDEM ALFABÉTICA \n DIGITE 7 – SAIR \n");
	}

	/**
	 * Opção 01 - adiciona alunos a base de dados
	 * 
	 * @param numeroDeAlunos
	 */
	private static void adicionarVariosAlunos() {
		int numeroDeAlunos = capturarInteiro("Quantos alunos você deseja adicionar?");
		for (int i = 0; i < numeroDeAlunos; i++) {

			String nomeDoAluno = capturarString("Digite o nome do aluno");
			alterarONomeDeUmAluno(primeiraPosicaoLivre, nomeDoAluno);
			primeiraPosicaoLivre++;
		}
	}

	/**
	 * Opção 02 - lista todos os alunos cadastrados
	 */
	private static void listarDadosNaOrdemDeCadastro() {

		for (int i = 0; i < primeiraPosicaoLivre; i++) {
			System.out.println(i + 1 + " - " + cadastroDeAlunos[i]);
		}
	}

	/**
	 * Opção 03 - Adiciona um novo aluno.
	 * 
	 */
	private static void adicionarNovoAluno() {

		String nomeDoAluno = capturarString("Digite o nome do aluno");

		alterarONomeDeUmAluno(primeiraPosicaoLivre, nomeDoAluno);
		primeiraPosicaoLivre++;

	}

	/**
	 * Opção 04 - Exclui um aluno da base de dados
	 * 
	 */
	private static void excluirUmAluno() {

		String nomeDoAluno = capturarString("Digite o nome ou o id do aluno que deseja excluir:");

		if (validarNumero(nomeDoAluno)) {
			int posicaoDoAluno = Integer.parseInt(nomeDoAluno) - 1;
			organizarBaseDeDadosDepoisDeExcluirUmAluno(posicaoDoAluno);
			primeiraPosicaoLivre--;
		} else {
			int posicaoDoAluno = encontrarONomeDeUmAluno(nomeDoAluno);
			organizarBaseDeDadosDepoisDeExcluirUmAluno(posicaoDoAluno);
			System.out.println("Aluno: " + nomeDoAluno + " excluido");
			primeiraPosicaoLivre--;
		}
	}

	/**
	 * Opção 05 - Mostra a quantidade de posições livres e ocupadas da base de
	 * dados
	 */
	private static void verificarEstadoDasPosicoesDoArray() {

		int posicoesOcupadas = primeiraPosicaoLivre;
		int posicoesLivres = cadastroDeAlunos.length - primeiraPosicaoLivre;

		System.out.println("A situacao da sua base de dados é:\n" + posicoesOcupadas + "\t - Alunos cadastrados\n"
				+ posicoesLivres + "\t - Posicoes livres\n");

	}

	/**
	 * Opção 06 - Listar os usuários na ordem alfabética
	 */
	private static void listarDadosNaOrdemAlfabetica() {
		String[] cadastroTemporario = new String[primeiraPosicaoLivre];

		for (int i = 0; i < primeiraPosicaoLivre; i++) {
			cadastroTemporario[i] = cadastroDeAlunos[i];
		}

		for (int i = 0; i < primeiraPosicaoLivre; i++) {
			for (int j = (i + 1); j < primeiraPosicaoLivre; j++) {
				if ((cadastroTemporario[i].compareToIgnoreCase(cadastroTemporario[j]) > 0)) {
					String variavelAuxiliar = cadastroTemporario[i];
					cadastroTemporario[i] = cadastroTemporario[j];
					cadastroTemporario[j] = variavelAuxiliar;
				}
			}
			System.out.println(cadastroTemporario[i]);

		}

	}

	public static void main(String[] args) {

		int op = 0;
		while (op != 7) {

			imprimirMenuDeOpcoes();
			op = capturarInteiro("Digite uma opção:");

			switch (op) {
			case 1:
				adicionarVariosAlunos();
				break;
			case 2:
				listarDadosNaOrdemDeCadastro();
				break;
			case 3:
				adicionarNovoAluno();
				break;
			case 4:
				excluirUmAluno();
				break;
			case 5:
				verificarEstadoDasPosicoesDoArray();
				break;
			case 6:
				listarDadosNaOrdemAlfabetica();
				break;
			case 7:
				break;
			default:
				System.out.println("Opção Invalida!");
				break;
			}
		}
		System.out.println("Até mais.");
	}
}

package br.com.alvorada.gerenciadordealunos.v2_1_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {

	/**
	 * Capturar entrada do teclado como uma String.
	 * 
	 * @return String
	 */
	public static String capturarString() {
		String retorno = null;
		try {
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			retorno = teclado.readLine();
		} catch (IOException e) {
			System.err.println("Erro na entrada do teclado.");
		}
		return retorno;
	}

	/**
	 * Capturar entrada do teclado como uma String apesentando ao usuário uma
	 * mensagem.
	 * 
	 * @param enunciado
	 * @return
	 */
	public static String capturarString(String enunciado) {
		System.out.println(enunciado);
		return capturarString();
	}

	/**
	 * Captura a entrada do teclado e testa se o valor da entrada pode ser
	 * convertido em um tipo "int" caso positivo converte retornando esse valor,
	 * caso contrário pede uma nova entrada.
	 * 
	 * @return int <br>
	 * 
	 */
	public static int capturarInt() {
		String retorno = capturarString();
		while (!testarSeAStringPodeSerConvertidaEmNumero(retorno)) {
			System.err.println("\nO valor digitado não é um inteiro.\nTente novamente.");
			retorno = capturarString();
		}
		return Integer.parseInt(retorno);
	}

	/**
	 * Captura a entrada do teclado e testa se o valor da entrada pode ser
	 * convertido em um tipo "int" caso positivo converte retornando esse valor,
	 * caso contrário pede uma nova entrada. Além disso teste se o valor está
	 * dentro do intervalo determinado nos parametros de entrada, os limites são
	 * permitidos
	 * @param 
	 * @param 
	 * @return int  dentro dos limites estabelecidos<br>
	 * 
	 */
	public static int capturarInt(String enunciado, int limiteInferior, int limiteSuperior) {
		int retorno = capturarInt(enunciado);
		while ((retorno < limiteInferior) || (retorno > limiteSuperior)){
			System.err.println("\nO valor digitado está fora dos limites permitidos.\nTente novamente.");
			retorno = capturarInt(enunciado);
		};
		return retorno;
	}

	/**
	 * Captura a entrada do teclado e testa se o valor da entrada pode ser
	 * convertido em um tipo "int" caso positivo converte retornando esse valor,
	 * caso contrário pede uma nova entrada. <br>
	 * Apresenta ao usuário uma mansagem antes de capturar a entrada.
	 * 
	 * @return int <br>
	 * 
	 */
	public static int capturarInt(String enunciado) {
		System.out.println(enunciado);
		String retorno = capturarString();
		while (!testarSeAStringPodeSerConvertidaEmNumero(retorno)) {
			System.err.println("\nO valor digitado não é um inteiro.\nTente novamente.");
			retorno = capturarString();
		}
		return Integer.parseInt(retorno);
	}

	

	/**
	 * Retorna um boolean dizendo se uma String pode ser convertida em um valor
	 * numérico passando como parâmetro de entrada a primeira letra do tipo de
	 * conversão desejada. <br>
	 * Exemplo: <br>
	 * i - int <br>
	 * I - Integer <br>
	 * No momento apenas as classes acima estão implementadas.
	 * 
	 * @param stringDeTeste
	 * @return
	 */
	public static boolean testarSeAStringPodeSerConvertidaEmNumero(String stringDeTeste) {

		boolean retornoDoTeste = false;
		String[] numeros = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9","-" };
		for (int i = 0; i < stringDeTeste.length(); i++) {
			retornoDoTeste = false;
			for (String string : numeros) {
				if (string.equals(stringDeTeste.substring(i, i + 1))) {
					retornoDoTeste = true;
					break;
				}
			}
			if (!retornoDoTeste) {
				break;
			}
		}
		return retornoDoTeste;
	}
}

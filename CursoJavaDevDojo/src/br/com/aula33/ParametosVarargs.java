package br.com.aula33;

public class ParametosVarargs {

	public static void main(String[] args) {
		
		int[] numeros = {1,2, 3, 4, 5};
		
		//Sem Varrargs
		somaArray(numeros);
		
		//Com Varargs
		somaVarargs(1, 2, 3, 4, 5);
	}

	public static void somaArray(int[] numeros) {
		
		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		System.out.println("Sem Varargs: " + soma);
	}
	
public static void somaVarargs(int... numeros) {
		
		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		System.out.println("Com Varargs: " + soma);
	}
}
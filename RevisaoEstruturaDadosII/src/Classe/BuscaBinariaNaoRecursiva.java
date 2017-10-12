package Classe;

public class BuscaBinariaNaoRecursiva {

	public static void main(String[] args) {
		int[] vetor = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };

		System.out.println(buscaBinaria(vetor, 15));
	}

	public static int buscaBinaria(int[] vetor, int valor) {

		int inicio = 0;
		int fim = vetor.length - 1;
		
		while (inicio <= fim) {
			int pivo = (inicio + fim) / 2;

			if (vetor[pivo] == valor) {
				return pivo;
			}

			if (valor > vetor[pivo]) {
				inicio = pivo + 1;
			} else {
				fim = pivo - 1;
			}
		}
		return -1;
	}
}
package resposta;

public class respostas {

	public static void main(String[] args) {
		int[] vetorDesordenado = { 1, 5, 9, 7, 3, 2, 4, 6, 8 };
		int[] vetorOrdenado = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("Resposta a da 01 --> " + buscaSequsncial(vetorDesordenado, 7));
		System.out.println("Resposta a da 02 --> " + buscaBinariaSimples(vetorOrdenado, 2));
		System.out.println("Resposta b da 02 --> " + buscaBinariaRecursiva(vetorOrdenado, 9, 0, vetorOrdenado.length - 1));

	}

	public static int buscaSequsncial(int[] vetor, int valorProc) {

		for (int cont = 0; cont < vetor.length; cont++) {
			if (vetor[cont] == valorProc) {
				return cont;
			}
		}

		return -1;
	}

	public static int buscaBinariaSimples(int[] vetor, int valorProc) {

		int inicio = 0;
		int fim = vetor.length - 1;

		while (inicio <= fim) {
			int pivo = (inicio + fim) / 2;

			if (vetor[pivo] == valorProc) {
				return pivo;
			}

			if (valorProc > vetor[pivo]) {
				inicio = pivo + 1;
			} else {
				fim = pivo - 1;
			}
		}

		return -1;
	}

	public static int buscaBinariaRecursiva(int[] vetor, int valorProc, int inicio, int fim) {

		if (inicio <= fim) {
			int pivo = (inicio + fim) / 2;

			if (vetor[pivo] == valorProc) {
				return pivo;
			}
			if (valorProc > vetor[pivo]) {
				return buscaBinariaRecursiva(vetor, valorProc, pivo+1, fim);
			} else {
				return buscaBinariaRecursiva(vetor, valorProc, inicio, pivo-1);
			}
		}

		return -1;
	}
}

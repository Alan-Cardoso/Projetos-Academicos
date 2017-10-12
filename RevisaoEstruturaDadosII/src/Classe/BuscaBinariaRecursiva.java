package Classe;

public class BuscaBinariaRecursiva {

	public static void main(String[] args) {
		int[] vetor = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };

		System.out.println(buscaBinaria(vetor, 10, 0, vetor.length - 1));
	}
	
	public static int buscaBinaria(int[] vetor, int valor, int inicio, int fim) {
		
		if (inicio <= fim) {
			int pivo = (inicio + fim) / 2;
			
			if (vetor[pivo] == valor) {
				return pivo;
			}

			if (valor > vetor[pivo]) {
				return buscaBinaria(vetor,valor,pivo+1,fim);
			} else {
				return buscaBinaria(vetor,valor,inicio,pivo-1);
			}
		}
		return -1;
	}
}
package Classe;

public class BuscaSequencNaoRecursiva {

	public static void main(String[] args) {
		int[] vetor = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
		
		System.out.println(buscaSequencial(vetor, 5));
	}
	
	public static int buscaSequencial(int[] vetor, int valor) {
		for (int cont = 0; cont < vetor.length; cont++) {
			if (vetor[cont] == valor) {
				return cont;
			}
		}
		return -1;
	}
}
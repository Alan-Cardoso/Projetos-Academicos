package Classe;

public class BuscaSequencRecursiva {

	public static void main(String[] args) {
		int[] vetor = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
		
		System.out.println(buscaSequencial(vetor, vetor.length-1, 30));
	}
	
	public static int buscaSequencial(int[] vetor, int cont, int elementoProcurado) {

		if (cont >= 0) {
			if (vetor[cont] == elementoProcurado) {
				return cont;
			} else {
				return buscaSequencial(vetor, cont - 1, elementoProcurado);
			}
		}
		return -1;
	}
}
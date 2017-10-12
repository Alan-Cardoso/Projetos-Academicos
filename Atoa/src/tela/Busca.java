package tela;

public class Busca {

	public static void main(String[] args) {
		int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("Busca Binária Simples " + buscabinaria(vetor, 1));
		System.out.println("Busca Binária Recursiva " + buscabinariaRec(vetor, 5, 0, vetor.length));
		System.out.println("Busca sequencial "+ buscaSequencial(vetor, 10));

	}

	public static int buscabinaria(int[] vetor, int valorProc) {

		int inicio = 0;
		int fim = vetor.length;
		
		while(inicio <= fim){
			int pivo = (inicio +fim)/2;
			
			if (vetor[pivo] == valorProc) {
				return pivo;
			}
			if (valorProc > vetor[pivo]) {
				inicio = pivo +1;
			} else {
				fim = pivo -1;
			}
		}
		
		return -1;
	}

	public static int buscabinariaRec(int[] vetor, int valorProc, int inicio, int fim) {
		
		if(inicio <= fim){
			int pivo = (inicio +fim)/2;
			
			if (vetor[pivo] == valorProc) {
				return pivo;
			}
			if (valorProc > vetor[pivo]) {
				return buscabinariaRec(vetor, valorProc, pivo +1, fim);
			} else {
				return buscabinariaRec(vetor, valorProc, inicio, pivo -1);
			}
		}
		
		return -1;
	
	}
	
	public static int buscaSequencial(int[] vetor, int valorProc) {
		
		for (int cont = 0; cont < vetor.length; cont++) {
			if (vetor[cont] == valorProc) {
				return cont;
			}
			
		}
		return -1;
	}	
	
	public static void bubbleSort(int[] vetor) {
		int aux = 0;
		
		for (int i = vetor.length; i < 0; i--) {
			for (int j = 0; j < i; j++) {
				if(vetor[j+1] < vetor[j]){
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
				
			}
		}
	}
}
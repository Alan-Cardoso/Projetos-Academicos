package classe;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		Integer num[] = { 7, 8, 3, 9, 1, 6, 5 };
		String[] letras = { "f", "p", "v", "b", "g", "a", "z" };

		ordenar(num);
		ordenar(letras);

	}

	public static void ordenar(Object[] vetor) {
		Object aux = 0;

		try {
			for (int i = vetor.length - 1; i > 1; i--) {

				for (int j = 0; j < i; j++) {

					if ((int) vetor[j] > (int) vetor[j + 1]) {

						aux = vetor[j];
						vetor[j] = vetor[j + 1];
						vetor[j + 1] = aux;
					}
				}
			}
		} catch (ClassCastException e) {
			for (int i = vetor.length - 1; i > 1; i--) {

				for (int j = 0; j < i; j++) {

					if ((vetor[j]).compareTo((String) vetor[j + 1]) > 0) {

						aux = vetor[j];
						vetor[j] = vetor[j + 1];
						vetor[j + 1] = aux;
					}
				}
			}
		}
		System.out.println(Arrays.toString(vetor));
	}
}
/**
 * 
 */
package classe;

/**
 * @author AlanCardoso
 *
 */
public class BuscaBinaria {

	public static void main(String[] args) {
		int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		System.out.println(busca(vetor, 50));

	}

	public static int busca(int[] vetor, int numProc) {

		int inicio = 0;
		int fim = vetor.length;
		int pivo = (inicio + fim) / 2;

		while (pivo != numProc) {
			if (pivo > numProc) {
				fim = pivo - 1;
				pivo = (inicio + fim) / 2;
				if (inicio == numProc) {
					return inicio;// inicio
				} else if (fim == numProc) {
					return fim;// fim
				}
			} else {
				inicio = pivo + 1;
				pivo = (inicio + fim) / 2;
				if (inicio == numProc) {
					return inicio;// inicio
				} else if (fim == numProc) {
					return fim;// fim
				}
			}
		}
		return 0;// zero
	}
}
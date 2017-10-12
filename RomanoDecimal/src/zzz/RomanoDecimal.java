package zzz;

import java.util.Scanner;

public class RomanoDecimal {

	static String numRomano;

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o número Romano: ");
		numRomano = sc.nextLine();

		System.out.println(RomanoDecimal(numRomano));

	}

	public static int RomanoDecimal(String numRomano) {

		char romano[] = { ' ', 'I', 'V', 'X', 'L', 'C', 'D', 'M' }; // GUARDAN
																	// LETRAS A
																	// COMPARAR
		int decimal[] = { 0, 1, 5, 10, 50, 100, 500, 1000 };// SE LE DA VALOR A
															// LA LETRAS
		int decimalAux = 0;
		int aux = 0;
		char letra = ' ';
		int i = 0;
		int j = 0;

		if (i < numRomano.length()) {// RECORRER TODA LA FRASE(numero numRomano)

			letra = numRomano.charAt(i);
			
			if (j < romano.length) {// RECORRE ARREGLO ROM

				if (letra == romano[j]) {// si letra recorrida = a letra contenida en rom

					aux += decimal[j]; // sumar el valor de la letra

					if (decimalAux < decimal[j]) { // si el valor de letra anterior menor a valor letra actual

						aux -= decimalAux * 2; // restale el doble del menor de los dos

						decimalAux = decimal[j]; // valor anterior = valor letra actual

					} else {// si no se cumple lo anterior
						decimalAux = decimal[j];// el dato actual se guarda en anterior
					}
				}
				j++;
				RomanoDecimal(numRomano);
			}
			i++;
			RomanoDecimal(numRomano);
		}
		return aux;
	}
}
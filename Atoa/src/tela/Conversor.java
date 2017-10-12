package tela;

import java.util.Scanner;

public class Conversor {

	static Scanner sc = new Scanner(System.in);
	static int numero;
	static int valor;
	static String valorRomano = "";
	static String romano;
	static String palavra;

	public static void main(String[] args) {
		System.out.println("Digite 1 para DecimalToRomano e 2 RomanoToDecimal");
		numero = sc.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Informe um numero entre 1 e 3999:");
			valor = sc.nextInt();
			System.out.println(converter(valor));
			break;
		case 2:
			System.out.println("informe um numero romano valido:");
			palavra = sc.nextLine();
			RomanoToDecimal rd = new RomanoToDecimal();
			
			rd.Decimal(palavra);

			//System.out.println("O valor em decimal é: " + r);
			break;
		default:
			System.out.println("opção invalida");

		}

	}

	private static void RomanoToDecimal(String palavra2) {
		// TODO Auto-generated method stub

	}

	public static String converter(int numero) {
		int x = 0;
		if (numero < 4000) {

			if (numero >= 1000) {
				valorRomano += "" + "M";
				converter(numero -= 1000);

			} else if (numero >= 900) {
				valorRomano += "" + "CM";
				converter(numero -= 900);
			} else if (numero >= 500) {
				valorRomano += "" + "D";
				converter(numero -= 500);
			} else if (numero >= 400) {
				valorRomano += "" + "CD";
				converter(numero -= 400);
			} else if (numero >= 100) {
				valorRomano += "" + "C";
				converter(numero -= 100);
			} else if (numero >= 90) {
				valorRomano += "" + "XC";
				converter(numero -= 90);
			} else if (numero >= 50) {
				valorRomano += "" + "L";
				converter(numero -= 50);
			} else if (numero >= 40) {
				valorRomano += "" + "XL";
				converter(numero -= 40);
			} else if (numero >= 10) {
				valorRomano += "" + "X";
				converter(numero -= 10);
			} else if (numero >= 9) {
				valorRomano += "" + "IX";
				converter(numero -= 9);
			} else if (numero >= 5) {
				valorRomano += "" + "V";
				converter(numero -= 5);
			} else if (numero >= 4) {
				valorRomano += "" + "IV";
				converter(numero -= 4);
			} else if (numero >= 1) {
				valorRomano += "" + "I";
				converter(numero -= 1);
			}
			return "O Valor em Romano é: " + valorRomano;
		} else {
			return "Valor Inválido!";
		}
	}

	// public static int romanoToDecimal(String romano) {
	//
	// char romanos[] = { ' ', 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
	// int numeros[] = { 0, 1, 5, 10, 50, 100, 500, 1000 };
	// int aux = 0;
	// int soma = 0;
	// char letra = ' ';
	// for (int i = 0; i < romano.length(); i++) {
	// letra = romano.charAt(i);
	// for (int j = 0; j < romanos.length; j++) {
	// if (letra == romanos[j]) {
	// soma = soma + numeros[j];
	// if (aux < numeros[j]) {
	// soma = soma - aux * 2;
	// aux = numeros[j];
	// } else {
	// aux = numeros[j];
	// }
	// }
	// }
	// }
	// return soma;
	// }
}

class RomanoToDecimal {
	public RomanoToDecimal() {

	}

	public int Decimal(String romano) {

		char romanos[] = { ' ', 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int numeros[] = { 0, 1, 5, 10, 50, 100, 500, 1000 };
		int aux = 0;
		int soma = 0;
		char letra = ' ';
		for (int i = 0; i < romano.length(); i++) {
			letra = romano.charAt(i);
			for (int j = 0; j < romanos.length; j++) {
				if (letra == romanos[j]) {
					soma = soma + numeros[j];
					if (aux < numeros[j]) {
						soma = soma - aux * 2;
						aux = numeros[j];
					} else {
						aux = numeros[j];
					}
				}
			}
		}

		return soma;
	}
}

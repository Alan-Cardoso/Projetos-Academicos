package classes;

import java.util.Scanner;

public class ConversorDecimalRomano {

	static Scanner sc = new Scanner(System.in);
	static int valor;
	static String valorRomano = "";

	// static int valorInicio;

	public static void main(String[] args) {
		System.out.println("Informe um numero entre 1 e 3999:");
		valor = sc.nextInt();
		System.out.println(DecimalRomano(valor));
	}

	public static String DecimalRomano(int valor) {

		int valorInicio = valor;
		if (valor < 4000) {

			if (valor >= 1000) {
				valorRomano += "" + "M";
				DecimalRomano(valor -= 1000);
			} else if (valor >= 900) {
				valorRomano += "" + "CM";
				DecimalRomano(valor -= 900);
			} else if (valor >= 500) {
				valorRomano += "" + "D";
				DecimalRomano(valor -= 500);
			} else if (valor >= 400) {
				valorRomano += "" + "CD";
				DecimalRomano(valor -= 400);
			} else if (valor >= 100) {
				valorRomano += "" + "C";
				DecimalRomano(valor -= 100);
			} else if (valor >= 90) {
				valorRomano += "" + "XC";
				DecimalRomano(valor -= 90);
			} else if (valor >= 50) {
				valorRomano += "" + "L";
				DecimalRomano(valor -= 50);
			} else if (valor >= 40) {
				valorRomano += "" + "XL";
				DecimalRomano(valor -= 40);
			} else if (valor >= 10) {
				valorRomano += "" + "X";
				DecimalRomano(valor -= 10);
			} else if (valor >= 9) {
				valorRomano += "" + "IX";
				DecimalRomano(valor -= 9);
			} else if (valor >= 5) {
				valorRomano += "" + "V";
				DecimalRomano(valor -= 5);
			} else if (valor >= 4) {
				valorRomano += "" + "IV";
				DecimalRomano(valor -= 4);
			} else if (valor >= 1) {
				valorRomano += "" + "I";
				DecimalRomano(valor -= 1);
			}
			return "O Algarismo Romano correspondente a " + valorInicio + " é " + valorRomano;
		} else {
			return "Valor Inválido!";
		}
	}
	
	public static void RomanoDecimal() {
		String valorRomano;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nimero Romano:");
		valorRomano = sc.nextLine();
	}
}
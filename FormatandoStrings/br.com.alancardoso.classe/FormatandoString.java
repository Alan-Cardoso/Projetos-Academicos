/**
 * 
 */

/**
 * @author alan_
 *
 */
public class FormatandoString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * %d representa números inteiros
		 * %f representa números floats
		 * %2f
		 * representa números doubles
		 * %b representa valores booleanos
		 * %c representa valores char
		 */

		formatString("Alan Cardoso", 26, 1.80);
		formatTime(1_000_000);
	}

	static void formatString(String nome, int idade, double altura) {

		System.out.printf("Olá meu nome é: %s, Eu tenho %d anos e meço %,.2f m².\n", nome, idade, altura);
	}

	static void formatTime(long mileSegundos) {
		long hora = 0, minuto = 0, segundo = 0, milesimos = 0;

		System.out.printf("\nDemorou esatamente --> %dh %dm %ds %dms", hora, minuto, segundo, milesimos);
	}
}
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
		 * %d representa n�meros inteiros
		 * %f representa n�meros floats
		 * %2f
		 * representa n�meros doubles
		 * %b representa valores booleanos
		 * %c representa valores char
		 */

		formatString("Alan Cardoso", 26, 1.80);
		formatTime(1_000_000);
	}

	static void formatString(String nome, int idade, double altura) {

		System.out.printf("Ol� meu nome �: %s, Eu tenho %d anos e me�o %,.2f m�.\n", nome, idade, altura);
	}

	static void formatTime(long mileSegundos) {
		long hora = 0, minuto = 0, segundo = 0, milesimos = 0;

		System.out.printf("\nDemorou esatamente --> %dh %dm %ds %dms", hora, minuto, segundo, milesimos);
	}
}
package exemplosLivro;

public class ExemplosLivro {

	public static void main(String[] args) {

		/*
		 * Instruss�o que faz a mesma coisa, que um if e else simples. Se valor
		 * <10. Mensagem recebe -valor, se n�o mensagem recebe valor.
		 */
		int val = 2;
		int mensagem = val < 10 ? -val : val;

		System.out.println(mensagem);

		/*
		 * Exemplos com String
		 */
		String str = "Alan Cleyton Cardoso";
		// Obtem o caractere do �ndice especificadp po index.
		int index = 0;
		char result = str.charAt(index);
		System.out.println(result);
		// Retorna a primeira posi��o onde 'a' for emcontrado.
		int result2 = str.indexOf("a");
		System.out.println(result2);
		// Retorna a ultima posi��o onde 'a' for emcontrado.
		int result3 = str.lastIndexOf("a");
		System.out.println(result3);

		// Varargs
		testVarargs(1, 2, 3);
		testVarargs(true, false, true);

		// testVarargs();// Gera um erro amb�guo, por causa da sobrecarga que
		// foi feita no m�todo.

		// Double ms = 50000.0;
		// System.out.printf("% /50", ms);

		/*
		 * Exemplo bloco statico
		 */
		// static String msg;
		//
		// static {
		// System.out.println("Frias acabaram!!! \n");
		// msg = "Amanha tem aula";
		// }

	}

	public static void testVarargs(int... valor) {
		for (int i = 0; i < valor.length; i++) {
			System.out.println("arg " + i + ": " + valor[i]);
		}
	}

	public static void testVarargs(boolean... valor) {
		for (int i = 0; i < valor.length; i++) {
			System.out.println("arg " + i + ": " + valor[i]);
		}
	}
}
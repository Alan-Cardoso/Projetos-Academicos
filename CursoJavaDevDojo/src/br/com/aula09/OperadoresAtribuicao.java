package br.com.aula09;

public class OperadoresAtribuicao {

	public static void main(String[] args) {

		// =, +=, -=, *=, /= e %=
		
		double salario = 1800;
		salario += (salario *= 0.1);
		
		/*O comando faz o mesmo que o comando resumido acima 
		 * 
		 * salario = salario + (salario * 0.1);
		 */
		System.out.println(salario);
	}
}
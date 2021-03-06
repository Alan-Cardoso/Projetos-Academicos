package br.com.aula43;

public class MetodoStatic {

	public static void main(String[] args) {

		Carro c1 = new Carro("BMW", 280);
		Carro c2 = new Carro("Audi", 275);
		Carro c3 = new Carro("Mercedes", 290);

		c1.imprime();
		c2.imprime();
		c3.imprime();

		System.out.println("##############################################");

		/*
		 * faz com que mude o valor da variavel velocidadeLimite em todos os
		 * objetos de referÍncia do tipo Carro
		 */
		Carro.setVelocidadeLimite(220);

		c1.imprime();
		c2.imprime();
		c3.imprime();
	}
}
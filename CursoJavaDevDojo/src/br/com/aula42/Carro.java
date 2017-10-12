package br.com.aula42;

public class Carro {

	private String nome;
	private double velocidadeMaxima;
	public static double velocidadeLimite = 240;
	
	public Carro(String nome, double velocidadeMaxima) {
		super();
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void imprime() {
		System.out.println("------------------------------------");
		System.out.println("Nome " + this.nome);
		System.out.println("Velocidade Maxima " + this.velocidadeMaxima);
		System.out.println("Velocidade Limite " + velocidadeLimite);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
}
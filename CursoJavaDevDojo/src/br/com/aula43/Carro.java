package br.com.aula43;

public class Carro {

	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 240;
	
	public Carro(String nome, double velocidadeMaxima) {
		super();
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	//Não é posóvel colocar ststic em um método que use algum atributo da classe
	public void imprime() {
		System.out.println("------------------------------------");
		System.out.println("Nome " + this.nome);
		System.out.println("Velocidade Maxima " + this.velocidadeMaxima);
		//Atributos estaticos não precisam colocar "this." antes
		System.out.println("Velocidade Limite " + velocidadeLimite);
	}
	
	
	public static double getVelocidadeLimite() {
		return velocidadeLimite;
	}

	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
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
package br.com.aula51;

public class Funcionario extends Pessoa {

	private double salario;
	
	public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
		super(nome, cpf, endereco);
		this.salario = salario;
	} 

	public void imprime() {
		super.imprime();
		System.out.println("Salário: " + this.salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
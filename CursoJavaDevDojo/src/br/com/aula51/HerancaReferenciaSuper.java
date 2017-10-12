package br.com.aula51;

public class HerancaReferenciaSuper {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("Rua 25", "Bairro 1");
		Pessoa pessoa = new Pessoa("Gina", "12345", endereco);
		pessoa.imprime();

		System.out.println("\n##########################################\n");

		Funcionario funcionario = new Funcionario("Augusto", "98765", endereco, 15000);
		funcionario.imprime();
	}

}

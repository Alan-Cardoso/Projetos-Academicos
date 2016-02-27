package ClasesNormais;

public class Jogador {

	String nome;
	String cor;
	Integer quantDinheiro;
	
	Integer linhaPosicao;
	Integer colunaPosicao;

	public Jogador(String nomePiao, String corPiao, Integer quantDinheiroPiao,
			Integer posicaoLinhaPiao, Integer posicaoColunaPiao) {

		nome = nomePiao;
		cor = corPiao;
		quantDinheiro = quantDinheiroPiao;
		linhaPosicao = posicaoLinhaPiao;
		colunaPosicao = posicaoColunaPiao;

	}

}

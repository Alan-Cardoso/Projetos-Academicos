package Faculdade;

import java.util.List;

public class SalaAula extends Sala {
	
	public String quadro;
	public Professor professor;
	public ArCondicionado arCondicionado;
	public List<String> cadeira;
	public List<String> mesas;
	public List<Aluno> alunos;
	
	@Override
	Integer quantidadeJanelas() {
		return 3;
	}
	@Override
	Integer quantidadePortas() {
		return 1;
	}
	@Override
	Integer quantidadeLampadas() {
		return 6;
	}
	
	@Override
	public Integer quantidadeTomadas() {
		return 15;
	}
	
}

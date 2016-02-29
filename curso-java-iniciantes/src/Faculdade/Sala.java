package Faculdade;

public abstract class Sala {
	
	abstract Integer quantidadeJanelas();
	abstract Integer quantidadePortas();
	abstract Integer quantidadeLampadas();
	
	public Integer quantidadeTomadas(){
		return 1;
	}

}

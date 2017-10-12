package br.com.aula51;

public class Endereco {

	private String rua;
	private String bairro;
	
	public Endereco(String rua, String bairro) {
		super();
		this.rua = rua;
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
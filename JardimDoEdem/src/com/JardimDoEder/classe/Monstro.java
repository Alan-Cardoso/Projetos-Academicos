/**
 * 
 */
package com.JardimDoEder.classe;

/**
 * @author AlanCardoso
 *
 */
public class Monstro {
	
	private int vida;
	private int posicaoLinha;
	private int posicaoColuna;
	
	public int getVida() {
		return vida;
	}

	public int setVida(int vida) {
		return this.vida = vida;
	}

	public int getPosicaoLinha() {
		return posicaoLinha;
	}

	public int setPosicaoLinha(int posicaoLinha) {
		return this.posicaoLinha = posicaoLinha;
	}

	public int getPosicaoColuna() {
		return posicaoColuna;
	}

	public int setPosicaoColuna(int posicaoColuna) {
		return this.posicaoColuna = posicaoColuna;
	}
	
	public Monstro(int vida, int posicaoLinha, int posicaoColuna) {
		this.vida = vida;
		this.posicaoLinha = posicaoLinha;
		this.posicaoColuna = posicaoColuna;
	}
}
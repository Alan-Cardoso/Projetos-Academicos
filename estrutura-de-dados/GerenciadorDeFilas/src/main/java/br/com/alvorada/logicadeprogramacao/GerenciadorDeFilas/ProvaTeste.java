package br.com.alvorada.logicadeprogramacao.GerenciadorDeFilas;

public class ProvaTeste {

	public static void main(String[] args) {
		String[] meuArray = new String[6];
		for (String string : meuArray) {
			System.out.println(string);
		}
		System.out.println("\n--------------------------------");
		meuArray[0] = "posicao01";
		meuArray[1] = "posicao02";
		meuArray[5] = "posicao05";
		
		
		for (String string : meuArray) {
			System.out.println(string);
		}
		System.out.println("\n--------------------------------");
		
		for (int i = 0; i < meuArray.length; i++) {
			if(meuArray[i]==(null)){
				for (int j = i + 1; j < meuArray.length; j++) {
					if((meuArray[j]!=(null))){
						meuArray[i] = meuArray[j];
						meuArray[j] = null;
					}
				}
			}
		}
		System.out.println("\n--------------------------------\nOrdenado\n");
		for (String string : meuArray) {
			System.out.println(string);
		}
	}

}

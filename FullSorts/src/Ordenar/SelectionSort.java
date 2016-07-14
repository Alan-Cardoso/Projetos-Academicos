package Ordenar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SelectionSort {
	
	private static String[] nome = new String[230];
	private static String linha;
	private static FileReader fl;
	private static BufferedReader bf;
	
	public static void main(String[] args) {
		
		int num [] = {3, 5, 8, 4, 1, 7};
		
		for(int fixo = 0; fixo < num.length - 1; fixo++){
			int menor = fixo;
			
			for (int i = menor + 1; i < num.length; i++) {
				if(num[i] < num[menor]){
					menor = i;
				}
			}
			
			if(menor != fixo){
				int aux = num[fixo];
				num[fixo] = num[menor];
				num[menor] = aux;
			}
		}
		
		System.out.println(Arrays.toString(num));
	}
	
	public static void lerArquivo() {

		try {
			fl = new FileReader("10 Mil numeros.txt");
			bf = new BufferedReader(fl);
			while ((linha = bf.readLine()) != null) {
				setNome(linha.split(", "));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static String[] getNome() {
		return nome;
	}

	public static void setNome(String[] nome) {
		SelectionSort.nome = nome;
	}

	public static String getLinha() {
		return linha;
	}

	public static void setLinha(String linha) {
		SelectionSort.linha = linha;
	}

	public static FileReader getFl() {
		return fl;
	}

	public static void setFl(FileReader fl) {
		SelectionSort.fl = fl;
	}

	public static BufferedReader getBf() {
		return bf;
	}

	public static void setBf(BufferedReader bf) {
		SelectionSort.bf = bf;
	}
}
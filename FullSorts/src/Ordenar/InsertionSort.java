package Ordenar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class InsertionSort {
	
	private static String[] nome = new String[230];
	private static String linha;
	private static FileReader fl;
	private static BufferedReader bf;
	
	public static void main(String[] args) {
		
		int num [] = {2, 5, 9, 1, 4, 7, 6};
		
		for (int i = 1; i < num.length; i++) {
			int eleito = num[i];
			
			for (int j = i - 1; j >= 0 && num[j] > eleito; j--) {
				num[j+1] = num[j];
				num[j] = eleito;
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
		InsertionSort.nome = nome;
	}

	public static String getLinha() {
		return linha;
	}

	public static void setLinha(String linha) {
		InsertionSort.linha = linha;
	}

	public static FileReader getFl() {
		return fl;
	}

	public static void setFl(FileReader fl) {
		InsertionSort.fl = fl;
	}

	public static BufferedReader getBf() {
		return bf;
	}

	public static void setBf(BufferedReader bf) {
		InsertionSort.bf = bf;
	}
}

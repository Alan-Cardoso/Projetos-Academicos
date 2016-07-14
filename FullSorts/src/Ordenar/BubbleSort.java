package Ordenar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BubbleSort {
	
	private static String[] nome = new String[230];
	private static String linha;
	private static FileReader fl;
	private static BufferedReader bf;
	
	public static void main(String[] args) {
		lerArquivo();
		ordenar(nome);
		
	}
	
	public static void lerArquivo() {

		try {
			fl = new FileReader("10 Mil numeros");
			bf = new BufferedReader(fl);
			while ((linha = bf.readLine()) != null) {
				nome = linha.split(", ");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static String[] ordenar(String[] vetor) {
		Object aux = 0;

		for (int i = vetor.length - 1; i > 1; i--) {

			for (int j = 0; j < i; j++) {

				if (vetor[j].compareTo(vetor[j + 1]) > 0) {

					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = (String) aux;
				}
			}
		}
		return vetor;
	}
}
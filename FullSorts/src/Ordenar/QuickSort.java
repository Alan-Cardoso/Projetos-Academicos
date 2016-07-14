package Ordenar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class QuickSort {
	
	private static String[] nome = new String[10_001];
	static String linha;
	private static FileReader fl;
	private static BufferedReader bf;
	
	public static void main(String[] args) {
		
		String[] palaveas = {"q", "w", "e", "r", "t", "a", "s", "d", "k", "b", "o", "c"};
		Ordenar(palaveas, 0, palaveas.length -1);
		System.out.println(Arrays.toString(nome));
	}
	
	static void Ordenar(String [] num, int inicio, int fim){
		
		if (inicio < fim) {
			int posicaoPivo = separar(num, inicio, fim);
			Ordenar(num, inicio, posicaoPivo - 1);
			Ordenar(num, posicaoPivo + 1, fim);
		}
	}


	static int separar(String [] vetor, int inicio, int fim){
		
		String pivo = vetor[inicio];
		
		for (int i = inicio + 1; i <= fim;) {
			if (vetor[i].compareTo(pivo) <= 0) {
				i++;
			}else if(pivo.compareTo(vetor[fim]) < 0){
				fim--;
			}else{
				String troca = vetor[i];
				vetor[i] = vetor[fim];
				vetor[fim] = troca;
				i++;
				fim--;
			}
		}
		
		vetor[inicio] = vetor[fim];
		vetor[fim] = pivo;
		return fim;
	}

	public static String[] getNome() {
		return nome;
	}

	public static void setNome(String[] nome) {
		QuickSort.nome = nome;
	}

	public static String getLinha() {
		return linha;
	}

	public static void setLinha(String linha) {
		QuickSort.linha = linha;
	}

	public static FileReader getFl() {
		return fl;
	}

	public static void setFl(FileReader fl) {
		QuickSort.fl = fl;
	}

	public static BufferedReader getBf() {
		return bf;
	}

	public static void setBf(BufferedReader bf) {
		QuickSort.bf = bf;
	}
	
}
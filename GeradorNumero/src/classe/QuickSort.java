package classe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class QuickSort {

	public static String[] vetor = new String[10_000];
	public static String linha;
	public static FileReader fl;
	public static BufferedReader bf;

	public static void main(String[] args) {

		try {
			fl = new FileReader("10 Mil");
			bf = new BufferedReader(fl);
			while ((linha = bf.readLine()) != null) {
				vetor = linha.split(", ");
			}
			
			ordenar(vetor, 0, vetor.length-1);
			
			//Arrays.sort(vetor);
			System.out.println(Arrays.toString(vetor));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static String[] ordenar(String[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			ordenar(vetor, inicio, posicaoPivo - 1);
			ordenar(vetor, posicaoPivo + 1, fim);
		}

		return vetor;
	}

	public static int separar(String[] vetor, int inicio, int fim) {
		String pivo = vetor[inicio];

		while ((inicio + 1) <= fim) {
			if (vetor[inicio].compareTo(pivo) <= 0) {
				inicio++;
			} else if (pivo.compareTo(vetor[fim]) < 0) {
				fim--;
			} else {
				String troca = vetor[inicio];
				vetor[inicio] = vetor[fim];
				vetor[fim] = troca;
				inicio++;
				fim--;
			}
		}

		vetor[inicio] = vetor[fim];
		vetor[fim] = pivo;
		return fim;

	}
}

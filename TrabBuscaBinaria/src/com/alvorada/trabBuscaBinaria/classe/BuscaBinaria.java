package com.alvorada.trabBuscaBinaria.classe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Collator;
import java.text.Normalizer;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author AlanCardoso
 *
 */
public class BuscaBinaria {

	static String[] nome = new String[230];
	static String linha;
	static FileReader fl;
	static BufferedReader bf;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		start();
	}

	public static void start() {
		
		lerArquivo();
		System.out.println("Digite o nome a ser Procurado: ");
		String nomeProc = sc.nextLine();
		System.out.println(buscar(nome, nomeProc));
	}

	public static void lerArquivo() {

		try {
			fl = new FileReader("Nomes Ordenados.txt");
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

	public static String buscar(String[] vetor, String nomeProc) {

		int inicio = 0;
		int fim = vetor.length - 1;
		int pivo = (inicio + fim) / 2;
		int i = 0;
		while (i < vetor.length) {

			

			if (vetor[pivo].compareToIgnoreCase(nomeProc) == 0) {

				return "O nome " + nomeProc + ", foi encontado na posição: "
						+ pivo;
			}

			if (vetor[i].compareTo(nomeProc) == 0) {

				return "O nome " + nomeProc + ", foi encontado na posição: " + i;
			} else if (vetor[i].compareToIgnoreCase(nomeProc) > 0) {

				fim = pivo - 1;
			} else if (vetor[i].compareToIgnoreCase(nomeProc) < 0) {

				inicio = pivo + 1;
			} else {
				return "O nome " + nomeProc + ", foi encontado na posição: " + i;
			}
			i++;
		}

		return "O nome " + nomeProc + ", não foi encontado no Array!!!";
	}
}
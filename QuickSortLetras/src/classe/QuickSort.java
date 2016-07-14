package classe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class QuickSort {
	
	private static String[] nome = new String[230];
	private static String linha;
	private static FileReader fl;
	private static BufferedReader bf;
	
	public static void main(String[] args) {
		
		lerArquivo();
		int inicio = 0;
		int fim = nome.length-1;
		
		Ordenar(nome, inicio, fim);
		
		System.out.println(Arrays.toString(nome));
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
	
	static void Ordenar(String [] vetor, int inicio, int fim){
		
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			Ordenar(vetor, inicio, posicaoPivo - 1);
			Ordenar(vetor, posicaoPivo + 1, fim);
		}
	}
	
	static int separar(String [] vetor, int inicio, int fim){
		
		String pivo = vetor[inicio];
		
		for (int i = inicio + 1; i <= fim;) {
			if (vetor[i].compareToIgnoreCase(pivo)  <= 0) {
				i++;
			}else if(pivo.compareToIgnoreCase(vetor[fim]) < 0){
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
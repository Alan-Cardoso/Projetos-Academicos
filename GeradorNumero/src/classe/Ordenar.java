package classe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ordenar {

	public static String[] vetor10Mil = new String[10_000];
	public static String[] vetorComeco = new String[1000];
	public static String[] vetorFinal = new String[1000];
	public static String linha;
	public static FileReader fl;
	public static BufferedReader bf;

	public static void main(String[] args) {

		try {
			fl = new FileReader("10 Mil");
			bf = new BufferedReader(fl);
			while ((linha = bf.readLine()) != null) {
				vetor10Mil = linha.split(", ");
			}

			Arrays.sort(vetor10Mil);
			System.out.println("Array Ordenado");
			System.out.println(Arrays.toString(vetor10Mil));

			System.out.println("\n 10% Começo");

			for (int i = 0; i < 1000; i++) {
				if (vetor10Mil[i] != null) {
					vetorComeco[i] = vetor10Mil[i];
				}
				if (vetor10Mil[1000+i] != null) {
					vetorFinal[i] = vetor10Mil[1000+i];
				}
			}
			System.out.println(Arrays.toString(vetorComeco));				
			System.out.println("\n 10% Final");
			System.out.println(Arrays.toString(vetorFinal));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
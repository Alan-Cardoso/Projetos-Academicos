package classe;

import java.util.Arrays;
import java.util.Random;

public class SortearNumeros {

	static int[] dezMil = new int[10_000];
	static int[] cemMil = new int[100_000];
	static int[] umMilhao = new int[1_000_000];
	static Random random = new Random();
	
	public static void main(String[] args) {
		sortDezMil(dezMil);
		
		System.out.println(Arrays.toString(dezMil));

	}
	
	public static int[] sortDezMil(int[] vetor) {
		int i = 0;
		while (vetor.length < dezMil.length) {
			int num = random.nextInt(10_001);
			
			for (int j = 0; j < vetor.length; j++) {
				if (num != vetor[j]) {
					vetor[i] = num;
				}
			}
//			i++;
		}
		
		return vetor;
	}
	
	public static int[] sortCemMil(int[] vetor) {
		return vetor;
	}
	
	public static int[] sortUmMilhao(int[] vetor) {
		return vetor;
	}
}
package tela;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Embararlhar {

	static ArrayList<Integer> num = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		preencheArray(num);
		embaralhar(num);
		
	}
		

	private static void preencheArray(ArrayList<Integer> num) {
		for (int i = 1; i < 100_000; i++) {
			num.add(i);
		}
		
		System.out.println(num.size());
	}

	public static void embaralhar(ArrayList<Integer> num) {
		Collections.shuffle(num);

		System.out.print(num.toString());
	}
}
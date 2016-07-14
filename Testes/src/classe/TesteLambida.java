package classe;

import java.util.ArrayList;
import java.util.Arrays;

public class TesteLambida {

	public static void main(String[] args) {

		  System.out.println("Imprime todos os elementos da lista!");
		  ArrayList<Integer> list2 = (ArrayList<Integer>) Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		  
		  for(Integer n: list2) {
		      System.out.println(n);
		  }
		  
		  System.out.println("Imprime todos os elementos da lista!");
		  ArrayList<Integer> list = (ArrayList<Integer>) Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		  
		  list.forEach(n -> System.out.println(n));

	}
}
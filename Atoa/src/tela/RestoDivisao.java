package tela;

import java.util.Scanner;

public class RestoDivisao {

	@SuppressWarnings("resource")
	public static void main(String[] Args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		int restoDivisao  = num % 2;
		
		System.out.println(restoDivisao);
	} 
}
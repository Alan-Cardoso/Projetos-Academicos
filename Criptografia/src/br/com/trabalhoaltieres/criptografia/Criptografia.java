package br.com.trabalhoaltieres.criptografia;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class Criptografia {
	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception {
		
		System.out.println("Digite uma string para ser Criptografada!\n");
		Scanner scanner = new Scanner(System.in);
		
		String frase  = scanner.nextLine();
		
		criptografar(frase, "MD5");
		criptografar(frase, "SHA-1");
		criptografar(frase, "SHA-256");
	}
	
	public static void criptografar(String dado, String tipoCriptografia) throws Exception {

		MessageDigest m = MessageDigest.getInstance(tipoCriptografia);
		m.update(dado.getBytes(), 0, dado.length());
		System.out.println(tipoCriptografia+": " + new BigInteger(1, m.digest()).toString(16)+"\n");
	}
}
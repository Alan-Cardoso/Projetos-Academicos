package br.com.lambida;

import java.util.Arrays;
import java.util.List;

public class Lambida {

	public static void main(String[] args) {

		List<String> lista = Arrays.asList("Alan", "João", "Jonata");

		lista.forEach(System.out::println);

		System.out.println("\n");

		lista.forEach((s) -> System.out.println(s.contains("la")));

	}
}
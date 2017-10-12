package trabalho1dosegundobimestre;

import java.util.Scanner;

public class Exercicio10For {

    public static void main(String[] args) {
        //Escreva um algoritmo que solicita 20 números e imprime no final a soma destes valores.

        int num, soma = 0;

        for (int i = 1; i < 21; i++) {
            Scanner valorTeclado = new Scanner(System.in);
            System.out.println("Digite o: " + i + "º numero");
            num = valorTeclado.nextInt();

            soma = soma + num;

        }
        System.out.println("A soma dos números digitados foi de: " + soma);
    }
}

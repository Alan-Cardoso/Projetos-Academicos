package trabalho1dosegundobimestre;

import java.util.Scanner;

public class Exercicio10DoWhile {

    public static void main(String[] args) {
        //Escreva um algoritmo que solicita 20 números e imprime no final a soma destes valores.

        int num, soma = 0, i = 1;

        do {
            Scanner valorTeclado = new Scanner(System.in);
            System.out.println("Digite o: " + i + "º numero");
            num = valorTeclado.nextInt();

            soma = soma + num;
            i++;
        } while (i < 21);
        System.out.println("A soma dos números digitados foi de: " + soma);
    }
}

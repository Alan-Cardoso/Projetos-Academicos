package trabalho1dosegundobimestre;

import java.util.Scanner;

public class Exercicio10While {

    public static void main(String[] args) {
        //Escreva um algoritmo que solicita 20 números e imprime no final a soma destes valores.

        int num, soma = 0, i = 1;

        while (i < 21) {
            Scanner valorTeclado = new Scanner(System.in);
            System.out.println("Digite o: " + i + "º numero");
            num = valorTeclado.nextInt();

            soma = soma + num;
            i++;
        }
        System.out.println("A soma dos números digitados foi de: " + soma);
    }
}

package trabalho1dosegundobimestre;

import java.util.Scanner;

public class Exercicio07While {

    public static void main(String[] args) {
        /*
         Escreva um algoritmo que lê o tamanho do lado de um quadrado e 
         imprime um quadrado daquele tamanho com asteriscos.
         Seu algoritmo deve funcionar para quadrados com lados de todos os tamanhos entre 1 e 20.

         Por exemplo, para lado igual a 5:
         *****
         *****
         *****
         *****
         *****
         */

        int num, tam = 1;
        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Digite um numero entre 1 e 20:");
        num = valorTeclado.nextInt();

        while (tam <= num * num) {
            if (tam % num == 0) {
                System.out.printf("*\n");
            } else {
                System.out.printf("*");
            }
            tam++;
        }
    }
}

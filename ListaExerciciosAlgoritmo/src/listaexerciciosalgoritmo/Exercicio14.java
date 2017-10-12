
package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        /*
        Faça um Programa que leia um número e exiba o dia correspondente da semana.
        (1- Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
        */
        Scanner valorTeclado = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite um número corespndente com o dia sa semana: ");
        numero = valorTeclado.nextInt();
        if(numero == 1){
            System.out.println("'Domingo'");
        }else if(numero == 2){
            System.out.println("'Segunda-feira'");
        }else if(numero == 3){
            System.out.println("'Terça-feira'");
        }else if(numero == 4){
            System.out.println("'Quarta-feira'");
        }else if(numero == 5){
            System.out.println("'Quinta-feira'");
        }else if(numero == 6){
            System.out.println("'Sexta-feira'");
        }else if(numero == 7){
            System.out.println("'Sábado'");
        }
    }
}


package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //Faça um Programa que peça para entrar com um ano com 4 dígitos e determine se o mesmo é ou não bissexto.
        int ano;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Entre com o Ano");
        ano = teclado.nextInt ();
        
        boolean ehBissexto = ano%4==0 && ano%100!=0 || ano%400==0;
        
         if (ehBissexto) {
            System.out.println("É Bissexto:");
        } else {
            System.out.println("Não é Bissexto:");
        }
    }
}
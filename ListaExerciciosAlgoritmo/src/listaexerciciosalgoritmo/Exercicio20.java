
package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        //Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
        
        int ano;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Entre com o Ano");
        ano = teclado.nextInt ();
                
         if (ano%4==0 && ano%100!=0 || ano%400==0) {
            System.out.println("É Bissexto:");
        } else {
            System.out.println("Não é Bissexto:");
        }
    }
}

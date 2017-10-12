
package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        /*Faça um Programa que leia um número inteiro menor que 1000 e 
        imprima a quantidade de centenas, dezenas e unidades do mesmo.
        */
        int numero;
        
        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Digite um número menor que 1000");
        numero = valorTeclado.nextInt();
        
        if(numero > 1000){
            System.out.println("O núumero digitado tem que ser menor que 1000");
        }else{
            System.out.println("O número digitado tem "+ numero / 100 + " centerna(s), " + numero / 10 + " dezena(s) e " + numero + " Unidade(s).");
        }
    }
}
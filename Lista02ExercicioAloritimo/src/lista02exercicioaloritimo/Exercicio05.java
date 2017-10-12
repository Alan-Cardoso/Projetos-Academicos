
package lista02exercicioaloritimo;

import java.util.Scanner;


public class Exercicio05 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia 50 valores e encontre o maior e o menor deles. Mostre o resultado.
    
        int numero = 0, maior, menor, i;
            Scanner valorTeclado = new Scanner(System.in);
            
            menor = numero;
            maior = numero;

            for(i = 1; i < 5;){
                
                System.out.println("Entre com o "+i+"º numero: ");
                numero = valorTeclado.nextInt();

                menor = numero;
                maior = numero;
                
                if(numero > maior){
                    maior = numero;
                }
                if(numero < menor){
                    menor = numero;
                }
            }
            System.out.println("O maior numero e: "+maior);
            System.out.println("O menor numero e: "+menor);
    }
}
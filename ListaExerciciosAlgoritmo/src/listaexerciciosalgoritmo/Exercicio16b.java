
package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio16b {
    public static void main(String[] args) {
        /*Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
        Dica: utilize o operador módulo (resto da divisão).
        */
        int numero= 0;
        
        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = valorTeclado.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("O número digitado é PAR!");
        }else{
            System.out.println("O número digitado é IMPAR!");
        }
    }
}

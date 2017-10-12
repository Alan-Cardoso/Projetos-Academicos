

package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
        int numero;
        
        Scanner variavelTeclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = variavelTeclado.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("O numero Digitado é PAR!");
        }else{
            System.out.println("O numero Digitado é IMPAR!");
        }
    }
}

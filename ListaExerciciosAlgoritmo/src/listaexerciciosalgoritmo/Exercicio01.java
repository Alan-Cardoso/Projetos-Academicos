
package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Faça um Programa que peça dois números e imprima o maior deles.
        int numero1 = 0;
        int numero2 = 0;
        boolean condicao = numero1 > numero2;
        
        Scanner variavelTeclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero1 = variavelTeclado.nextInt();
        System.out.println("Digite outro numero: ");
        numero2 = variavelTeclado.nextInt();
        
        if(condicao){
            System.out.println("O maior numero digitado foi o " + numero1);
        }else{
            System.out.println("O maior numero digitado foi o " + numero2);
        }    
    }
}

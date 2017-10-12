
package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        /*
        Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
        Dica: utilize uma função de arredondamento.
        */
        int numero1;
        double numero2;
        
        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero2 = valorTeclado.nextDouble();
        numero1 = (int) numero2;

        if (numero2-numero1 != 0) {
        System.out.println("O número Digitado é Decimal!");
        }
        else {
        System.out.println("O número Digitado é Inteiro!");
        }
    }
}

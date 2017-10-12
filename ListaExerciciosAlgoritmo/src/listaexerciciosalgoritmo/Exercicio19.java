
package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        /*
        Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c.
        O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:

        Se o usuário informar o valor de A igual a zero,
        a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
        Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
        Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informea ao usuário;
        Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
        */

        double Delta, x1, x2;
        int  a, b, c;
        
        Scanner variavelTeclado = new Scanner(System.in);
        
        System.out.println("Digite o valor de 'a': ");
        a = variavelTeclado.nextInt();
                
        if (a ==0 ) {
            System.out.println("A equação não é do segundo grau!");
        }else{
           System.out.println("Digite o valor de 'b': ");
            b = variavelTeclado.nextInt();

            System.out.println("Digite o valor de 'c': ");
            c = variavelTeclado.nextInt();

            Delta = (b * b - 4 * a * c);

            if (Delta < 0) {
                System.out.println("A equação não possui raizes reais!");
            } else {
                if (Delta == 0) {
                    System.out.println("A equação possui apenas uma raiz real: ");
                    x1 = (double) ((-b + Math.sqrt(Delta)) / (2 * a));
                    x2 = (double) ((-b - Math.sqrt(Delta)) / (2 * a));
                    System.out.println("X' = " + x1);
                    System.out.println("X'' = " + x2);
                } else if(Delta > 0) {
                    System.out.println("A equação possui duas raiz reais: ");
                    x1 = (double) ((-b + Math.sqrt(Delta)) / (2 * a));
                    x2 = (double) ((-b - Math.sqrt(Delta)) / (2 * a));
                    System.out.println("X' = " + x1);
                    System.out.println("X'' = " + x2);
                }
            } 
        }
    }
}


package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        /*
        Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
        Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.

        Dicas:
        Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
        Triângulo Equilátero: três lados iguais;
        Triângulo Isósceles: quaisquer dois lados iguais;
        Triângulo Escaleno: três lados diferentes;
        */
        double lado1, lado2, lado3;
                
        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro lado");
        lado1 = valorTeclado.nextDouble();
        System.out.println("Digite o valor do segundo lado");
        lado2 = valorTeclado.nextDouble();
        System.out.println("Digite o valor do terceiro lado");
        lado3 = valorTeclado.nextDouble();
        boolean condicao1 = (lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado3 + lado2) > lado1;
        boolean condicao2 = (lado1 + lado2) < lado3 || (lado1 + lado3) < lado2 || (lado3 + lado2) < lado1;
        boolean condicao3 = lado1 == lado2 && lado1 == lado3;
        boolean condicao4 = lado1 == lado2 && lado1 != lado3 && lado2 != lado3 || lado1 == lado3 && lado1 != lado2 && lado3 != lado2||lado3 == lado2 && lado2 != lado1 && lado3 != lado1;
        boolean condicao5 = lado1 != lado2 && lado1 != lado3 && lado2 != lado3;
        
        if(condicao1){
            System.out.println("Os lados formam um Triângulo.");
        }else {
            System.out.println("Os lados não formam um Triângulo.");
        }
        
        if(condicao1 && condicao3){
            System.out.println("É um um Triângulo Equilátero ");
        }else if(condicao1 && condicao4){
            System.out.println("É um Triângulo Isósceles");
        }else if(condicao1 && condicao5){
            System.out.println("É um Triângulo Escaleno");
        }
    }
}

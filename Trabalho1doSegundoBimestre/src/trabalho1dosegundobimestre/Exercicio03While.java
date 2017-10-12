package trabalho1dosegundobimestre;

import java.util.Scanner;

public class Exercicio03While {

    public static void main(String[] args) {
        //Escreva um algortimo que recebe um inteiro e imprime de 1 até esse inteiro.
        int NumRecebido, numInicial = 1;

        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Informe um numero inteiro: ");
        NumRecebido = valorTeclado.nextInt();

        while (numInicial <= NumRecebido) {

            System.out.println(numInicial);
            numInicial++;
        }
    }
}

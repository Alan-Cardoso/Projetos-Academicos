package trabalho1dosegundobimestre;

import java.util.Scanner;

public class Exercicio03For {

    public static void main(String[] args) {
        //Escreva um algortimo que recebe um inteiro e imprime de 1 até esse inteiro.
        int NumRecebido;

        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Informe um numero inteiro: ");
        NumRecebido = valorTeclado.nextInt();

        for (int numInicial = 1; numInicial <= NumRecebido; numInicial++) {
            System.out.println(numInicial);
        }
    }
}

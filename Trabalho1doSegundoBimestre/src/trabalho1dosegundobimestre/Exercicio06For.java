package trabalho1dosegundobimestre;

import java.util.Scanner;

public class Exercicio06For {

    public static void main(String[] args) {
        //Escreva um algoritmo que solicite 20 números e diga quantos são negativos e quantos são positivos.
        int num, positivo = 0, negativo = 0;

        for (int cont = 1; cont < 21; cont++) {
            Scanner valorTeclado = new Scanner(System.in);
            System.out.println("Digite o: " + cont + "º numero.");
            num = valorTeclado.nextInt();

            if (num < 0) {
                negativo = negativo + 1;
            }
            if (num > 0) {
                positivo = positivo + 1;
            }
        }
        System.out.println("Foram digitados " + negativo + " numro(s) negativo(s)");
        System.out.println("Foram digitados " + positivo + " numero(s) positivo(s)");
    }
}

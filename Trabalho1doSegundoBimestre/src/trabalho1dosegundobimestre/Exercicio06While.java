package trabalho1dosegundobimestre;

import java.util.Scanner;

public class Exercicio06While {

    public static void main(String[] args) {
        //Escreva um algoritmo que solicite 20 números e diga quantos são negativos e quantos são positivos.
        int num, positivo = 0, negativo = 0, cont = 1;

        while (cont < 21) {
            Scanner valorTeclado = new Scanner(System.in);
            System.out.println("Digite o: " + cont + "º numero.");
            num = valorTeclado.nextInt();

            if (num < 0) {
                negativo = negativo + 1;
            }
            if (num > 0) {
                positivo = positivo + 1;
            }
            cont++;
        }
        System.out.println("Foram digitados " + negativo + " numro(s) negativo(s)");
        System.out.println("Foram digitados " + positivo + " numero(s) positivo(s)");
    }
}

package trabalho1dosegundobimestre;

import java.util.Scanner;

public class Exercicio08DoWhile {

    public static void main(String[] args) {

        /*
         Escreva um algoritmo que solicita um nome de usuário e quantidade de vezes este nome deve ser impresso. Após isso imprima o nome informado na quantidade informada.
         Por exemplo, nome: Altieres, 3 vezes:
         Altieres
         Altieres
         Altieres
         */
        String nome;
        int valorVezes, num = 1;
        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Entre com um nome: ");
        nome = valorTeclado.next();
        System.out.println("Entre com o numero de vezes que o nome deve se repetir: ");
        valorVezes = valorTeclado.nextInt();

        do {
            System.out.println(nome);
            num++;
        } while (num <= valorVezes);
    }
}

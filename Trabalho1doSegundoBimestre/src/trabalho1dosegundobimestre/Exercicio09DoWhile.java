package trabalho1dosegundobimestre;

import java.util.Scanner;

public class Exercicio09DoWhile {

    public static void main(String[] args) {
        //Escreva um algoritmo que pergunta um número ao usuário, e mostra sua tabuada completa (de 1 até 10).
        int numTabuada, num = 1;
        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Entre com o numero, que você deseja que a tabuada do mesmo seja mostrada: ");
        numTabuada = valorTeclado.nextInt();

        do {
            System.err.println(numTabuada + " X " + num + " = " + numTabuada * num);
            num++;
        } while (num <= 10);
    }
}

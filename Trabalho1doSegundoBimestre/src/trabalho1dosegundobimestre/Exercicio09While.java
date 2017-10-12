package trabalho1dosegundobimestre;

import java.util.Scanner;

public class Exercicio09While {

    public static void main(String[] args) {
        //Escreva um algoritmo que pergunta um número ao usuário, e mostra sua tabuada completa (de 1 até 10).
        int numTabuada, num = 1;
        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Entre com o numero, que você deseja que a tabuada do mesmo seja mostrada: ");
        numTabuada = valorTeclado.nextInt();

        while (num <= 10) {
            System.err.println(numTabuada + " X " + num + " = " + numTabuada * num);
            num++;
        }
    }
}

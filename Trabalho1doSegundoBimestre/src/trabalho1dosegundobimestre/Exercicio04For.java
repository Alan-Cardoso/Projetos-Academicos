package trabalho1dosegundobimestre;

import java.util.Scanner;

public class Exercicio04For {

    public static void main(String[] args) {
        /*
         Escreva um algortimo que pergunte ao usuário quantos alunos tem na sala dele.
         Em seguida, pedir ao usuário para que entre com as notas de todos os alunos da sala, um por vez.
         Por fim, o algoritmo deve mostrar a média aritmética da turma.
         */

        int numAlunos;
        double numNotas;
        double soma = 0;
        double media;
        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Entre com a quantidade de alunos existemtes na sala de aula: ");
        numAlunos = valorTeclado.nextInt();

        for (int i = 1; i <= numAlunos; i++) {
            System.out.println("Entre com a nota do " + i + "º aluno: ");
            numNotas = valorTeclado.nextDouble();

            soma = soma + numNotas;

        }
        media = soma / numAlunos;
        System.out.println("A média aritmética da turma é de: " + media);
    }
}

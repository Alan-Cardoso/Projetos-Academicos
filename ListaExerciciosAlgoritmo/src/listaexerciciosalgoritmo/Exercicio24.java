
package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        /*
        Faça um Programa para ler três idades de alunos e seguir as seguintes instruções:
        Se a média de idade dos alunos é inferior de 25, apresentar a mensagem "Turma Jovem";
        Se a média de idade dos alunos é entre 25 e 40, apresentar a mensagem "Turma Adulta";
        Se a média de idade dos alunos é acima de 40 anos, apresentar a mensagem "Turma Idosa".
        */
        int idade1 = 0,idade2 = 0, idade3 = 0;
        Scanner valorteclado = new Scanner(System.in);
        System.out.println("Digite a Idade do primeiro aluno: ");
        idade1 = valorteclado.nextInt();
        System.out.println("Digite a Idade do segundo aluno: ");
        idade2 = valorteclado.nextInt();
        System.out.println("Digite a Idade do terceiro aluno: ");
        idade3 = valorteclado.nextInt();
        double mediaIdade = (idade1 + idade2 + idade3) / 3;
        if(mediaIdade < 25){
            System.out.println("Turma Jovem!");
        }else if(mediaIdade >= 25 && mediaIdade < 40){
            System.out.println("Turma Adulta!");
        }else if(mediaIdade > 40){
            System.out.println("Turma Idosa!");
        }
    }
}

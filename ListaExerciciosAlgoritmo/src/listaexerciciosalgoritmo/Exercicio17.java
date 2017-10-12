
package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        /*
        Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre,
        e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:

        Entre 9.0 e 10.0 A
        Entre 7.5 e 9.0	B
        Entre 6.0 e 7.5	C
        Entre 4.0 e 6.0	D
        Média de Aproveitamento Conceito Entre 4.0 e zero.

        O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B
        ou C ou “REPROVADO” se o conceito for D ou E.
         */
        
        double nota1 = 0, nota2 = 0, media;
        
        Scanner notaTeclado = new Scanner(System.in);
        System.out.println("Digite a Primeira nota: ");
        nota1 = notaTeclado.nextDouble();
        System.out.println("Digite a Segunda nota: ");
        nota2 = notaTeclado.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        if(media >= 9.0){
            System.out.println("As duas notas foram: " +nota1+" e "+nota2+ " a média é de " +media+ " E o conceito foi 'A' - APROVADO");
        }else if(media >= 7.5 && media < 9.0){
            System.out.println("As duas notas foram: " +nota1+" e "+nota2+ " a média é de " +media+ " E o conceito foi 'B' - APROVADO");
        }else if(media >= 6.0 && media < 7.5){
            System.out.println("As duas notas foram: " +nota1+" e "+nota2+ " a média é de " +media+ " E o conceito foi 'C' - APROVADO");
        }else if(media >= 4.0 && media < 6.0){
            System.out.println("As duas notas foram: " +nota1+" e "+nota2+ " a média é de " +media+ " E o conceito foi 'D' - REPROVADO");
        }else if(media < 4.0){
            System.out.println("As duas notas foram: " +nota1+" e "+nota2+ " a média é de " +media+ " E o conceito foi 'E' - REPROVADO");
        }
    }
}

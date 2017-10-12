
package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
        Faça um programa para a leitura de duas notas parciais de um aluno.
        O programa deve calcular a média alcançada por aluno e apresentar:

        A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        A mensagem "Reprovado", se a média for menor do que sete;
        A mensagem "Aprovado com Distinção", se a média for igual a dez.
        */       
        double nota1 = 0, nota2 = 0, media;
        
        Scanner notaTeclado = new Scanner(System.in);
        System.out.println("Digite a Primeira nota: ");
        nota1 = notaTeclado.nextDouble();
        System.out.println("Digite a Segunda nota: ");
        nota2 = notaTeclado.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        if(media >= 7.0 && media < 10.0){
            System.out.println("Aprovado!");
        }else if(media == 10.0){
            System.out.println("Aprovado com Distinção");
        }else if(media < 7.0){
            System.out.println("Reprovado!");
        }
    }
}

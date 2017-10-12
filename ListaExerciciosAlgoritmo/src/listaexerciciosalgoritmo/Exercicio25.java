
package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        /*
        Faça um Programa para leitura de três notas parciais de um aluno.
        O programa deve calcular a média alcançada por aluno e presentar:
        A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
        A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
        A mensagem "Aprovado com Distinção", se a média for igual a 10.
        */
        double nota1 = 0,nota2 = 0, nota3 = 0;
        Scanner valorteclado = new Scanner(System.in);
        System.out.println("Digite a Primeira nota: ");
        nota1 = valorteclado.nextDouble();
        System.out.println("Digite a Segunda nota: ");
        nota2 = valorteclado.nextDouble();
        System.out.println("Digite a Terceira nota: ");
        nota3 = valorteclado.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        if(media >= 7.0 && media < 10.0){
            System.out.println("''Aprovado!'', e a média foi de: " + media);
        }else if(media < 7.0){
            System.out.println("''Reprovado!'', e a média foi de: " + media);
        }else if(media == 10.0){
            System.out.println("''Aprovado com Distinção!'', e a média foi de: " + media);
        }
    }
}

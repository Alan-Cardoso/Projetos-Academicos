package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio16a {
    public static void main(String[] args) {
        /*
        Altere o programa que calcula a média do aluno, e mostre a mensagem de acordo com a média.
        De 0 a 3 - Reprovado, de 3 a 6.9 - Em Exame, de 7 a 10 - Aprovado
        */
        double nota1 = 0, nota2 = 0, media;
        
        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = valorTeclado.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = valorTeclado.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
         if(media < 3.0){
            System.out.println("Reprovado!");
        }else if(media >= 3.0 && media < 7.0){
            System.out.println("Em exame!");
        }else if(media > 6.9){
            System.out.println("Aprovado!");
        }
    }
}

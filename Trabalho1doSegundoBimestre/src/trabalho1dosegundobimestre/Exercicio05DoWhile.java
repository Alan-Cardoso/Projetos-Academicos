package trabalho1dosegundobimestre;

import java.util.Scanner;

public class Exercicio05DoWhile {

    public static void main(String[] args) {
        int num, maior = 0, menor = 0;
        double media, soma = 0;
        int cont = 1;

        do {
            Scanner valorTeclado = new Scanner(System.in);
            System.out.println("Digite o " + cont + "º número:");
            num = valorTeclado.nextInt();

            if (cont == 1) {
                maior = num;
                menor = num;
            }
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }

            soma = soma + num;
            media = soma / 10;

            cont++;
        } while (cont <= 10);
        System.out.println("O maior número digitado foi o: " + maior);
        System.out.println("O menor número digitado foi o: " + menor);
        System.out.println("A média entre os dumeros digitados é de: " + media);
    }
}

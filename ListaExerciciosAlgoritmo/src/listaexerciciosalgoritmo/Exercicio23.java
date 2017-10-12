
package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        /*
        Faça um Programa para um caixa eletrônico.
        O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor serão fornecidas.
        As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais.
        O programa não deve se preocupar com a quantidade de notas existentes na máquina.
        */
        int cem = 0, cinquenta = 0, dez = 0, cinco = 0, um = 0;
        int valor;
        int temp;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor do saque: ");
         valor = Integer.parseInt(entrada.nextLine());
        temp = valor;
        
        if(valor < 10){
            System.out.println("O valor mínimo do saque é de R$ 10,00");
        }else if(valor > 600){
            System.out.println("O valor máximo do saque é de R$ 600,00");
        }else{
            if(temp >= 100){
            cem = valor / 100;
            temp = valor % 100;
            }
            if(temp >= 50){
              cinquenta = temp / 50;
              temp = temp % 50;
            }
            if(temp >= 10){
              dez = temp / 10;
              temp = temp % 10;
            }
            if(temp >= 5){
              cinco = temp / 5;
              temp = temp % 5;
            }
            if(temp >= 1){
              um = temp / 1;
            }
            System.out.println("serão fornecidas: ");
            System.out.printf("%d notas de 100\n", cem, " Reais");
            System.out.printf("%d notas de 50\n", cinquenta, " Reais");
            System.out.printf("%d notas de 10\n", dez, " Reais");
            System.out.printf("%d notas de 5\n", cinco, " Reais");
            System.out.printf("%d notas de 1\n", um, " Real");
        }
    }
}
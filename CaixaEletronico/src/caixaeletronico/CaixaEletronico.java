package caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        int opcao = 0;
        System.err.println("Aperte o numero correspondente ao que você deseja fazer: ");
        System.err.println("1 - Saque, 2 - Deposito, 3 - Transferencia");
        System.err.println("");
        int opção = 0;

        switch (opcao) {
            case '1':
                int cem = 0,
                 cinquenta = 0,
                 dez = 0,
                 cinco = 0,
                 um = 0;
                int valor;
                int temp;

                Scanner entrada = new Scanner(System.in);
                System.out.println("Informe o valor do saque: ");
                valor = Integer.parseInt(entrada.nextLine());
                temp = valor;

                if (valor < 10) {
                    System.out.println("O valor mínimo do saque é de R$ 10,00");
                } else if (valor > 600) {
                    System.out.println("O valor máximo do saque é de R$ 600,00");
                } else {
                    if (temp >= 100) {
                        cem = valor / 100;
                        temp = valor % 100;
                    }
                    if (temp >= 50) {
                        cinquenta = temp / 50;
                        temp = temp % 50;
                    }
                    if (temp >= 10) {
                        dez = temp / 10;
                        temp = temp % 10;
                    }
                    if (temp >= 5) {
                        cinco = temp / 5;
                        temp = temp % 5;
                    }
                    if (temp >= 1) {
                        um = temp / 1;
                    }
                    System.out.println("serão fornecidas: ");
                    System.out.printf("%d notas de 100\n", cem, " Reais");
                    System.out.printf("%d notas de 50\n", cinquenta, " Reais");
                    System.out.printf("%d notas de 10\n", dez, " Reais");
                    System.out.printf("%d notas de 5\n", cinco, " Reais");
                    System.out.printf("%d notas de 1\n", um, " Real");
                    
                    break;
            case '50':
                System.out.println("Deposito");
                break;

            case '3':
                System.out.println("Transferencia");
                break;

            default:
                System.out.println("Entre com um número válido!!!");
        }
    }
}

package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        //Faça um Programa que leia três números e mostre-os em ordem decrescente.
              
        int n1, n2, n3;
        
        Scanner variavelTeclado = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        n1 = variavelTeclado.nextInt();
        System.out.println("Digite outro numero: ");
        n2 = variavelTeclado.nextInt();
        System.out.println("Digite mais um numero: ");
        n3 = variavelTeclado.nextInt();
        boolean condicao1 = n1 > n2 && n1 > n3 && n2 > n3;
        boolean condicao2 = n1 > n2 && n1 > n3 && n3 > n2;
        boolean condicao3 = n2 > n1 && n2 > n3 && n1 > n3;
        boolean condicao4 = n2 > n1 && n2 > n3 && n3 < n1;
        boolean condicao5 = n3 > n1 && n3 > n2 && n1 > n2;
        boolean condicao6 = n3 > n1 && n3 > n2 && n2 < n1;
        if(condicao1){
            System.out.println(n3 + "," + n2 + "," + n1);
        }else if(condicao2){
            System.out.println(n2 + "," + n3 + "," + n1);
        }else if(condicao3){
            System.out.println(n3 + "," + n1 + "," + n2);
        }else if(condicao4){
            System.out.println(n1 + "," + n3 + "," + n2);
        }else if(condicao5){
            System.out.println(n2 + "," + n1 + "," + n3);
        }else if(condicao6){
            System.out.println(n1 + "," + n2 + "," + n3);
        }
    }
}

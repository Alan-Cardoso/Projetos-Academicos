/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaexerciciosalgoritmo;

import java.util.Scanner;

/**
 *
 * @author Alan Cardoso
 */
public class Exercicio10 {
    public static void main(String[] args) {
        /*
        Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
        sabendo que a decisão é sempre pelo mais barato
        */
        
        double preco1 = 0, preco2 = 0, preco3 = 0;
        
        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Digite o valor do Primeiro produto");
        preco1 = valorTeclado.nextDouble();
        System.out.println("Digite o valor do Segundo produto");
        preco2 = valorTeclado.nextDouble();
        System.out.println("Digite o valor do Terceiro produto");
        preco3 = valorTeclado.nextDouble();
        
        if(preco1 < preco2 && preco1 < preco3){
            System.out.println("Compre o primeiro priduto poruqe ele custa R$ " + preco1 + " e é o mais barato!");
        }else if(preco2 < preco1 && preco2 < preco3 ){
            System.out.println("Compre o"
                    + " segundo poruqe ele custa R$ " + preco2 + " e é o mais barato!");
        }else if(preco3 < preco1 && preco3 < preco2){
            System.out.println("Compre o terceiro priduto, poruqe ele custa R$ " + preco3 + " e é o mais barato!");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursouniversidadexti;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alan Cardoso
 */
public class JogoDados {
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        
        System.out.println("Qual oseu palpite? ");
        int palpite = s.nextInt();
        
        Random n = new Random();
        int dado = n.nextInt(6)+1;
        
        System.out.println("Palpite= " + palpite);
        System.out.println("Dado= " + dado);
        
        if(palpite == dado){
            System.out.println("Acertou!!!");
        }else{
            System.out.println("Errou!!!");
        }
    }
}

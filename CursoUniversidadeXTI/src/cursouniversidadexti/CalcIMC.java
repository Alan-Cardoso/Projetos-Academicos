/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursouniversidadexti;

import java.util.Scanner;

/**
 *
 * @author Alan Cardoso
 */
public class CalcIMC {
    public static void main(String[] args) {
        
        //IMC = Peso / altura²
        
       double peso, altura;
       /**
       Scanner x = new Scanner(System.in);
       System.out.println("Digite seu peso em kilogramas: ");
       
       double peso  = x.nextDouble();
       
       System.out.println("Digite seu altura em metros: ");
       double altura  = x.nextDouble();
       */
       
       peso = 87;
       altura = 1.79;
       
       double IMC = peso / (altura * altura);
       
        System.out.println(IMC);
       
       
       
        
    }
}


package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: 
        F - Feminino, M - Masculino, Sexo Inválido.
        */
        
        String sexo = new String();
        String masculinoBD = "M";
        String femininoBD = "F";
        
        Scanner variavelTeclado = new Scanner(System.in);
        System.out.println("Digite seu sexo F ou M: ");
        sexo = variavelTeclado.next();
        
        if(masculinoBD.equalsIgnoreCase(sexo)){
            System.out.println("M - Masculino");
        }else if(femininoBD.equalsIgnoreCase(sexo)){
            System.out.println("F - Feminino");
        }else{
            System.out.println("Sexo Inválido!!!");
        } 
    } 
}
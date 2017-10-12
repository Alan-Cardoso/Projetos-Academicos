

package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        //Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
        
        String letra;
        
        Scanner variavelTeclado = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        letra = variavelTeclado.next();
        boolean condicao = letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u");
        
        if(condicao){
            System.out.println("A letra digitada é uma vogal!");
        }else if(!condicao){
            System.out.println("A letra digitada é uma consuante!");
        }
        
    }
}


package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
        Faça um Programa que pergunte em que turno você estuda. 
        Peça para digitar M- matutino ou V- Vespertino ou N- Noturno. 
        Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso
        */
        
        String periodo = new String();
        String manhaBD = "m"; 
        String tardeBD = "v";
        String noiteBD = "n";
        
        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Em que turno você estuda?");
        System.out.println("Digitar 'M' para matutino ou 'V' para Vespertino ou 'N' para Noturno.");
        periodo = valorTeclado.next();
        
        if (manhaBD.equalsIgnoreCase(periodo)){ 
            System.out.println("Bom Dia!"); 
        }else if(tardeBD.equalsIgnoreCase(periodo)){ 
            System.out.println("Boa Tarde!"); 
        }else if(noiteBD.equalsIgnoreCase(periodo)){
            System.out.println("Boa noite");
        }else{
            System.out.println("Valor Inválído");
        }
    }
}

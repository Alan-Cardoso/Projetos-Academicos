
package lista02exercicioaloritimo;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        /*Escrever um algoritmo que lê 10 valores, um de cada vez, e conta quantos deles estão no intervalo [10,20] e
        quantos deles estão fora do intervalo, escrevendo estas informações.*/
        int  numF  =  0;
        int numD  =  0;
        int i;
        int numero;
        Scanner  valorTeclado  =  new  Scanner (System.in);
        for( i  =  1 ;  i  <=  10 ;  i ++)  {
            System.out.println("Digite o "  + i + "º número.");
            numero  =  valorTeclado.nextInt();

            boolean condicao1 = numero  >=  10;
            boolean condicao2 = numero  <=  20;
            
            if( condicao1 && condicao2){
                    numD  =  numD +  1 ;
            } else{
                    numF  =  numF  +  1 ;
            }
        }
        System.out.println( "O número digitado foi: "  +  numD + ", e estão no intervalo de [10,20]" );
        System.out.println( "O número digitado foi: "  +  numF + ", e não estão no intervalo de [10,20" );
    }
}

package lista02exercicioaloritimo;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        Escrever um algoritmo que lê 5 pares de valores a, b, todos inteiros e positivos,
        um par de cada vez, e com a < b, escreve os inteiros pares de a até b, incluindo o a e o b se forem pares.
        */
        int a = 0 ;
        int b = 0;
	
        
        for (int i = 1; i < 6; i++){
            Scanner valorTeado = new Scanner(System.in);
            System.out.println("Digite o primeiro valor de 'a': ");
            a = valorTeado.nextInt();
            System.out.println("Digite o primeiro valor de 'b': ");
            b = valorTeado.nextInt();
            
            if(a > b){
                System.out.println("'a' tem que ser menor que 'b'");
            }else if(a < 0 && b < 0){
                System.out.println("Tanto os valores de 'a', quanto de 'b', tem que ser maior que '0' ");
            }else{
                boolean condicao1 = a % 2 == 0;
                boolean condicao2 = b % 2 ==0;
                if(condicao1 && condicao2){
                    System.out.println(a+""+b);
                }
            }
        }
    }
}

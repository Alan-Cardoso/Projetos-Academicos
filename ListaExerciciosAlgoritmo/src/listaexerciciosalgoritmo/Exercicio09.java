
package listaexerciciosalgoritmo;

public class Exercicio09 {
    public static void main(String[] args) {
        //Faça um Programa que leia três números e mostre o maior e o menor deles.
        
        int numero1 = 3;
        int numero2 = 6;
        int numero3 = 9;
                
        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("O maior número digitado foi o: " + numero1);
        }else if(numero2 > numero1 && numero2 > numero3 ){
            System.out.println("O maior numero digitado foi o: " + numero2);
        }else if(numero3 > numero1 && numero3 > numero2){
            System.out.println("O maior numero digitado foi o: " + numero3);
        }
        if(numero1 < numero2 && numero1 < numero3){
            System.out.println("O menor número digitado foi o: " + numero1);
        }else if(numero2 < numero1 && numero2 < numero3 ){
            System.out.println("O menor numero digitado foi o: " + numero2);
        }else if(numero3 < numero1 && numero3 < numero2){
            System.out.println("O menor numero digitado foi o: " + numero3);
        }
    }
}

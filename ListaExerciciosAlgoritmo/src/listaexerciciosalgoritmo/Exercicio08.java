
package listaexerciciosalgoritmo;

public class Exercicio08 {
    public static void main(String[] args) {
        //Faça um Programa que leia três números e mostre o maior deles.
        
        int numero1 = 5;
        int numero2 = 10;
        int numero3 = 15;
                
        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("O maior número digitado foi o: " + numero1);
        }else if(numero2 > numero1 && numero2 > numero3 ){
            System.out.println("O maior numero digitado foi o: " + numero2);
        }else if(numero3 > numero1 && numero3 > numero2){
            System.out.println("O maior numero digitado foi o: " + numero3);
        }
    }
}

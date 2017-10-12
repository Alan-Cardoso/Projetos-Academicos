
package lista02exercicioaloritimo;

public class Exercicio02 {
    public static void main(String[] args) {
       //Faça um algoritmo que calcule os 20 primeiros números primos, dados os tres primeiros 1,2 e 3.
        int quantidade = 20;
        int contador = 0;
        int numero = 0;              

        System.out.println(quantidade + " primeiros numeros primos são: ");
 
        for(contador = 0; contador < quantidade;){
            boolean primo = true;

            for(int j = 2; j <= (numero / 2); j++){
                if(numero % j == 0){
                    primo = false;
                }   
            }
            if((primo) && (numero > 1)){
                System.out.printf("%6d", numero);
                contador++;

                if(contador % 10 == 0){
                    System.out.println();
                }
            }numero++;
        }
    }
}

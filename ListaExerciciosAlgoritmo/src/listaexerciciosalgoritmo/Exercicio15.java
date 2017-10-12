
package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        /*
        Faça um Programa que tendo como dados de entrada o preço de custo de um produto e um código de origem,
        emita o preço junto de sua procedência. Caso o código não seja nenhum dos especificados,
        o produto deve ser classificado como importado. Código de origem:
        1 - Sul, 2 - Norte 3 - Leste, 4 - Oeste, 5 ou 6 - nordeste 7 ou 8 Centro-oeste.
        */
        int origem;
        double preco;
        
        Scanner valorTeclado = new Scanner(System.in);
        
        System.out.println("Digite o código de origem do produto: ");
        origem = valorTeclado.nextInt();
        System.out.println("Digite o preço do pr0duto: ");
        preco = valorTeclado.nextDouble();
        if(origem == 1){
            System.out.println("O peço do produto é de: " + preco + " E a sua procedência é do 'Sul'");
        }else if(origem == 2){
            System.out.println("O peço do produto é de: " + preco + " E a sua procedência é do 'Norte'");
        }else if(origem == 3){
            System.out.println("O peço do produto é de: " + preco + " E a sua procedência é do 'Leste'");
        }else if(origem == 4){
            System.out.println("O peço do produto é de: " + preco + " E a sua procedência é do 'Oeste'");
        }else if(origem == 5 || origem == 6){
            System.out.println("O peço do produto é de: " + preco + " E a sua procedência é do 'Nordeste'");
        }else if(origem == 7 || origem == 8){
            System.out.println("O peço do produto é de: " + preco + " E a sua procedência é do 'Centro-oeste'");
        }else {
            System.out.println("O peço do produto é de: " + preco + " E o protudo é 'Importado'");
        }
    }
}

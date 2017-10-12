package trabalho1dosegundobimestre;

public class Exercicio02While {

    public static void main(String[] args) {
        //Escreva um algoritmo que imprime todos os números pares de 1 até 100.
        for (int numero = 2; numero < 101; numero += 2) {
            System.out.println(numero);
        }

        int num = 2;
        while (num < 101) {
            System.out.println(num);
            num += 2;
        }
    }
}

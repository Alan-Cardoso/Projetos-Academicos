package trabalho1dosegundobimestre;

public class Exercicio02DoWhile {

    public static void main(String[] args) {
        //Escreva um algoritmo que imprime todos os números pares de 1 até 100.

        int num = 2;

        do {
            System.out.println(num);
            num += 2;
        } while (num < 101);
    }
}

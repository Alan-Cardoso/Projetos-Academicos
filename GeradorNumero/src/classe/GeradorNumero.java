package classe;

import java.util.Arrays;
import java.util.Random;

/**
 * @author AlanCardoso
 *
 */
public class GeradorNumero {

	public static void main(String[] args) {

		
		int[] vetor = new int[1_000_000];
		Random gerador = new Random();

		double inicio = System.currentTimeMillis();
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]= gerador.nextInt(vetor.length);
		}
		System.err.println(Arrays.toString(vetor)+"\n");
		double fim = System.currentTimeMillis();
		
		double ms = fim - inicio;
		int milesemo = (int) (ms % 1000), segundos = (int) ((ms / 1000) % 60), minutos = (int) ((ms / 60000) % 60), horas = (int) (ms / 3600000);

		
		System.out.println("Levou  "
				+ String.format("%02d:%02d:%02d:%03d", horas, minutos,
						segundos, milesemo)
				+ " seg. - para gerar " +vetor.length+" de numeros aleatórios");
	}
}
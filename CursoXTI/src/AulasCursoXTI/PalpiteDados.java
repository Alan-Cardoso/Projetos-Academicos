package AulasCursoXTI;

import java.util.Random;

import javax.swing.JOptionPane;

public class PalpiteDados {
	public static void main(String[] args) {

		Random random = new Random();
		int jogadaDado = (random.nextInt(12)) + 1;

		String numeroDados = JOptionPane
				.showInputDialog("Digite o seu palpite!");
		int palpite = Integer.parseInt(numeroDados);

		if (palpite == jogadaDado) {
			JOptionPane.showMessageDialog(null, "Você acertou o palpite!");
		} else {
			JOptionPane.showMessageDialog(null, "Você errou o palpite!");
		}

		System.out.println(jogadaDado);
	}
}
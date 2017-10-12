package classe;

public class ExemploForEach {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ExpArrySimples(num);
		
		int[][] num2 = new int[3][5];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				num2[i][j] = (i + 1) * (j + 1);
			}
		}

		
		ExpArryMult(num2);
	}

	static void ExpArrySimples(int[] num) {
		for (int x : num) {
			x *= 10;
			System.out.println(x + " ");
		}
	}

	static void ExpArryMult(int[][] num2) {

		int soma = 0;
		for (int[] x : num2) {
			for (int y : x) {
				System.err.println("O valor é " + y);
				soma += y;
			}
		}
		System.err.println("A soma é de: " + soma);
	}
};
package classe;

public class Exemplo3 {

	public static void main(String[] args) {

		one: for (int i = 0; i < 20; i++) {
			System.out.println("Alan");
		}

		for (int i = 0; i < 20; i++) {

			if (i < 10) {
				System.out.println(i);
			}
			if (i > 10 && i < 15) {
				continue one;
			}
		}

	}

}

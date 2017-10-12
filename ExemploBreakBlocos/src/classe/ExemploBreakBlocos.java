package classe;

public class ExemploBreakBlocos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {
			one: {
				two: {
					three: {
						System.out.println("\ni is " + i);
						if (i == 1)
							break one;
						if (i == 2)
							break two;
						if (i == 3)
//							break three;

						// essa parte numca sera alcançada
						System.out.println("Wont't block three");
					}
				}

			}

		}

	}

}

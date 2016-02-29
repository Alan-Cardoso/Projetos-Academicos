
public class OperacaoConjunto {

	
	static int[] a = {1, 2, 3, 4};
	static int[] b = {2, 6};
	
	public static void main(String[] args) {
		
		uniao();
		interseccao();
		subitracao();
		cardinalidade();
	}
	
	private static void uniao() {
		int[] arrayParcial = new int[4];
		int[] vetorParcial = new int[2];
		while (a != null) {
			arrayParcial[a[0]] = 1;
			arrayParcial[b[0]] = 1;			
		}
	}

	private static void interseccao() {
		// TODO Auto-generated method stub	
	}
	
	private static void subitracao() {
		// TODO Auto-generated method stub	
	}
	
	private static void cardinalidade() {
		// TODO Auto-generated method stub	
	}
}
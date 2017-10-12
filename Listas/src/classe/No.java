package classe;

public class No {
	//static No head;
	private Integer numero;
	private No prox;
	public No(Integer numero) {
		this.numero = numero;
	}

	
	

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}

	public void add(No head,Integer numero) {
		if (head == null) {
			head = new No(numero);

		} else {
			head.prox = new No(numero);
		}
	}

	public static void main(String[] args) {
		No head = null;

		System.out.println(head);
//		head.add(head,1);
//		System.out.println(head);

	}

}

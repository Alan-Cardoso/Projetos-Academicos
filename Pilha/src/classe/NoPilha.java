package zzzz;

public class NoPilha<T> {
	No topo;
	
	class No {
		T objeto;
		No proximo;
	}

	public void adicionar(No novo){
		if(topo != null){
			
		}else{
			topo = new No();
			topo.proximo = novo;
		}
	}
}
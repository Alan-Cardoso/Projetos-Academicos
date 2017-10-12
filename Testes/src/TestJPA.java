import java.util.ArrayList;

public class TestJPA {
	
	static DAO dao = new DAO();

	public TestJPA() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

//		Servico servico = new Servico();
		ArrayList<Servico> servico = dao.pesquisarPorNome();
		
		System.out.println(servico.get(0).getValor());

	}
}
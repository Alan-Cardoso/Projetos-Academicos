import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DAO {

	EntityManagerFactory emf;
	EntityManager em;
	
	public DAO() {

		emf = Persistence.createEntityManagerFactory("cardoso");
		em = emf.createEntityManager();
	}
	
	@SuppressWarnings("unused")
	public void  obterPorId(int id) {
		em.getTransaction().begin();
		Pessoa pessoa = em.find(Pessoa.class, id);
		
		em.getTransaction().commit();
		emf.close();
	}
	
	public void  salvar(Object objeto) {
		em.getTransaction().begin();
		em.merge(objeto);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void  remover(Pessoa pessoa) {
		em.getTransaction().begin();
		em.remove(pessoa);
		em.getTransaction().commit();
		emf.close();
	}
	

	@SuppressWarnings("unchecked")
	public ArrayList<Servico> pesquisarPorNome() {
		em.getTransaction().begin();
		// "select Servico.nome, Servico.valor from Servico servico  where Servico.nome = 'Piso'"
		Query consulta = em.createQuery("select new list(nome, valor) from Servico servico  where Servico.nome = 'Piso'");
		ArrayList<Servico> servico = (ArrayList<Servico>) consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return servico;
	}
}

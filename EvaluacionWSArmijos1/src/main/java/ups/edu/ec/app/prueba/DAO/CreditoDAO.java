package ups.edu.ec.app.prueba.DAO;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ups.edu.ec.app.prueba.EN.Credito;
import ups.edu.ec.app.prueba.EN.Pago;



public class CreditoDAO {

	@Inject
	private EntityManager em;
	public void crearCredito(Credito cre) {
		em.persist(cre);
	}
	
	public Credito buscarCredito(int numero) {
		String jpql= "select cre From Credito cre where cre.codigo = :numero";
		Query query = em.createQuery(jpql,Credito.class);
		query.setParameter("numero", numero);
		Credito credito = (Credito) query.getSingleResult();
		return credito;
	}
	
	
	public List<Credito> mostrar(){
		String jpql = "select cre from Credito cre";
		Query query = em.createQuery(jpql, Credito.class);
		List<Credito> creditos = query.getResultList();
		for (Credito credito : creditos ) {
			credito.getPagos().size();
		}
		return creditos;
	}
	public void nuevaTransaccion(Credito c) {
		em.persist(c);
	}
}

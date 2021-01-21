package ups.edu.ec.app.prueba.DAO;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ups.edu.ec.app.prueba.EN.Cuenta;



public class CuentaDAO {
	
	@Inject
	private EntityManager em;

	public void crearCuenta(Cuenta c) {
		em.persist(c);
	}
	
	public Cuenta buscarCuenta(int numero) {
		
		
		String jpql= "select c From Cuenta c where c.numeroCuenta = :numero";
		System.out.println("siodhsoiadh"+numero);
		Query query = em.createQuery(jpql,Cuenta.class);
		query.setParameter("numero", numero);
		Cuenta cuenta = (Cuenta) query.getSingleResult();
		return cuenta;
	}
	
	public List<Cuenta> mostrar(){
		String jpql = "select c from Cuenta c";
		Query query = em.createQuery(jpql, Cuenta.class);
		List<Cuenta> cuentas = query.getResultList();
		for (Cuenta cuenta : cuentas ) {
			cuenta.getCreditos().size();
		}
		return cuentas;
	}
}

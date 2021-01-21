package ups.edu.ec.app.prueba.DAO;

import javax.persistence.EntityManager;

import ups.edu.ec.app.prueba.EN.Pago;


public class PagoDAO {
	
	private EntityManager em;

	public void nuevaTransaccion(Pago p) {
		em.persist(p);
	}
}

package  ups.edu.ec.app.prueba.UTILS;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Recursos {

	@Produces
	@PersistenceContext
	private EntityManager em;
}
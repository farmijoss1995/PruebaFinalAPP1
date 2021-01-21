package ups.edu.ec.app.prueba.ON;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.app.prueba.DAO.CuentaDAO;
import ups.edu.ec.app.prueba.DAO.PagoDAO;

@Stateless
public class PagoON {

	@Inject
	private PagoDAO mdao;
	
	@Inject
	private CuentaDAO cdao;
	
}

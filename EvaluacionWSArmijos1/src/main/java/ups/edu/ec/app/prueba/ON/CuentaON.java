package ups.edu.ec.app.prueba.ON;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.app.prueba.DAO.CuentaDAO;
import ups.edu.ec.app.prueba.EN.Cuenta;

@Stateless
public class CuentaON {
	@Inject
	private CuentaDAO dao;
	public void crear(List<Cuenta>cuentas) {
		for(Cuenta cuenta : cuentas) {
			dao.crearCuenta(cuenta);
		}
	}
	public List <Cuenta> mostrar(){
		return dao.mostrar();
	}
	
}
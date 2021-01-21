package ups.edu.ec.app.prueba.ON;





import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;


import ups.edu.ec.app.prueba.DAO.CreditoDAO;
import ups.edu.ec.app.prueba.DAO.CuentaDAO;
import ups.edu.ec.app.prueba.DAO.PagoDAO;
import ups.edu.ec.app.prueba.DAO.Transaccion;
import ups.edu.ec.app.prueba.EN.Cuenta;
import ups.edu.ec.app.prueba.EN.Pago;
import ups.edu.ec.app.prueba.EN.Credito;

@Stateless
public class CreditoON {

	@Inject
	private CuentaDAO cdao;
	@Inject
	private CreditoDAO credao;
	@Inject
	private PagoDAO pagodao;
	
	public Cuenta Credito(Transaccion t) {
		
		Cuenta cue = cdao.buscarCuenta(t.getNumcuenta());
		
		if (cue != null) {
			Credito cre = new Credito ();
			cre.setMonto(t.getMonto());
			cre.setFecha(new Date());
			t.getPagouno();
			int anio=Integer.parseInt(t.getPagouno().substring(0,4));
			int mes=Integer.parseInt(t.getPagouno().substring(6,7));
			int dia=Integer.parseInt(t.getPagouno().substring(8,10));
			
			System.out.println(anio);
			for (int i = 1; i <= t.getCuotas(); i++) {
				Pago p = new Pago();
				
				p.setCuenta(t.getNumcuenta());
				p.setFechaPago(""+anio+"-"+mes+"-"+dia);
				p.setNumeroPago(i);
				p.setValor(t.getMonto()/t.getCuotas());
				cre.agregarpago(p);
				mes++;
				if(mes >=13) {
					anio++;
					mes=1;
				}
			}
			cue.agregarCredito(cre);
			credao.crearCredito(cre);
			
			return cue;
		}else {
			System.out.println("la cuenta no existe");
			return null;
		}
	}
	

	public Credito Lista(int codigo) {
		Credito cre = credao.buscarCredito(codigo);
		return cre;

		
	}


		

}

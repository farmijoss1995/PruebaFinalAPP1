package  ups.edu.ec.app.prueba.SER;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import ups.edu.ec.app.prueba.ON.CreditoON;

@WebService
public class WebServiceSoap {

		@Inject
		CreditoON on;
		
		@WebMethod
		public Respuesta transacciones( trx) {
			Respuesta r = new Respuesta();
			try {
				r = on.Transacciones(trx);
			} catch (Exception e) {
			e.printStackTrace();
			r.setCodigo(99);
			r.setMensaje(e.getMessage());
			}
			return r;
		}
		@WebMethod
		public Respuesta Deposito( Trans trx) {
			Respuesta r = new Respuesta();
			try {
				r = on.Deposito(trx);
			} catch (Exception e) {
			e.printStackTrace();
			r.setCodigo(99);
			r.setMensaje(e.getMessage());
			}
			return r;
	}
		@WebMethod
		public Respuesta Retiro(Trans trx) {
			Respuesta r = new Respuesta();
			try {
				r = on.Retiro(trx);
			} catch (Exception e) {
			e.printStackTrace();
			r.setCodigo(99);
			r.setMensaje(e.getMessage());
			}
			return r;}}

	
}

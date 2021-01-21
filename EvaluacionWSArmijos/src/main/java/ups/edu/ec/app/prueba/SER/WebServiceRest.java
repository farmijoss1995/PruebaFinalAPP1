package  ups.edu.ec.app.prueba.SER;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import  ups.edu.ec.app.prueba.EN.Credito;
import  ups.edu.ec.app.prueba.EN.Cuenta;
import  ups.edu.ec.app.prueba.ON.CreditoON;
import  ups.edu.ec.app.prueba.ON.CuentaON;

@Path("/creditos")
public class WebServiceRest {

	@Inject
	private CreditoON creon;
	
	@Inject
	private CuentaON con;
	
	
	@POST
	@Path("/nuevo")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	public Cuenta creditos(Transaccion transaccion){
		System.out.println(transaccion.toString());
		return creon.Credito(transaccion);
	}
	
	@POST
	@Path("/Cuenta")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	public Respuesta crear(List<Cuenta> c) {
		Respuesta r = new Respuesta();
		
		try {
			con.crear(c);
			r.setMensaje("cuenta Creada");
		}catch (Exception e) {
			// TODO: handle exception
			r.setMensaje("error cuenta no existe");;
			e.printStackTrace();
		}
		return r;
	}
	
	@GET
	@Path("/listar")
	@Produces({MediaType.APPLICATION_JSON})
	public Credito mostrar(@QueryParam ("codigo") int codigo){
		return creon.Lista(codigo);
	}

	
}

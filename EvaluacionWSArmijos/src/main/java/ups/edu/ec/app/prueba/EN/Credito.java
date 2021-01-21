package ups.edu.ec.app.prueba.EN;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Credito")

public class Credito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int codigo;
	private double monto;
	private Date fecha;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	
	private List <Pago>pagos;
	
	public void agregarpago(Pago p) {
		if (pagos == null) {
			pagos= new ArrayList<Pago>();
		}
		pagos.add(p);
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<Pago> getPagos() {
		return pagos;
	}


	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
	}
	
	
	

}

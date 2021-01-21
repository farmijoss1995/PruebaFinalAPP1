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
@Table(name="Cuenta")

public class Cuenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String nombres;
	private int numeroCuenta;
	
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	
	private List <Credito>creditos;
	
	public void agregarCredito(Credito cred) {
		if (creditos == null) {
			creditos = new ArrayList<Credito>();
		}
		creditos.add(cred);
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public List<Credito> getCreditos() {
		return creditos;
	}

	public void setCreditos(List<Credito> creditos) {
		this.creditos = creditos;
	}

}

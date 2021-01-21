package ups.edu.ec.app.prueba.EN;

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
@Table(name="Pago")

public class Pago {
	

	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private int codigo;
		private int cuenta;
		private int numeroPago;
		private String fechaPago;
		private Double valor;
		
		
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public int getCuenta() {
			return cuenta;
		}
		public void setCuenta(int cuenta) {
			this.cuenta = cuenta;
		}
		public int getNumeroPago() {
			return numeroPago;
		}
		public void setNumeroPago(int numeroPago) {
			this.numeroPago = numeroPago;
		}
		public String getFechaPago() {
			return fechaPago;
		}
		public void setFechaPago(String fechaPago) {
			this.fechaPago = fechaPago;
		}
		public Double getValor() {
			return valor;
		}
		public void setValor(Double valor) {
			this.valor = valor;
		}
		
		
}

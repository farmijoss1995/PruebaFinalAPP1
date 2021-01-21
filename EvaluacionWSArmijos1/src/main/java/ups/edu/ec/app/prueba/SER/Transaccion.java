package  ups.edu.ec.app.prueba.SER;

import java.util.Date;

public class Transaccion {

	private int numcuenta;
	private double monto;
	private int cuotas;
	private String pagouno;
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int getCuotas() {
		return cuotas;
	}
	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}

	
	public String getPagouno() {
		return pagouno;
	}
	public void setPagouno(String pagouno) {
		this.pagouno = pagouno;
	}
	public int getNumcuenta() {
		return numcuenta;
	}
	public void setNumcuenta(int numcuenta) {
		this.numcuenta = numcuenta;
	}
	@Override
	public String toString() {
		return "Transaccion [numcuenta=" + numcuenta + ", monto=" + monto + ", cuotas=" + cuotas + ", pagouno="
				+ pagouno + "]";
	}
	
	
	
}

package personaBarcoMascota;

import java.util.Date;

/**
 * Representa un barco
 *
 */
public class Barco implements Sonido {
	
	//Atributos
	private String nombre;
	private Date fechaConstrucci�n;
	private int numCamarotes;
	private Motor motor;
	
	//Constructores
	public Barco() {
		
	}
	
	public Barco(String nombre, Date fechaConstrucci�n, int numCamarotes, Motor motor) {
		this.nombre = nombre;
		this.fechaConstrucci�n = fechaConstrucci�n;
		this.numCamarotes = numCamarotes;
		this.motor = motor;
	}

	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaConstrucci�n() {
		return fechaConstrucci�n;
	}

	public void setFechaConstrucci�n(Date fechaConstrucci�n) {
		this.fechaConstrucci�n = fechaConstrucci�n;
	}

	public int getNumCamarotes() {
		return numCamarotes;
	}

	public void setNumCamarotes(int numCamarotes) {
		this.numCamarotes = numCamarotes;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	//toString
	@Override
	public String toString() {
		return "Barco [nombre=" + nombre + ", fechaConstrucci�n=" + fechaConstrucci�n + ", numCamarotes=" + numCamarotes
				+ ", motor=" + motor + "]";
	}
	
	//M�todos
	public void sonido() {
		System.out.println("toot toot!");
	}
	
	
	
}

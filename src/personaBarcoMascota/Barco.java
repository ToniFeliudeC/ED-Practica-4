package personaBarcoMascota;

import java.util.Date;

/**
 * Representa un barco
 *
 */
public class Barco implements Sonido {
	
	//Atributos
	private String nombre;
	private Date fechaConstrucción;
	private int numCamarotes;
	private Motor motor;
	
	//Constructores
	public Barco() {
		
	}
	
	public Barco(String nombre, Date fechaConstrucción, int numCamarotes, Motor motor) {
		this.nombre = nombre;
		this.fechaConstrucción = fechaConstrucción;
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

	public Date getFechaConstrucción() {
		return fechaConstrucción;
	}

	public void setFechaConstrucción(Date fechaConstrucción) {
		this.fechaConstrucción = fechaConstrucción;
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
		return "Barco [nombre=" + nombre + ", fechaConstrucción=" + fechaConstrucción + ", numCamarotes=" + numCamarotes
				+ ", motor=" + motor + "]";
	}
	
	//Métodos
	public void sonido() {
		System.out.println("toot toot!");
	}
	
	
	
}

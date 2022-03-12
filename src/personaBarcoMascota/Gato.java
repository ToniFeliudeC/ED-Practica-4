package personaBarcoMascota;

/**
 * Representa un gato
 *
 */
public class Gato extends Mascota {

	//Atributos
	private String raza;
	
	//Constructores
	public Gato() {
			
	}
	
	public Gato(String raza, String nombre, int edad) {
		this.raza = raza;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Getters & Setters 
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	//Métodos
	public void sonido() {
		System.out.println("Miaw, miaw, miaw...");
		
	}
	
}

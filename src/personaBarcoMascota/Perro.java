package personaBarcoMascota;

/**
 * Representa un perro
 *
 */
public class Perro extends Mascota {
	
	//Atributos
	private String raza;
	
	//Constructores
	public Perro() {
		
	}
	
	public Perro(String raza, String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}
	
	//Getters & Setters
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	//toString
	@Override
	public String toString() {
		return "Perro [raza=" + raza + "]";
	}
	
	//Métodos
	public void sonido() {
		System.out.println("Woof, woof, woof, woof!");
	}
	
	
	
}

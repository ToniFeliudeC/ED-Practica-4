package personaBarcoMascota;

/**
 * Representa una mascota
 *
 */
public abstract class Mascota implements Sonido {
	
	//Atributos
	protected String nombre;
	protected int edad;
	
	//Constructores
	public Mascota() {
		
	}
	
	public Mascota(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
}

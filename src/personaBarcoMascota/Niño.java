package personaBarcoMascota;

/**
 * Representa un niño
 *
 */
public class Niño extends Persona {
	
	//Atributos
	private String colegio;
	private Juguete[] juguetes = new Juguete[10];
	
	//Constructores
	public Niño() {

	}
	
	public Niño(String nombre, String dni, int edad, String colegio, Juguete[] juguetes) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.colegio = colegio;
		this.juguetes = juguetes;
	}

	//Getters & Setters
	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}

	public Juguete[] getJuguete() {
		return juguetes;
	}

	public void setJuguete(Juguete[] juguetes) {
		this.juguetes = juguetes;
	}

	//toString
	@Override
	public String toString() {
		return "Niño [colegio=" + colegio + ", juguete=" + juguetes + "]";
	}
	
	
	
}

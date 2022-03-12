package personaBarcoMascota;

/**
 * Represena un adulto
 *
 */
public class Adulto extends Persona {
	
	//Atributos
	private String nss;
	private String direccion;
	
	//Constructores
	public Adulto() {

	}
	
	public Adulto(String nss, String direccion, String nombre, String dni, int edad) {
		this.nss = nss;
		this.direccion = direccion;
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	//toString
	@Override
	public String toString() {
		return "Adulto [nss=" + nss + ", direccion=" + direccion + "]";
	}

	//Getters & Setters
	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}

package personaBarcoMascota;

/**
 * Representa un motor
 *
 */
public class Motor {
	
	//Atributos
	private String fabricante;
	private String potencia;
	private int codigo;
	
	//Constructores
	public Motor() {
		
	}
	
	public Motor(String fabricante, String potencia, int codigo) {
		this.fabricante = fabricante;
		this.potencia = potencia;
		this.codigo = codigo;
	}

	//Getters & Setters
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	//toString
	@Override
	public String toString() {
		return "Motor [fabricante=" + fabricante + ", potencia=" + potencia + ", codigo=" + codigo + "]";
	}
}

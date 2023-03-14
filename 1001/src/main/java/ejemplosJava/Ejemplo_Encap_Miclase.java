package ejemplosJava;

public class Ejemplo_Encap_Miclase {

	//private no puede ser llamado por otro package
	private int tipo = 55;

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}

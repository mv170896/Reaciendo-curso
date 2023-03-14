package ejemplosJava;

public class Ejemplo_Herencia_Triangulo extends Ejemplo_Herencia_DosDimensiones {
	// las palabras que se ponen de color narajo son palabras reservada, no pueden ser usadas como variable
	// extends permite que triangulo sea una subclase de DosDimensiones
	
	String estilo;
	
	double area() {
		return base * altura / 2;
	}
	void mostrarEstilo() {
		System.out.println("Triangulo es: " + estilo);
	}
}

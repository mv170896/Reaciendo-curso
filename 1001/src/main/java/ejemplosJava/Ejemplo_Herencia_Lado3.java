package ejemplosJava;

public class Ejemplo_Herencia_Lado3 {

	public static void main(String[] args) {
		Ejemplo_Herencia_Triangulo t1 = new Ejemplo_Herencia_Triangulo();
		Ejemplo_Herencia_Triangulo rectangulo = new Ejemplo_Herencia_Triangulo();
		
		t1.base=4.0;
		t1.altura=4.0;
		t1.estilo="Estilo 1";
		
		rectangulo.base=10;
		rectangulo.altura=10;
		rectangulo.estilo="Angulo rescto";
		
		System.out.println("Informacion para t1");
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println("su area es: " + t1.area());
		
		System.out.println("Informacion para t1");
		rectangulo.mostrarEstilo();
		rectangulo.mostrarDimension();
		System.out.println("su area es: " + rectangulo.area());
	}

}

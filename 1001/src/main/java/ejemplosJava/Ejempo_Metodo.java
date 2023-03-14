package ejemplosJava;

public class Ejempo_Metodo {

	public static void main(String[] args) {

		int resultado = suma(1, 1);

		System.out.println(resultado);

		int resultado2 = suma(507, 320, 50);

		System.out.println(resultado2);

		String marca = carro(resultado);
	
		
		System.out.println(marca);

		System.out.println(carro(0));

	}

	public static int suma(int a, int b) {

		int c = a + b;

		return c;
	}
	public static int suma(int a, int b, int c) {
		int d = a + b + c;

		return d;
	}

	public static String carro(int a) {
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		return cars[a];
	}
}

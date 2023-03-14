package ejemplosJava;

public class Ejemplo_Array {

	public static void main(String[] args) {
		int intArr[]; 
		int[] intArr2; //ambas formas son correctas
		
		byte byteArray[];
		long longArray[];
		double doubleArray[];
		
		//Declarar un array de strings 
		String[] arr;
		
		//asignando memoria para 5 enteros 
		arr = new String[5];
		
		//inicializar el primer elemento del array 
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		
		System.out.println(arr[4]);
		
		for(int i = 0; i < arr.length; i++ ) {  //.lenght nos regresa la longitud del arreglo 
			System.out.println("Elemento en la posicion " + i + ":" + arr[i]);
		}
	}

}

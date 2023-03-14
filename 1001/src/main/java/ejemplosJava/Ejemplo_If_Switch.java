package ejemplosJava;

public class Ejemplo_If_Switch {

	public static void main(String[] args) {
		int i = 9;
		
		//si tenemos mas de 3 if else if es mejor usar un switch case
		switch(i) {
		
		case 0:     //el valor al lado de case es el que evaluara la variable
			System.out.println("i es cero");
			break;
			
		case 1:
			System.out.println("i es uno");
			break;	
			
		case 2:
			System.out.println("i es dos");
			break;
			 
		default:
			System.out.println("i es mayor que 2");
			break;
		}
	}

}

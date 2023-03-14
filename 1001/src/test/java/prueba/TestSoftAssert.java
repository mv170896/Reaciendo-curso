package prueba;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSoftAssert {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void test1() {
		int a = 5;
		int b = 10;
		int x = 8;
		int y = 8;
		
		
		//al hacer un soft, si el primer soft falla esta continua con el siguiente.
		//tambien podemos poner un mensaje que aparecera solo en caso que falle el test para verlo en el testNG y en consola
		softAssert.assertEquals(a, b, "A y B no son iguales: ");
		softAssert.assertEquals(x, y);
		
		softAssert.assertAll();

	}
}

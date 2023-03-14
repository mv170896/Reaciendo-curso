package prueba;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHardAssert {
  @Test
  public void test1() {
	  
	  int a = 10;
	  int b = 1;
	  
	  //Evalua dos enteros, no es necesario ingresar el tipo de dato 
	  Assert.assertEquals(b, a);
  }
  
  @Test
  public void test2 () {
	  int a = 5;
	  int b = 10;
	  
	  //Evalua dos enteros, en este caso evalua que no sean iguales. si esto se cumple se da por aprobado el testcase
	  Assert.assertNotEquals(a, b);
  }
  
  @Test
  public void test3 () {
	  int a = 10;
	  int b = 10;
	  
	  //Evaluacion booleana, verifica que sea verdadero en este caso que dos enteros lo sean
	  Assert.assertTrue(a==b);
  }
  
}

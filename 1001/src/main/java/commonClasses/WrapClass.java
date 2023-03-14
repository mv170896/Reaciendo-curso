package commonClasses;

import org.openqa.selenium.WebElement;

public class WrapClass {

	//poner donde se hara el click, en este caso sera un WebElement de nombre webE, luego declaramos la accion en webE 
	public static void click(WebElement webE) {
		webE.click();
	}
	
	//Podemos repetir webE ya que es local para cada metodo, en este caso se declara el web element y el tipo de dato que necesitara el metodo 
	public static void sendKeys(WebElement webE, String textTosend) {
		webE.sendKeys(textTosend);
	}
}

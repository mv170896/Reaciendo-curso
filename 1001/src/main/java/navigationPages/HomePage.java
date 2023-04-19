package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class HomePage {
	//debe tener todos los web element y metodos 
	//lo primeor es hacer la declaracion del constructor que debe llevar el mismo nombre de la clase 
	//el constructor es un metodo que se inicializa al momento de instanciar un objeto de la clase 
	public HomePage (WebDriver driver) {
		//Instruccion de selenium es una forma de incializar los web element dentro de una parte diferente a la de la ejecucion del test
		PageFactory.initElements(driver, this);
	}
	

	//HomePage WebElements
	@FindBy(id = "search_product") //Findby es etiqueta de selenium usada por pagefactory para identificar webelements 
	private WebElement searchBar; //en esta sentencia declaramos un webelement de nombre searchbar, que es privado y como lo va a encontrar
	
	@FindBy(xpath = "//button[@id='submit_search']")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//a[@href='/login'][contains(.,'Signup / Login')]")
	private WebElement singUp;
	
	//la mejor practica para automatizacion es usar el constructor y la encapsulacion ya que todos los web element son privados y se accede a ellos mediante metodos publicos 
	//Metodo publico que necesita un string que sera enviado desde el caso de prueba 
	public void search(String textToSearch) {
		//escribe el texto que ingresemos y luego presiona en buscar
		WrapClass.sendKeys(searchBar, textToSearch);
		WrapClass.click(searchBtn);
	
	}
	public void login() {
		WrapClass.click(singUp);
	}
}

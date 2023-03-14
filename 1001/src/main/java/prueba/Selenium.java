package prueba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		//doble diagonal se usa para comentar 
		String exePath = "./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/products");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement searchBar = driver.findElement(By.id("search_product"));
		WebElement searchBtn = driver.findElement(By.xpath("//button[@id='submit_search']"));
		
		searchBar.sendKeys("Pink");
		searchBtn.click();
		
		//Metodos de explorador
		String title = driver.getTitle();
		System.out.println(title);
		
		String urlSearch = driver.getCurrentUrl();
		System.out.println("La url actual es: "+urlSearch);
		
		//metodos de navegacion
//		driver.navigate().back();
//		Thread.sleep(7000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
		
		// verificar elemento desplegado en pagina
		boolean prodContainer = driver.findElement(By.className("product-image-wrapper")).isDisplayed();
		if(prodContainer) {
			System.out.println("El articulo esta desplegado");
		}
		
		// obtener texto de webelement
		String prodName = driver.findElement(By.className("product-image-wrapper")).getText();
		
		// contains es un metodo nativo de JAVA que compara 2 strings y regresa un booleano
		boolean prodNameContains = prodName.contains("Half Sleeves Top Schiffli Detailing - Pink");

		if (prodNameContains) {
			System.out.println("El nombre del producto es correcto");
		} else {
			System.out.println("ERROR: el nombre del procuto es incorrecto");
		}
		
		//FindElements trae una lista de valores a diferencia de find Element 
		List<WebElement> sortBy = driver.findElements(By.className("product-image-wrapper"));
		System.out.println("Numero de elementos en productos "+sortBy.size());
		
		String tercerProd = sortBy.get(2).getText();
		System.out.println(tercerProd);
		
		for(int i=0; i < sortBy.size();i++) {
			System.out.println("Los productos son: " + sortBy.get(i).getText());
			System.out.println();
			if(!sortBy.get(i).getText().contains("Top")) {
				System.out.println("El producto no es top");
				break;
			}
		
		}
		
		//driver.close(); //cierra la ultima ventana que abrio, ya sea ventana o pestana, selenium no ahce diferencia
		driver.quit(); //cierra todas las ventanas y pentanas de la ejecucion 
		
	}
 
}

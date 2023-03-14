package prueba;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_ExplicitWait {

	public static void main(String[] args) {
		String exePath = "./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/products");
		driver.manage().window().maximize();
		
		//puede ser un implicit wait para toda la ejecucion y un explicit para un elemento en especifico 
		
		//Explicit wait es un tipo de espera inteligente, espera que el elemento sea cliqueable, o este disponible, entre otras validaciones
		WebElement searchBar = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("search_product")));
	}

}

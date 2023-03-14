package prueba;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/products");
		driver.manage().window().maximize();

		//tiempo de espera para que aparezcan los elementos de la pagina, como maximo el tiempo descrito 
		//implicitWait es una sentencia que afecta a todos los webElement declarados bajo esta, y puede ser sobresescrito 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement searchBar = driver.findElement(By.id("search_product"));
		
		
	}

}

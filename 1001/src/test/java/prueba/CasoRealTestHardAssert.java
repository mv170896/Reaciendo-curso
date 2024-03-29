package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CasoRealTestHardAssert {
	@Test
	public void verificarTituloDePagina() {

		String exePath = "./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/products");
		driver.manage().window().maximize();

		String actualTitle = driver.getTitle();
		String exceptedtitle = "Automation Exercise - All Products";
		
		Assert.assertEquals(actualTitle, exceptedtitle);
	}
}

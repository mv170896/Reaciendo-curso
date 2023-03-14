package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CasoRealSoftAssert {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void test1() {

		String exePath = "./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/products");
		driver.manage().window().maximize();

		String actualTitle = driver.getTitle();
		String exceptedTitle = "Automation Exercise - All Products";
		String badTitle = "aslkdjalkjdsklajsd";
		
		softAssert.assertEquals(actualTitle, exceptedTitle);
		softAssert.assertEquals(actualTitle, badTitle);
		
		//Nos ayuda a agrupar todos los soft assert utilizados en el testCase
		softAssert.assertAll();
		
	}
}

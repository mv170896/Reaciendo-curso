package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yapo {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.automationtesting.in/shop/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Dropdown
		Select srtDefalt = new Select(driver.findElement(By.className("orderby")));
		
		//visible text para seleccionar segun el texto
		srtDefalt.selectByVisibleText("Sort by average rating");
		
		//usado para seleccionar por Value
		//srtDefalt.selectByValue("date");
		
		//ByIndex se usa para seleccionar segun el lugar que utiliza en la lista
		//srtDefalt.selectByIndex(5);
		

	}

}

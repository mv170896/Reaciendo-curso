package prueba;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_ChangeTab {

	public static void main(String[] args) throws InterruptedException{
		String exePath = "./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		String as2d3 = driver.getCurrentUrl();
		System.out.println(as2d3);
		
		//obtiene el identificador de la ventana principal 
		String originalTab = driver.getWindowHandle(); 
		System.out.println(originalTab);
		
		//hacer click en el link que abre la pestana nueva
		WebElement clickHere = driver.findElement(By.xpath("//a[@href='../articles_popup.php'][contains(.,'Click Here')]"));
		clickHere.click();

		System.out.println("//////////");
		Thread.sleep(2000);
		
		String as2d32 = driver.getCurrentUrl();
		System.out.println(as2d32);
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		//Estructura 'for' simplificada por cada ventana o tab abierta vamos a recorrer una por una
		for(String tabNueva : allwindows) {   //obtiene el identificador de ventana de todas las pestanas abiertas
			if(!originalTab.equals("CDwindow-5B6FB77F08CDFA05341F30C56DBD0D84")) {   //es como el contains pero contains evalua que sea igual el string incluyendo mayus
				driver.switchTo().window(tabNueva);
			}
		}
		System.out.println("asdsd");
		//Enviar email
		String asd = driver.getCurrentUrl();
		System.out.println(asd);
		
		WebElement emailTxt = driver.findElement(By.xpath("//input[@name='emailid']"));
		emailTxt.sendKeys("arturoavilaa5@gmail.com");
		System.out.println("asdsd");
		driver.close();
	}

}

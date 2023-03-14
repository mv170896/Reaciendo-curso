package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tarea1 {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		//elemento pagina principal
		WebElement btnSignup = driver.findElement(By.xpath("//a[@href='/login'][contains(.,'Signup / Login')]"));
		btnSignup.click();
		
		//Elementos login
		WebElement inputEmail = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
		WebElement inputPass = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]"));
		
		//Entrar a inicio de sesion y escribir las credenciales. luego presionar login 
		inputEmail.sendKeys("m.verdugo15@gmail.com");
		inputPass.sendKeys("registrate");
		btnLogin.click();
		
		//Validar que inicio sesion 
		boolean inicioSesion = driver.findElement(By.xpath("//a[contains(.,'Logged in as Martin verdugo')]")).isDisplayed();
		if(inicioSesion) {
			System.out.println("Has iniciado sesion de manera correcta");
		}
		String sesionIniciada = driver.findElement(By.xpath("//a[contains(.,'Logged in as Martin verdugo')]")).getText();
		if(sesionIniciada.contains("Martin verdugo")) {
			System.out.println("la paulina es fea");
		}
		
		//Validar url
		String urlSearch = driver.getCurrentUrl();
		if(urlSearch.contains("exercise")) {
			System.out.println("la paulina es muuuu fea");
		}
		
		driver.quit(); //cierra todas las ventanas y pentanas de la ejecucion 

	}

}

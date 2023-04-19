package testCases_Search;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.WrapClass;
import navigationPages.HomePage;
import navigationPages.LoginPage;
import navigationPages.PaginaInicio;

public class TC_03_Login {

	
	//luego se utiliza esta instancia para utilizarlos dentro de los casos de prueba
	WebDriver driver = DriverSetup.setupDriver();
	HomePage homePage = new HomePage(driver);
	LoginPage LoginPage = new LoginPage(driver);
	PaginaInicio PaginaInicio = new PaginaInicio(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE); // get nos permite abrir la pagina que queremos utilizar
	}

	@Test
	public void TC_03() {
		homePage.login();
		LoginPage.login(GlobalVariables.USER, GlobalVariables.PASS);
		boolean visibleText = PaginaInicio.validarIngreso(GlobalVariables.NAME);
		if(visibleText) {
			System.out.println("wena washo culiao");
		}else {
			System.out.println("malardo mi king");
		}
		
	}
	@AfterTest
	public void closeDriver() {
		WrapClass.takeScreenshot(driver, "TC_03");
		driver.quit();
	}
}

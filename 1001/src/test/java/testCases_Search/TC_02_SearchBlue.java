package testCases_Search;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.WrapClass;
import navigationPages.HomePage;
import navigationPages.SearchResultsPage;

public class TC_02_SearchBlue {
	//Declarar e inicializar el webdriver
		WebDriver driver = DriverSetup.setupDriver();    
		
		//PageObjects de HomePage. dicho constructor necesita un objeto del tipo driver y asi inicializar el pagefactory y todo lo que esta dentro
		HomePage homePage = new HomePage(driver);
		SearchResultsPage searchPage = new SearchResultsPage(driver);
		
		//Esto lo hara siempre antes de empezar cualquier test
		@BeforeTest
		public void startWebDriver() {
			driver.get(GlobalVariables.HOME_PAGE); //get nos permite abrir la pagina que queremos utilizar
		}
		
		@Test
		public void TC_02() {
			homePage.search("Blue"); //Se declara el string que necesita el metodo search para funcionar
			boolean visibleText = searchPage.getPrdText("Blue");
			Assert.assertTrue(visibleText,"EL texto Blue no esta desplegado");
		}
		
		//Metodo que siempre se va a ejecutar al final de cada caso de prueba, se usa generalmente para cerrar el navegador 
		@AfterTest
		public void closeDriver() {
			WrapClass.takeScreenshot(driver, "TC_02");
			driver.quit();
		}
}

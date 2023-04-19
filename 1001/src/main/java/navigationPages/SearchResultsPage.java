package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class SearchResultsPage {
	
	//Cada pagina necesitara un constructor
	public SearchResultsPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Search Page WebElement
	@FindBy(xpath = "(//div[contains(@class,'product-image-wrapper')])[1]")
	private WebElement firstProd;
	
	
	//metodo nativo de seleneium para obtener texto
	public boolean getPrdText(String expectedText) {
		return WrapClass.getText(firstProd).contains(expectedText);
	}
}

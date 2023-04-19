package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class PaginaInicio {

	public PaginaInicio(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(.,'Logged in as Martin verdugo')]")
	private WebElement ingreso;
	
	public boolean validarIngreso(String usuario) {
		return WrapClass.getText(ingreso).contains(usuario);
	}
}

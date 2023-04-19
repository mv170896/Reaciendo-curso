package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class LoginPage {

	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@data-qa='login-email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[contains(@type,'password')]")
	private WebElement pass;
	
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Login')]")
	private WebElement loginBtn;
	
	public void login(String correo, String contrasena) {
		WrapClass.sendKeys(email, correo);
		WrapClass.sendKeys(pass, contrasena);
		WrapClass.click(loginBtn);
	}
	
}

package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actlogin {
	public Actlogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement userid;
	@FindBy(name="pwd")
	private WebElement pass;
	
	@FindBy(id="loginButton")
	private WebElement login;
	
	public void setdata(String username, String password) {
		userid.sendKeys(username);
		pass.sendKeys(password);
		login.click();
	}
}

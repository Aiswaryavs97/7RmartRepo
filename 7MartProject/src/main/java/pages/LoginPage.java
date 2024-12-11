package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement usernameField;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']")
	private WebElement dashboardvalue;
	@FindBy(xpath = "//i[@class='icon fas fa-ban']")
	private WebElement invalidpassword;
	@FindBy(xpath = "//i[@class='icon fas fa-ban']")
	private WebElement invaliduserid;

	public void enterUserNameOnUserField(String usernamevaluepassing) {
		usernameField.sendKeys(usernamevaluepassing);
	}

	public LoginPage  enterPasswordOnPasswordField(String pwdpassing) {
		pwd.sendKeys(pwdpassing);
		return this;
	}

	public LoginPage clickOnSignInButton() {
		signin.click();
		return this;
	}

	public boolean isHomePageDisplayed() {
		return dashboardvalue.isDisplayed();
		
	}

	public boolean isDisplayedInvalidPasswordAlert() {
		return invalidpassword.isDisplayed();
	}

	public boolean isDisplayedInvalidUserId() {

		return invaliduserid.isDisplayed();
	}
}

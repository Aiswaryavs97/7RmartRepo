package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterPage {

	WebDriver driver;

	public ManageFooterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement usernameField;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signin;
	@FindBy(xpath = "//p[text()='Manage Footer Text']")
	private WebElement managefooter;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=2']")
	private WebElement actionbutton;
	@FindBy(xpath = "//textarea[@class='form-control']")
	private WebElement textarea;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phone;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-info']")
	private WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alert;

	public void clickOnManageFooter() {
		managefooter.click();
	}

	public void clickOnActionButton() {
		actionbutton.click();
	}

	public void enterText(String text) {
		textarea.clear();
		textarea.sendKeys(text);
	}

	public void enterEmail(String emailid) {
		email.clear();
		email.sendKeys(emailid);
	}

	public void phoneNumber(String number) {
		phone.clear();
		phone.sendKeys(number);

	}

	public void updateButton() {
		savebutton.click();
	}

	public boolean isDisplayedAlert() {
		return alert.isDisplayed();

	}

}

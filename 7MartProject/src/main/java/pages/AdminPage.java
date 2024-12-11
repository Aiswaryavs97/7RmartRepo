package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {

	WebDriver driver;

	public AdminPage(WebDriver driver) {
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
	@FindBy(css = "a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	private WebElement moreinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/user/edit?edit=11017&page_ad=1']")
	private WebElement editbutton;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	@FindBy(xpath = "//select[@id='user_type']")
	private WebElement dropdown;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-info']")
	private WebElement update;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertdisplay;

	public void enterUserNameOnUserField(String usernamevaluepassing) {
		usernameField.sendKeys(usernamevaluepassing);
	}

	public void enterPasswordOnPasswordField(String pwdpassing) {
		pwd.sendKeys(pwdpassing);
	}

	public void clickOnSignInButton() {
		signin.click();
	}

	public void clickOnAdminUsers() {
		moreinfo.click();
	}

	public void clickOnEdit() {
		editbutton.click();
	}

	public void inputUsername(String username1) {
		username.clear();
		username.sendKeys(username1);
	}

	public void inputPassword(String password1) {
		password.clear();
		password.sendKeys(password1);
	}

	public void selectDropdown() // dropdown
	{
		Select object = new Select(dropdown);
		object.selectByIndex(2);

	}

	public void updateButton() {
		update.click();
	}

	public boolean isDisplayedSuccessAlert() {

		return alertdisplay.isDisplayed();
	}
}

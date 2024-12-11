package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constants;
import utilities.FileUpload;

public class SubCategoryPage {
	WebDriver driver;

	public SubCategoryPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement usernameField;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signin;
	@FindBy(css = "a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']")
	private WebElement subcategory;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newbutton;
	@FindBy(xpath = "//select[@class='form-control selectpicker']")
	private WebElement categorydropdown;
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement entersubcategory;
	@FindBy(xpath = "//input[@id='main_img']")
	private WebElement imageupload;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement saveimage;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement alert;

	public void enterUserNameOnUserField(String usernamevaluepassing) {
		usernameField.sendKeys(usernamevaluepassing);
	}

	public void enterPasswordOnPasswordField(String pwdpassing) {
		pwd.sendKeys(pwdpassing);
	}

	public void clickOnSignInButton() {
		signin.click();
	}

	public void clickOnSubCategory() {
		subcategory.click();
	}

	public void clickOnNewButton() {
		newbutton.click();
	}

	public void ClickOnCategoryDropDown() {
		Select selectdropdown = new Select(categorydropdown);
		selectdropdown.selectByIndex(2);

	}

	public void subCategory(String subcategoryvalue) {
		entersubcategory.click();
		entersubcategory.sendKeys(subcategoryvalue);// why passing the value again

	}

	public void clickOnImageUpload() throws AWTException {
		FileUpload uploadimage = new FileUpload();
		uploadimage.fileuploadusingSenkeys(imageupload, Constants.peace);// constants class.given image name in
																			// constants class

	}

	public void clickOnSave() {
		saveimage.click();
	}

	public boolean displayAlert() {
		return alert.isDisplayed();
	}
}

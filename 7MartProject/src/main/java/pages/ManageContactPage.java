package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage {
	
	WebDriver driver;
	 
	 public ManageContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	 
	 @FindBy(xpath="//input[@type='text']")private WebElement usernameField;
	 @FindBy(xpath="//input[@type='password']")private WebElement pwd;
	 @FindBy(xpath="//button[@type='submit']")private WebElement signin;
	 @FindBy(xpath="//p[text()='Manage Contact']")private WebElement contactatab;
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1']")private WebElement clickedit;
	 @FindBy(xpath="//input[@id='phone']")private WebElement phonenumber;
	 @FindBy(xpath="//input[@id='email']")private WebElement email;
	 @FindBy(xpath="//textarea[@placeholder='Enter the Address']")private WebElement addressnew;
	 @FindBy(xpath="//textarea[@placeholder='Enter Delivery Time']")private WebElement deliverytime;
	 @FindBy(xpath="//input[@id='del_limit']")private WebElement deliverylimit;
	 @FindBy(xpath="//button[@type='submit']")private WebElement update;
	 @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alert;

	 public void enterUserNameOnUserField(String usernamevaluepassing)

	 {
	 	usernameField.sendKeys(usernamevaluepassing);
	 }
	 public void enterPasswordOnPasswordField(String pwdpassing)

	 {
	 	pwd.sendKeys(pwdpassing);
	 }
	 public void clickOnSignInButton()

	 {
	 	signin.click();
	 }
	 
	 public void clickOnContact() { 
		 contactatab.click(); 
		 }
	 
	 public void clickEdit() {
		 
		 clickedit.click();
	 }
	 
	 public void clickOnPhone(String phonenumber1) { 
		 
		 phonenumber.clear();
		 phonenumber.sendKeys(phonenumber1); 
		 }
	 public void clickOnEmail(String emailid) 
	 {
		 email.clear();
		 email.sendKeys(emailid);
	 }
	 
	 public void clickOnAddress(String address) 
	 {
		 addressnew.clear();
		 addressnew.sendKeys(address);
	 }
	 public void clickOnDeliveryTime(String delitime ) 
	 {
		 deliverytime.sendKeys(delitime);
	 }
	 public void clickOnDeliveryLimit(String dellimit)
	 {
		 deliverylimit.clear();
		 deliverylimit.sendKeys(dellimit);
	 }
	 public void clickOnUpdate()
	 {
		// update.click();
		 
		 PageUtility object = new PageUtility();
		object.javaSriptClick(driver, update);
		 
	 }
	 public boolean isDisplayedAlert()
	 {
		return alert.isDisplayed();
	 }

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	 @FindBy(xpath="//input[@id='phone']")private WebElement phonenumber;
	 @FindBy(xpath="//input[@id='email']")private WebElement email;
	 @FindBy(xpath="//textarea[@placeholder='Enter the Address']")private WebElement addressnew;
	 @FindBy(xpath="//textarea[@placeholder='Enter Delivery Time']")private WebElement deliverytime;
	 @FindBy(xpath="//input[@id='del_limit']")private WebElement deliverylimit;
	 @FindBy(xpath="//button[@name='Update']")private WebElement update;
	 @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alert;

	 
	 public void clickOnContact() { 
		 contactatab.click(); 
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
		 update.click();
	 }
	 public boolean isDisplayedAlert()
	 {
		return alert.isDisplayed();
	 }

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	  
public HomePage(WebDriver driver) 
{
  this.driver=driver;
  PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@type='text']")private WebElement usernameField;
@FindBy(xpath="//input[@type='password']")private WebElement pwd;
@FindBy(xpath="//button[@type='submit']")private WebElement signin;
 

@FindBy(xpath="//a[@data-toggle='dropdown']")private WebElement homedropdown;
@FindBy(xpath="//a[@class='dropdown-item' and @href='https://groceryapp.uniqassosiates.com/admin/logout' ]")private WebElement logout;

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

public void clickOnhomeDown()
{
	homedropdown.click();
}

public void clickOnLogOut()
{
	logout.click();
}




}

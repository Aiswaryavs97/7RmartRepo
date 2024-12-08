package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class NewsPage {

WebDriver driver;
	
	public NewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")private WebElement usernameField;
	@FindBy(xpath="//input[@type='password']")private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")private WebElement signin;
	@FindBy(xpath="//p [text()='Manage News']") private WebElement managenews; 
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/delete?del=2059&page_ad=1']") private WebElement deletenews;
	@FindBy(xpath="//a[@class=\"btn btn-rounded btn-danger\"]")private WebElement newbutton; 
	@FindBy(xpath="//textarea[@id=\'news\']")private WebElement textfield;
	@FindBy(xpath="//button[@class='btn btn-danger']")private WebElement savenews;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alertmessage;
	
	
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
	public void clickOnManageNews() 
	{
		managenews.click();
	}
	
	
	public void clickOnNewButton()
	{
		//newbutton.click();
		PageUtility object = new PageUtility();
		object.javaSriptClick(driver, newbutton);
	}
	public void clickOnTextField(String enternews) 
	{
		textfield.click();
		textfield.sendKeys(enternews);
		
	}
	public void saveNews() 
	{
		savenews.click();
	}
	
	public boolean alertMessageIsDisplayed() 
	{
		return  alertmessage.isDisplayed();
		
	}
	
	public void deleteNews() 
	{
		deletenews.click();
		driver.switchTo().alert().accept();
	}
}

package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base {
	 
	
	@Test 
	public void loginTest() 
	{
		String usernamevalue = "admin";
		String passwordvalue = "admin";
		
		WebElement username1= driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password1= driver.findElement(By.xpath("//input[@name='password'"));
		WebElement signin = driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
		username1.sendKeys(usernamevalue);
		password1.sendKeys(passwordvalue);
		signin.click();
        WebElement dashboard =driver.findElement(By.xpath("//p[text()='Dashboard']"));
        boolean ishomepageavailable=dashboard.isDisplayed();
        Assert.assertTrue(ishomepageavailable,"Home page is not Displayed");
	}
	
}

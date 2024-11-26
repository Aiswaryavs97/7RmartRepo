package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
 
	
	@Test(retryAnalyzer=retry.Retry.class)
	public void VerifyTheUserIsAbleToLogInUsingValidCredentials()
	{
		String usernamevalue="admin";
		String passwordvalue="admin";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		boolean homepagedisplayed=loginpage.isHomePageDisplayed();
		Assert.assertTrue(homepagedisplayed,"Home page not loaded when user entered valid credentials");
		
	}
	
	@Test
	public void VerifyUserIsAbleToLoginUsingInvalidPassword()
	{
		String usernamevalue ="admin";
		String passwordvalue="admin123";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		boolean invalidpassword=loginpage.isDisplayedInvalidPasswordAlert();
		Assert.assertTrue(invalidpassword, "Invalid Username/Password");
		loginpage.isDisplayedInvalidPasswordAlert();
	}
	
	@Test
	public void VerifyUserIsAbleToLoginUsingInvalidUsername()
	{// wrong

		String usernamevalue ="admin";
		String passwordvalue="admin123";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		boolean invalidpassworddisplayed=loginpage.isDisplayedInvalidPasswordAlert();
		Assert.assertTrue(invalidpassworddisplayed, "Invalid Username/Password");
		loginpage.isDisplayedInvalidPasswordAlert();
		}
	 
	@Test
	public void VerifyUserIsAbleToLoginUsingInvalidCreds()
	{
		// wrong
		String usernamevalue ="admin123";
		String passwordvalue="admin";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		boolean invaliduseriddisplayed=loginpage.isDisplayedInvalidUserId();
		Assert.assertTrue(invaliduseriddisplayed, "Invalid Username/Password");
		loginpage.isDisplayedInvalidUserId();
	}
}
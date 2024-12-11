package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest extends Base {//passed
 
	
	@Test(retryAnalyzer=retry.Retry.class,groups= {"regression"},description = "Verify the user is able to log in using valid credentials" )
	public void VerifyTheUserIsAbleToLogInUsingValidCredentials() throws IOException
	{
	// String usernamevalue = ExcelUtilities.getStringData(1, 0, "LoginPage");
	 //String passwordvalue = ExcelUtilities.getStringData(1, 1, "LoginPage");
		
	String usernamevalue = ExcelUtilities.getStringData(1, 0, "LoginPage");
	String passwordvalue = ExcelUtilities.getStringData(1, 1, "LoginPage");
	 
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		boolean homepagedisplayed=loginpage.isHomePageDisplayed();
		Assert.assertTrue(homepagedisplayed,"Home page not loaded when user entered valid credentials");
		
	}
	
	@Test(retryAnalyzer=retry.Retry.class,groups= {"regression"},description = "Verify the user is able to log in using invalid credentials" )
	public void VerifyUserIsAbleToLoginUsingInvalidPassword() throws IOException
	{
		 String usernamevalue ="admin";
		 String passwordvalue="admin123";
		
		// String usernamevalue = ExcelUtilities.getStringData(1, 0, "LoginPage");
		 //String passwordvalue = ExcelUtilities.getStringData(1, 1, "LoginPage");
		
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
	 
	@Test(dataProvider= "LoginProvider")
	public void VerifyUserIsAbleToLoginUsingInvalidCreds(String username, String password)
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
	
	@DataProvider(name = "LoginProvider")
	public Object[][] getDataFromTestData() throws IOException 
	{
		return new Object[][] { { ExcelUtilities.getStringData(1, 6, "LoginPage"), ExcelUtilities.getStringData(1, 7, "LoginPage") }};
}
}

package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NewsPage;

public class NewTest extends Base {
	
	@Test
	public void VerifyTheUserIsAbleToLogInUsingValidCredentials()
	{
		String usernamevalue="admin";
		String passwordvalue="admin";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		NewsPage newspage = new NewsPage(driver);
	    String enternews = "News Entered and Saved";
	    newspage.clickOnManageNews();
	    newspage.deleteNews();
	    
	    newspage.clickOnNewButton();
	    newspage.clickOnTextField(enternews);
	    newspage.saveNews();
	    
	    boolean alert = newspage.alertMessageIsDisplayed();
	    Assert.assertTrue(alert, "News Created Successfully");
	    newspage.alertMessageIsDisplayed();
	     
 
	
}}

package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class HomeTest extends Base{//Pass
	
	
	@Test
	public void VerifyTheUserIsAbleToLogOut() throws IOException
	{
 String usernamevalue = ExcelUtilities.getStringData(1, 0, "LoginPage");
 String passwordvalue = ExcelUtilities.getStringData(1, 1, "LoginPage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		HomePage logout = new HomePage(driver);
		logout.clickOnhomeDown();
		logout.clickOnLogOut();
		
	}

}

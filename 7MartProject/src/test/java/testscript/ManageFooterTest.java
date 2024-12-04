package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterPage;

public class ManageFooterTest {
	
	@Test
	public void updateFooterText()
	
	{
		String usernamevalue="admin";
		String passwordvalue="admin";
		
		LoginPage loginpage= = new LoginPage(driver)
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
	 
		String address="New address";
		String emailaddress="ais@mail.com";
		String number="4565987898";
		
		ManageFooterPage managefooter = new ManageFooterPage(driver);
		managefooter.clickOnManageFooter();
		managefooter.clickOnActionButton();
		managefooter.enterText(address);
		managefooter.enterEmail(emailaddress);
		managefooter.phoneNumber(number);
		managefooter.updateButton();
		
		boolean alertdis= managefooter.isDisplayedAlert();	
		Assert.assertTrue(alertdis, "Footer Text Updated Successfully");
		managefooter.isDisplayedAlert();		
			
	}

}

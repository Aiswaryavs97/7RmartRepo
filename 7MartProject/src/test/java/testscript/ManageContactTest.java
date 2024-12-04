package testscript;

import org.testng.Assert;

import pages.LoginPage;
import pages.ManageContactPage;

public class ManageContactTest extends Base{
	
	public void verifyUserIsAbleToUpdateContactTest() 
	{
		

		String usernamevalue="admin";
		String passwordvalue="admin";
		
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		
		
		ManageContactPage managecontactpage= new ManageContactPage(driver);
		String enterphone="45657898415";
		String enteremail="ais@mail.com";
		String enteraddress="ais home";
		String enterdeltime="50";
		String enterdellimit="60";
		managecontactpage.clickOnContact();
		managecontactpage.clickOnPhone(enterphone);
		managecontactpage.clickOnAddress(enteremail);
		managecontactpage.clickOnEmail(enteremail);
		managecontactpage.clickOnDeliveryTime(enterdeltime);
		managecontactpage.clickOnDeliveryLimit(enterdellimit);
		managecontactpage.clickOnUpdate();
		boolean alertdisplay = managecontactpage.isDisplayedAlert();
		Assert.assertTrue(alertdisplay, "Contact Updated Successfully");
		managecontactpage.isDisplayedAlert();
		
		
	}

}

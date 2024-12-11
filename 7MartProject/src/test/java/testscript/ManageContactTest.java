package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtilities;

public class ManageContactTest extends Base {// passed

	@Test
	public void verifyUserIsAbleToUpdateContactTest() throws IOException {

		String usernamevalue = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue = ExcelUtilities.getStringData(1, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();

		ManageContactPage managecontactpage = new ManageContactPage(driver);
		String enterphone = "45657898415";
		String enteremail = "ais@mail.com";
		String enteraddress = "ais home";
		String enterdeltime = "50";
		String enterdellimit = "60";
		managecontactpage.clickOnContact();
		managecontactpage.clickEdit();
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

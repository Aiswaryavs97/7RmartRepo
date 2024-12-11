package testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminPage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class AdminTest extends Base {

	@Test
	public void verifyTheUserIsAbleToUpdate() throws IOException// passed
	{

		String usernamevalue = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue = ExcelUtilities.getStringData(1, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);

		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();

		AdminPage pageadmin = new AdminPage(driver);
		String adminuservalue = "aiswarya";
		String adminpassword = "admin123";

		pageadmin.clickOnAdminUsers();
		pageadmin.clickOnEdit();
		pageadmin.inputUsername(adminuservalue);
		pageadmin.inputPassword(adminpassword);
		pageadmin.selectDropdown();
		pageadmin.updateButton();

		boolean alertsuccess = pageadmin.isDisplayedSuccessAlert();
		Assert.assertTrue(alertsuccess, "User Updated Successfully");
		pageadmin.isDisplayedSuccessAlert();

	}

}

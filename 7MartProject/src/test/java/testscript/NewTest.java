package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NewsPage;
import utilities.ExcelUtilities;

public class NewTest extends Base {

	@Test
	public void VerifyTheUserIsAbleToAddNews() throws IOException {
		String usernamevalue = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue = ExcelUtilities.getStringData(1, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();

		NewsPage newspage = new NewsPage(driver);
		String enternews = "News Entered and Saved";
		newspage.clickOnManageNews();
		newspage.clickOnNewButton();
		newspage.clickOnTextField(enternews);
		newspage.saveNews();

		boolean alert = newspage.alertMessageIsDisplayed();
		Assert.assertTrue(alert, "News Created Successfully");
		newspage.alertMessageIsDisplayed();

		// delete

	}
}

package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SubCategoryPage;

public class SubCategoryTest extends Base  {
	
	 
	
	@Test
	public void verifyUserIsAbleToAddTheCategory()
	
	{
		String usernamevalue="admin";
		String passwordvalue="admin";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		
		String subc= "Test";
		SubCategoryPage subcategorypage = new SubCategoryPage(driver);
		subcategorypage.clickOnSubCategory();
		subcategorypage.clickOnNewButton();
		subcategorypage.ClickOnCategoryDropDown();
		subcategorypage.subCategory(subc);
		subcategorypage.clickOnSave();
		
	}
	
	@Test
	public void verifyUserIsGettingAlreadyExistValidation()
	
	
	{
		String usernamevalue="admin";
		String passwordvalue="admin";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		
		String subc= "Test";
		SubCategoryPage subcategorypage = new SubCategoryPage(driver);
		subcategorypage.clickOnSubCategory();
		subcategorypage.clickOnNewButton();
		subcategorypage.ClickOnCategoryDropDown();
		subcategorypage.subCategory(subc);
		subcategorypage.clickOnSave();
		
		subcategorypage.clickOnNewButton();
		subcategorypage.ClickOnCategoryDropDown();
		subcategorypage.subCategory(subc);
		subcategorypage.clickOnSave();
		boolean alertdisplay = subcategorypage.displayAlert();
		Assert.assertTrue(alertdisplay, "Sub Category already exists");
		
 
	}

}

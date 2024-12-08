package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtilities;

public class SubCategoryTest extends Base  {
	
	 
	
	@Test
	public void verifyUserIsAbleToAddTheCategory() throws IOException
	
	{
		 String usernamevalue = ExcelUtilities.getStringData(1, 0, "LoginPage");
		 String passwordvalue = ExcelUtilities.getStringData(1, 1, "LoginPage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		
		String subc= "Test";
		
		// String subc= ExcelUtilities.getStringData(1, 0, "SubCategory");--- read from excel 
		SubCategoryPage subcategorypage = new SubCategoryPage(driver);
		subcategorypage.clickOnSubCategory();
		subcategorypage.clickOnNewButton();
		subcategorypage.ClickOnCategoryDropDown();
		subcategorypage.subCategory(subc);
		subcategorypage.clickOnSave();
		
	}
	
	@Test
	public void verifyUserIsGettingAlreadyExistValidation() throws IOException
	
	
	{
	 String usernamevalue="admin";
	String passwordvalue="admin";
		
		//String usernamevalue = ExcelUtilities.getStringData(1, 0, "LoginPage");
		//String passwordvalue = ExcelUtilities.getStringData(1, 1, "LoginPage");
		
		
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

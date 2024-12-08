package testscript;


import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageProductsPage;
import utilities.ExcelUtilities;

public class ManageProductTest  extends Base  
{
	@Test
	public void verifyUserIsAbleToAddProduct() throws IOException
	{
		
	
		
		 String usernamevalue =  ExcelUtilities.getStringData(1, 0, "LoginPage");
		 String passwordvalue = ExcelUtilities.getStringData(1, 1, "LoginPage");
		 
		 LoginPage loginpage=new LoginPage(driver);
			loginpage.enterUserNameOnUserField(usernamevalue);
			loginpage.enterPasswordOnPasswordField(passwordvalue);
			loginpage.clickOnSignInButton();
			
		 String inputtitle =  ExcelUtilities.getStringData(2, 1, "ManageProduct");
		 String weightvalue1 =  ExcelUtilities.getStringData(2, 1, "ManageProduct");
		 String maxorder =  ExcelUtilities.getStringData(3, 1, "ManageProduct");
		 
		 String selectprice1 =  ExcelUtilities.getStringData(4, 1, "ManageProduct");
		 String stock =  ExcelUtilities.getStringData(5, 1, "ManageProduct");
		 String description = "test project selenium Testng";
		  
		 
	
			
			
			ManageProductsPage manage= new ManageProductsPage(driver);
			manage.clickOnAddProduct();
			manage.clickOnNewButton();
			manage.inputTiltle(inputtitle);
			manage.clickOnRadioButton1();
			manage.selectGroupDrowpDown();
			manage.clickPriceType();
			manage.addWeightValue(weightvalue1);
			manage.chooseWeightUnit();
			
			manage.maximumOrder(maxorder);
			manage.selectPrice(selectprice1);
			manage.stock(stock);
			manage.checkbox();
			manage.addDescription(description);
			manage.uploadImage1();
			manage.uploadImage2();
			manage.clickOnFeaturedRadioButton();
			manage.clickOnComboRadioButton();
			manage.clickOnSaveButton();
		 
	}
	
	

}

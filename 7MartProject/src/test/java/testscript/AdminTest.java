package testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminPage;
import pages.LoginPage;

public class AdminTest extends Base {
	
	 @Test
		public void verifyTheUserIsAbleToLogInUsingValidCredentials()
		{
		 
 
			     
			
			     String usernamevalue="admin";
			     String passwordvalue="admin";
			                                                           		
			    LoginPage loginpage=new LoginPage(driver);
				
			    loginpage.enterUserNameOnUserField(usernamevalue);
			    loginpage.enterPasswordOnPasswordField(passwordvalue);
			    loginpage.clickOnSignInButton();
  
			    
			AdminPage pageadmin= new AdminPage(driver);   
			String adminuservalue="aiswarya";
			String adminpassword="admin123";
			
		 
			pageadmin.clickOnAdminUsers();
			pageadmin.clickOnEdit(); 	
			pageadmin.inputUsername(adminuservalue);
			pageadmin.inputPassword(adminpassword);
			pageadmin.selectDropdown();
			pageadmin.updateButton();
			
			boolean alertsuccess=pageadmin.isDisplayedSuccessAlert();
			Assert.assertTrue( alertsuccess,"User Updated Successfully");
			pageadmin.isDisplayedSuccessAlert() ;	
			
			
			
			
		}
		
		
}

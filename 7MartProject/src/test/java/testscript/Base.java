package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

 

public class Base {
	public WebDriver driver; // why this step 
	
	@BeforeMethod
	@Parameters("browser")
		public void initalizeBrowser(String browser) throws Exception 
		{
			//driver = new ChromeDriver();// to loading the driver -- browser initialization into the driver name 
		if(browser.equalsIgnoreCase(browser)) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase(browser)) {
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase(browser)) {
			driver=new FirefoxDriver();
		}
		else {
			throw new Exception("browser is incorrect");
		}
		
		
			driver.get("https://groceryapp.uniqassosiates.com/admin/login");// get is a method using to launch the URL 
		    driver.manage().window().maximize();// to maximize the screen 
		   
		}
		
	@AfterMethod
		public void driverQuitAndClose() 
		{
			// driver.close();// to close the screen (closing only the parent window)
			//driver.quit();// closing all the windows 
		}


}

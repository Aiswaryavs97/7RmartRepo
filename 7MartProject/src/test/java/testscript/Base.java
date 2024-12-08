package testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constants;
import utilities.ScreenshotUtility;
import utilities.WaitUtilities;

 

public class Base {
	
public  ScreenshotUtility scrshot;
public WebDriver driver; // why this step
public Properties properties;
public FileInputStream fileinputstream;
	
	@BeforeMethod (alwaysRun=true)
 @Parameters("browser")
 public void initalizeBrowser(String browser) throws Exception 
	//public void initalizeBrowser()
		 {
		try {
			properties = new Properties();
			fileinputstream = new FileInputStream(Constants.CONFIG_FILE);
			 properties.load(fileinputstream);
			
		 }
		catch(Exception e){
			System.out.println("Error");
		}
		
		//driver = new ChromeDriver();// to loading the driver -- browser initialization into the driver name 
 if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
	}
		else if(browser.equalsIgnoreCase("Firefox")) {
	driver=new FirefoxDriver();
		}
	else 
{
throw new Exception("browser is incorrect");
} 
		
		
//driver.get("https://groceryapp.uniqassosiates.com/admin/login");// get is a method using to launch the URL 
		   
driver.get(properties.getProperty("url"));
//implicit wait after url loads
//if given 10 sec, element loads in 2 sec, but it will wait till 10, so dont use for bigger time period
//common wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtilities.implicitwait));
driver.manage().window().maximize();// to maximize the screen 
}
		
@AfterMethod(alwaysRun=true)
/*public void driverQuitAndClose() 
{
// driver.close();// to close the screen (closing only the parent window)
//driver.quit();// closing all the windows 
}*/
	
public void browserQuit(ITestResult iTestResult) throws IOException 

{
if (iTestResult.getStatus() == ITestResult.FAILURE) {
scrshot = new ScreenshotUtility();
scrshot.getScreenShot(driver, iTestResult.getName());
}

		//driver.quit();
	}



}

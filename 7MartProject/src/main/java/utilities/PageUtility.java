package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	
	public void selectByValue(WebElement element,String value) {
		Select select =new Select(element);
		select.selectByValue(value);
		
	}

	public void selectByIndex(WebElement element,int index) {
		Select select =new Select(element);
		select.selectByIndex(index); 
		
	}
		
		public void selectByVisibleText(WebElement element,String visibleText) {
			Select select =new Select(element);
			select.selectByVisibleText(visibleText);
			
		}
		
		public void javaSriptClick(WebDriver  driver,WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();",element);
		}
}

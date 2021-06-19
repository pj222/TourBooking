package pageObjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
		public WebDriver driver;

		By tourLink=By.xpath("//a[contains(@href,'Old-and-New-Delhi-City-Tour')]");
		
		
		public HomePage(WebDriver driver) {
			this.driver=driver;
	}
	
	public WebElement gotoTour()
	
	{
		
		return driver.findElement(tourLink);
	}
	
}

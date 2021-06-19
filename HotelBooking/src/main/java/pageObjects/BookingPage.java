package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookingPage {

	public WebDriver driver;
	
	By adult=By.xpath("//select[@id='selectedAdults']");
	By child=By.xpath("//select[@id='selectedChild']");
	By infant=By.xpath("//select[@id='selectedInfants']");
	By Bookbtn=By.xpath("//button[@type='submit' and @class='btn btn-secondary btn-block mt-20 btn-action btn-lg loader']");
	By adultprice=By.xpath("//div[@class='d-flex align-items-center adult-Price']");
	By childprice=By.xpath("//div[@class='d-flex align-items-center tour-child']");
	By infantprice=By.xpath("//div[@class='d-flex align-items-center tour-infant']");
	
	public BookingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void adultbtn(String val)
	{
		Select ad=new Select(driver.findElement(adult));
		ad.selectByValue(val);
		
	}
	public void childbtn(String val)
	{
		Select ch=new Select(driver.findElement(child));
		ch.selectByValue(val);
		
	}
	public void infantbtn(String val)
	{
		Select ch=new Select(driver.findElement(infant));
		ch.selectByValue(val);
		
	}
	
	public WebElement getadultval()
	
	{
		
		 return driver.findElement(adultprice);
	}
	
public WebElement getchildval()
	
	{
		
		 return driver.findElement(childprice);
	}

public WebElement getinfantval()

{
	
	 return driver.findElement(infantprice);
}
	
	public void Bookbtn()
	{
		WebElement ele=driver.findElement(Bookbtn);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
		
		
	}
}

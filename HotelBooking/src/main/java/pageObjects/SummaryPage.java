package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import resources.base;

public class SummaryPage extends base{
public WebDriver driver;
public SoftAssert sa;
public SummaryPage(WebDriver driver,SoftAssert sa)
{
	this.driver=driver;
	this.sa=sa;
}


By Booking_status=By.xpath("//div[@class='success-box reserved']//div[@class='content']/h4");

public String get_success_text()
{
	return driver.findElement(Booking_status).getText();
	
}
public void verfy_success_text()

{
	sa.assertEquals(get_success_text(), "Your booking status is Reserved");
}
}

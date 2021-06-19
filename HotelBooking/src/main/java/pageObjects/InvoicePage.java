package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import resources.base;

public class InvoicePage extends base{
base b=new base();

	public WebDriver driver;
	public SoftAssert sa;
	PersonalDetailsPage p=new PersonalDetailsPage(driver, sa);
	
	//By Total_Amnt=By.xpath("//ul[@class='confirmation-list']/li[@class='clearfix total']/span[2]");
	//By Chkin_Date=By.xpath("li[cotains(text(), 'Check in')]/following-sibling::span");
	By PayOnArrival=By.xpath("//button[@class='btn btn-default arrivalpay']");
	
	
	public InvoicePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void get_pay_On_arrivalbtn()
	{
		driver.findElement(PayOnArrival).click();
		
	}
		
	
	}


package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;
import resources.base;

public class PersonalDetailsPage extends base{


	public WebDriver driver;
	base b=new base();
	public SoftAssert sa;
	
	By FName=By.xpath("//div[@class='form-group']//input");
	By LName=By.xpath("//div[@class='col-md-6 col-12 o1']//input");
	By Email=By.xpath("//div[@class='col-md-6 col-12 o2']//input");
	By ConfirmEmail=By.xpath("//div[@class='col-md-6 col-12 o1']//input[@type='email']");
	By Phone=By.xpath("//div[@class='col-md-12 col-12']//input[@name='phone']");
	By address=By.xpath("//div[@class='col-md-12 col-12']//input[@name='address']");
	By country_drp=By.xpath("//*[@id='guestform']/div[5]/div/div[2]/a");
	By country=By.xpath("//input[@class='chosen-search-input']");
	By Confirmbtn=By.xpath("//button[@name='logged']");
	//pricc_edetails
	By adultvalue=By.xpath("//h6[contains(text(),'Adults')]/following-sibling::strong");
	By childvalue=By.xpath("//h6[contains(text(),'Child')]/following-sibling::strong");
	By infantvalue=By.xpath("//h6[contains(text(),'infant')]/following-sibling::strong");
//	By subtotal=By.xpath("//div[@class='mb-20'][5]");
	By subtotal=By.xpath("//h6[contains(text(),'Subtotal')]/following-sibling::strong");
	//By Tax=By.xpath("//ul[@class='summary-price-list']/li[1]");
	By Tax=By.xpath("//span[@id='displaytax']");
	By deposit=By.xpath("//span[@id='displaydeposit']");
	By total=By.xpath("//span[@id='displaytotal']");
	
	public PersonalDetailsPage(WebDriver driver, SoftAssert sa) {
		this.driver=driver;
		this.sa=sa;
	}
	
	public void getFname(String fname)
	{
		driver.findElement(FName).sendKeys(fname);
		
	}
	public void getLname(String lastname)
	{
		driver.findElement(LName).sendKeys(lastname);
		
	}
	public void getEmail(String email)
	{
		driver.findElement(Email).sendKeys(email);
		
	}
	public void getConfirmEmail(String cemail)
	{
		driver.findElement(ConfirmEmail).sendKeys(cemail);;
		
	}
	public void getPhone(String phone)
	{
		driver.findElement(Phone).sendKeys(phone);;
		
	}
	public void getAdd(String add)
	{
		driver.findElement(address).sendKeys(add);;
		
	}
	
		public void getcountry(String cntry) throws InterruptedException
		{
			b.javascriptscroller(driver);
			b.sleep(2000);
			driver.findElement(country_drp).click();
			
			driver.findElement(country).click();
			driver.findElement(country).sendKeys(cntry);
			Thread.sleep(2000);
			b.sleep(2000);
			driver.findElement(country).sendKeys(Keys.DOWN);
			driver.findElement(country).sendKeys(Keys.ENTER);
						
	    }
	public WebElement getconfrimbtn()
	{
		return driver.findElement(Confirmbtn);
		
	}
	public String getadultvalue()
	{
		return driver.findElement(adultvalue).getText();
	}
	public String getchildvalue()
	{
		return driver.findElement(childvalue).getText();
		
	}
	public String getinfantvalue()
	{
		return driver.findElement(infantvalue).getText();
		
	}
	public String getsubtotal()
	{
		return driver.findElement(subtotal).getText();
			
	}
	public String gettax()
	
	{
		String a=driver.findElement(Tax).getText();
		return a;
		
	}
public String getdeposit()
	
	{
		return driver.findElement(deposit).getText();
	}

public String gettotal()

{
	String a=driver.findElement(total).getText();
	//String val=a.substring(1);
	//double total=Double.parseDouble(val);
			//Integer.parseInt(val);
	return a;
	//return driver.findElement(total).getText();
}
/*public double substr(String text)
{
	String val=text.substring(1);
	return Double.parseDouble(val);
}*/

public int calsubtotal()
{
	int adultprice=parsestrToInt(splitstr(getadultvalue()));
	int childprice=parsestrToInt(splitstr(getchildvalue()));
	int infantprice=parsestrToInt(splitstr(getinfantvalue()));
	return(adultprice+childprice+infantprice);

}
public int act_subtotal()
{
     
    		 int actual=parsestrToInt(splitstr(getsubtotal()));
     return actual ;
    		 //sa.assertEquals(actual,calsubtotal());
		
}


}

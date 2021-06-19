package HotelBooking;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;

import junit.framework.Assert;
import pageObjects.BookingPage;
import pageObjects.HomePage;
import pageObjects.InvoicePage;
import pageObjects.LoginPage;
import pageObjects.PersonalDetailsPage;
import pageObjects.SummaryPage;
import resources.base;
import resources.ExtentReporter;

public class booking extends base{
public WebDriver driver;
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 @BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			
		}
		
	 @Test
	public void homepage() throws IOException, InterruptedException
	{
		//driver =initializeDriver();
		
		ExtentReports extent;
		SoftAssert sa= new SoftAssert();
		PersonalDetailsPage p=new PersonalDetailsPage(driver, sa);
		LoginPage L=new LoginPage(driver, prop);
		HomePage H=new HomePage(driver);
		base b1=new base();
		BookingPage b=new BookingPage(driver);
		SummaryPage s=new SummaryPage(driver, sa);
		b1.geturl(driver, prop);
		L.login();
		b1.sleep(5000);
		L.Goto_homepage();
		b1.javascriptexecutor(driver, H.gotoTour());
	    b.adultbtn("2");
	    b.childbtn("1");
	    b.infantbtn("1");
	    b.Bookbtn();
	    b1.sleep(10);
       sa.assertEquals(p.act_subtotal(),p.calsubtotal());
		log.info("verified subtotal");
			b1.javascriptexecutor(driver, p.getconfrimbtn());
		InvoicePage i=new InvoicePage(driver);
    	b1.sleep(10);
	    i.get_pay_On_arrivalbtn();
	    b1.accept_Alert(driver);
		log.info("reservation success text is"+s.get_success_text());
	    s.verfy_success_text();
	   log.info("verified success message");
	   driver.close();
	   sa.assertAll();
	  
	}
	
}




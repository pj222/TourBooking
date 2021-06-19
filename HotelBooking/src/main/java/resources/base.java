package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;


public class base {
	public  static WebDriver driver;
	public Properties prop;
	//public SoftAssert sa= new SoftAssert();
public WebDriver initializeDriver() throws IOException
{
	
 prop= new Properties();
FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src/main/java//resources/data.properties");

prop.load(fis);
String browserName=prop.getProperty("browser");


String username=prop.getProperty("username");
String pwd=prop.getProperty("pwd");
//driver.get(url);
System.out.println(browserName);

if(browserName.equals("chrome"))
{
	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	driver= new ChromeDriver();
		//execute in chrome driver
	
}
else if (browserName.equals("firefox"))
{
	System.setProperty("webdriver.gecko.driver", "C:/Users/Sagar/geckodriver.exe"); 
	driver= new FirefoxDriver();
	//firefox code
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;}

public void javascriptexecutor(WebDriver driver,WebElement ele)
{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", ele);
}

public Object javascriptscroller(WebDriver driver)
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	return js.executeScript("window.scrollBy(0, 400)");
}
//method for set sleep
 public void sleep(int milliseconds) throws InterruptedException{
	 Thread.sleep(milliseconds);
 }
 
 // Method for set  Explicit wait
 
 public void exsplicitWait(int milliseconds,WebElement webelement){
	 org.openqa.selenium.support.ui.WebDriverWait wait=new org.openqa.selenium.support.ui.WebDriverWait(driver, milliseconds);
	 wait.until(ExpectedConditions.elementToBeSelected(webelement));
 }
 public String substr(String text)
 {
	 //String[] val=text.split(" ");
 	String val=text.substring(1);
 	return val;
 	//return Integer.parseUnsignedInt(val);
 }
 public double parsestrToDouble(String text)
 {
	 //String[] val=text.split(" ");
 	//String val=text.substring(1);
 	return Double.parseDouble(text);
 			
 }
 public String splitstr(String text)
 {
	 String[] val=text.split(" ");
 	//String val=text.substring(1);
 	return val[1];
 }
 public int parsestrToInt(String text)
 {
	 //String[] val=text.split(" ");
 	//String val=text.substring(1);
 	return Integer.parseInt(text);
 			
 }
 public void accept_Alert(WebDriver driver)
 {
	 driver.switchTo().alert().accept();
 }
 public void cancle_Alert(WebDriver driver)
 {
	 driver.switchTo().alert().dismiss();
 }
 
 public void geturl(WebDriver driver,Properties prop)
 {
	 String url=prop.getProperty("url");
	 driver.get(url);
 }
	
 }
 
 
 


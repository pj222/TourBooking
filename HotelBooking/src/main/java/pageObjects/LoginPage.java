package pageObjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	public Properties prop;
	By email=By.name("username");
	By pwd=By.name("password");
	By Loginbtn=By.cssSelector(".btn.btn-primary.btn-lg.btn-block.loginbtn");
	By HomeLink=By.xpath("//div[@id='mobileMenuMain']//ul/li/a[@title='home']");
	
	public LoginPage(WebDriver driver,Properties prop) {
		this.driver=driver;
		this.prop=prop;
	}
 public WebElement getemail()
	
	{
		
		 return driver.findElement(email);
	}
 public WebElement getpwd()

{
	
	 return driver.findElement(pwd);
}

 public WebElement getLoginbtn()

{
	
	 return driver.findElement(Loginbtn);
}
public void login()
{
	getemail().sendKeys(prop.getProperty("username"));
	getpwd().sendKeys(prop.getProperty("pwd"));
	getLoginbtn().click();
}
public void Goto_homepage()
{
	driver.findElement(HomeLink).click();
}
}




package google;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verify_title {
	WebDriver driver;
	@BeforeMethod
	void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\koushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       driver=new ChromeDriver();	
	}
	@Test
	void google_title()
	{
		
	      driver.get("https://www.google.com");
	     Assert.assertEquals("Google", driver.getTitle());
	      
	}
	@Test
	void gmail_title()
	{
		
	      driver.get("https://www.gmail.com");
	     Assert.assertEquals("gmail", driver.getTitle());
	      
	}
	@Test
	void facebook_title()
	{
		
	      driver.get("https://www.facebook.com");
	     Assert.assertEquals("facebook", driver.getTitle());
	     
	}
	@AfterMethod
	void close_browser()
	{
		 driver.close();
		
	}

}

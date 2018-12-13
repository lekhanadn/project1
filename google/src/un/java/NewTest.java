package un.java;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	WebElement un;
	WebElement pwd;
	@BeforeMethod(groups= {"valid","invalid"})
	void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\koushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("http://demo.guru99.com/V4/");
	}
	@Test(groups="valid")
  public void demo() 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr166488");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("usUgyvA");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Assert.assertEquals("Guru99 Bank Manager HomePage",driver.getTitle());
  }
	@Test(groups="valid")
	  public void demo1() 
		{
	        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr166488");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("usUgyvA");
			driver.findElement(By.xpath("//input[@name='btnReset']")).click();
			Assert.assertEquals("Guru99 Bank Home Page",driver.getTitle());
	  }
	@Test(groups="invalid")
	public void demo2() throws Exception
	{ 
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("lekhana");;
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("usUgyvA");
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
//	Assert.assertEquals("Guru99 Bank Home Page",driver.getTitle());
	Alert alert=driver.switchTo().alert();
	Thread.sleep(3000);
	String text=alert.getText();
	System.out.println(text);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File(".\\ScreenShot\\alert.png"));
	alert.accept();
}
	@Test(groups="invalid")
	public void demo3() throws Exception
	{
	 driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("keerthu");;
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("usUgyva");
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		//Assert.assertEquals("Guru99 Bank Manager HomePage",driver.getTitle());
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		
}
	@Test(groups="invalid")
	public void demo4() throws Exception
	{
	 driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr166489");;
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("usUgyva");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		//Assert.assertEquals("Guru99 Bank Manager HomePage",driver.getTitle());
		Alert alert=driver.switchTo().alert();
		Thread.sleep(6000);
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
}		
	@Test(groups="invalid")
	public void demo5() throws Exception
	{
		 driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("lekhana");;
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("lekhana");
			driver.findElement(By.xpath("//input[@name='btn']")).click();
		//	Assert.assertEquals("Guru99 Bank Home Page",driver.getTitle());
			Alert alert=driver.switchTo().alert();
			Thread.sleep(6000);
			String text=alert.getText();
			System.out.println(text);
			alert.accept();
	  }
	
	@AfterMethod(groups= {"valid","invalid"})
	public void close()
	{
		driver.close();
	}

}

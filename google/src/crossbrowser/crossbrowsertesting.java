package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsertesting {
	WebDriver driver;
	@Parameters({"browser","url"})
	@Test
	void browser(String browser,String url) {
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\koushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		       driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\koushik\\Desktop\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		       driver=new FirefoxDriver();
		}
		driver.get(url);
	}

}

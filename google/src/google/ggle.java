package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ggle {
	public static void main(String[ ] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\koushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.google.com");
	      driver.close();
	}
}

package logintest.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import login.java.loginpage;

public class logintest {
	@Test
	public void demo() throws Exception
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\koushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.gmail.com");
    Thread.sleep(6000);
    loginpage login=new loginpage(driver);
    login.usernametype();
    login.unnexttype();
    Thread.sleep(3000);
    login.password();
    Thread.sleep(6000);
    login.pwdnexttype();
    
	}
    

}

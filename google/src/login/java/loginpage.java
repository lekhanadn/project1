package login.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	WebDriver driver;
	By username=By.name("identifier");
	By usernamenext=By.cssSelector("#identifierNext > content > span");
	By password=By.name("password");	
    By passwordnext=By.cssSelector("#passwordNext > content");
    
public loginpage(WebDriver driver)
{
	this.driver=driver;
}

public void usernametype()
{
	driver.findElement(username).sendKeys("keerthanagowda98@gmail.com");
}

public void unnexttype()
{
	driver.findElement(usernamenext).click();
}

public void password()
{
	driver.findElement(password).sendKeys("KEERU@1996");
}

public void pwdnexttype()
{
	driver.findElement(passwordnext).click();
}

}

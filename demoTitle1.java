package ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoTitle1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	String expectedtitle="Enter Time-Track";
	String actualtitle=driver.getTitle();
	if(actualtitle.contains(expectedtitle))
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	System.out.println(actualtitle);
}
}

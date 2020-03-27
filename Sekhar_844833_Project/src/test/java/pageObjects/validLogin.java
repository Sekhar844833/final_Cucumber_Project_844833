package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class validLogin {
					//login locators
WebDriver driver;
By Administration=By.xpath("//img[@src='images/administration-button.gif']");
By Username=By.name("login");
By Password=By.name("password");
By Login=By.name("DoLogin");
public void launch(String browser)
{					// To launch Chrome Browser
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
					//To launch firefox Browser
	else if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
					// To maximize the window
		driver.manage().window().maximize();
}
public void open() 
{
	driver.get("http://examples.codecharge.com/TaskManager/Default.php");
}
public void login(String username, String password)
{					//Methods for login pages and login details
	driver.findElement(Administration).click();
	driver.findElement(Username).sendKeys(username);
	driver.findElement(Password).sendKeys(password);
					//getting login
	driver.findElement(Login).click();
}
}
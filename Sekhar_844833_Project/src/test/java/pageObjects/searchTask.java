package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class searchTask {
	WebDriver driver;
	public void open(String browser)
	{
		// To launch Chrome Browser
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
								// To open the Url
				driver.get("http://examples.codecharge.com/TaskManager/Default.php");
	}
	public void typeTask()
	{
						// To select the type of the task
		driver.findElement(By.xpath("(//option[@value='1'])[5]")).click();
	}
	public void search()
	{
						// To search the task
		driver.findElement(By.xpath("//input[@name='DoSearch']")).click();
	}
						// Method to check added task details is in the list or not	
	public void Assert()
	{
		String d=driver.findElement(By.xpath("//a[text()='CTS']")).getText();
		Assert.assertEquals("CTS", d);
	}
}

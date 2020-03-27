package pageObjects;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sort {
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
						// Method to sort the task list according to Finish Date
	public void clickfinishDate() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr[1]/td[8]/a")).click();
	}
						// Method to check added task details is in the list or not
	public void Assert()
	{
		String e=driver.findElement(By.xpath("//a[text()='CTS']")).getText();
		Assert.assertEquals("CTS", e);
	}
}

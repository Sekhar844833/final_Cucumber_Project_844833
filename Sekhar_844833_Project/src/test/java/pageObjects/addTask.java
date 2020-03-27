package pageObjects;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class addTask {
	WebDriver driver;
					//Add task locators
	By Administration=By.xpath("//img[@src='images/administration-button.gif']");
	By Username=By.name("login");
	By Password=By.name("password");
	By Login=By.name("DoLogin");
	public void open(String browser)
	{
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
					//methods for login 
	public void clickAdministration()
	{
		driver.findElement(Administration).click();
	}
	public void login()
	{
		driver.findElement(Username).sendKeys("admin");
		driver.findElement(Password).sendKeys("admin");
		driver.findElement(Login).click();
	}
					// Methods to AddTask Details
	public void AddTask()
	{
		driver.findElement(By.xpath("(//img[@border='0'])[3]")).click();
	}
	public void enterFields()
	{
		driver.findElement(By.xpath("//input[@name='task_name']")).sendKeys("CTS");
	    driver.findElement(By.xpath("//textarea[@name='task_desc']")).sendKeys("Cognizant Technology and Solutions ");
	    driver.findElement(By.xpath("(//option[@value='1'])[1]")).click();
	    driver.findElement(By.xpath("(//option[@value='1'])[2]")).click();
	    driver.findElement(By.xpath("(//option[@value='1'])[3]")).click();
	    driver.findElement(By.xpath("(//option[@value='1'])[4]")).click();
	    driver.findElement(By.xpath("(//option[@value='16'])")).click();
	}
	public void startDate()
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[8]/td/a/img"))).click().build().perform();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>allWindows=driver.getWindowHandles();	//using window handle for date picker
		for(String Window:allWindows)
		{
			System.out.println(Window);
			if(!parent.equalsIgnoreCase(Window))
			{
				driver.switchTo().window(Window);
			}
		}
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/table/tbody/tr[4]/td[3]/a"))).click().build().perform();	// select start date in second window
		driver.switchTo().window(parent);	//back to the current window 
	}
	public void endDate()
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[9]/td/a/img"))).click().build().perform();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>allWindows=driver.getWindowHandles();	//using window handle for date picker
		for(String Window:allWindows)
		{
			System.out.println(Window);
			if(!parent.equalsIgnoreCase(Window))
			{
				driver.switchTo().window(Window);
			}
		}
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/table/tbody/tr[5]/td[6]/a"))).click().build().perform();	// select finish date in second window
		driver.switchTo().window(parent);	//back to the current window 
	}
						//method to add Entered details
	public void addButton()
	{
		driver.findElement(By.xpath("//input[@name='Insert']")).click();
	}
						//method to check added task details is in the list or not
	public void Assert()
	{
		String c=driver.findElement(By.xpath("//a[text()='CTS']")).getText();
		   Assert.assertEquals("CTS", c);
	}
}

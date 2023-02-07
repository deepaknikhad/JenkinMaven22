package mavenForJenkins;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest 
{
	
	@Parameters("Browser")
	@Test
	public void startBrowser(String browserName)
	{
		System.out.println("Parameter value is " + browserName );
		WebDriver driver = null;
		
		if(browserName.contains("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browserName.contains("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else if(browserName.contains("Gecko"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Assert.assertTrue(driver.getTitle().contains("Instagram"), "Title does not match");		
		driver.quit();
		
	}
	

	/*@Parameters("Browser")
	@Test
	public void startBrowser(String browserName)
	{
		System.out.println("Parameter value is "+browserName);
		WebDriver driver=null;
		
		if(browserName.contains("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--headless");
			opt.addArguments("--no-sandbox");
			opt.addArguments("--disable-dev-shm-usage");
			driver=new ChromeDriver(opt);
		}
		else if(browserName.contains("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertTrue(driver.getTitle().contains("Orange"), "Title does not match");
		driver.quit();
	}*/
	
	
	
	
	
}

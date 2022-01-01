package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

public class testBase {
	
	public static WebDriver driver;

	@BeforeSuite
	@org.testng.annotations.Parameters ({"browser"})

	//chrome or Firefox
	public void startDriver(@Optional("chrome") String browser)
	{
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("http://www.konakart.com/konakart/Welcome.action");
	}

	@AfterSuite
	public void stopDriver()
	{
		//driver.quit();
	}
	
	

}

package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	static WebDriver driver;
	public static WebDriver getWebDriver(String browser) 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "src//main//resources//Browsers//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			{
				System.setProperty("webdriver.gecko.driver", "src//main//resources//Browsers//geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		return driver;
	}
}

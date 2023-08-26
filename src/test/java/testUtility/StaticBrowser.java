package testUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticBrowser 
{
	
static WebDriver driver;
 public static WebDriver openBrowser(String browserName,String Url) 
 {
	 if(browserName.equalsIgnoreCase("chrome"))
	 {
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions(); 
		 options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
	 }
	 else if(browserName.equalsIgnoreCase("firefox"))
	 {

		 WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		 
	 }
	 else if(browserName.equalsIgnoreCase("Edge"))
	 {

		 WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		 
	 }
	 
	 driver.get(Url);
	 
	 driver.manage().window().maximize();
	 
	 return driver;
	 
	 
 }
}

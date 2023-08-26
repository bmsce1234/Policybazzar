package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import testUtility.StaticBrowser;

public class BaseClass 
{
 
static WebDriver driver;
	
	@Parameters({"browserName"})
	
	@BeforeTest
	public void beforeTest(String browserName) throws InterruptedException
	{
	 driver = StaticBrowser.openBrowser(browserName, "https://www.policybazaar.com");
	
	 this.driver=driver;// used local driver value to assign golbally
	 Thread.sleep(2000);
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

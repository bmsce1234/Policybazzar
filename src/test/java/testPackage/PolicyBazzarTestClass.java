package testPackage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pompackage.PolicyBazzarHomepage;
import pompackage.ProfileBazzarProfile;

public class PolicyBazzarTestClass extends BaseClass {
 
	PolicyBazzarHomepage home;
	ProfileBazzarProfile profile;
	
	@BeforeClass
	public void beforeClass()
	{
      home= new PolicyBazzarHomepage(driver); 
		profile=new ProfileBazzarProfile(driver);
	}
	@Test(priority=1)
	public void loginToPolicyBazzar() throws InterruptedException
	{
		 home.clickOnSignbuttonHomepage();
		 Thread.sleep(3000);
		 home.enterMobileNumber("9405888174");
		 home.clickOnsignWithPassword();
		 Thread.sleep(3000);
		 home.enterPassword("pallu12345");
		 Thread.sleep(3000);
		 home.clickOnSignButton();
		 Thread.sleep(3000);
		 home.clickOnMyAccount();
		 Thread.sleep(3000);
		 home.clickOnProfile();
		 Thread.sleep(3000);
		 //Switch selenium focus 
		 
		 Set<String> allpageId = driver.getWindowHandles();
		 
		 //to store in the form of index we need list
		 
		 ArrayList<String> al= new ArrayList<>(allpageId);
		 Thread.sleep(3000);
		 String profilePageId = al.get(1);
		 
		 //Switch Selenium Focus
		 Thread.sleep(4000);
		 
		 driver.switchTo().window(profilePageId);
		 
		 Thread.sleep(3000);
		 
	}
	
	@Test(priority=2)
  public void validateUsername() throws InterruptedException  
  {
		 
	
	 
	 String actualResult=profile.verifyUserName();
	 
	 String ExpectedResult="Pallavi Chaudhari";
	 Thread.sleep(3000);
	 
	 Assert.assertEquals(actualResult, ExpectedResult);
	
	 Thread.sleep(3000);
	 
  }
	@Test(priority=3)
	public void logoutFrompolicyBazzar() throws InterruptedException
	{
		profile.clickONLogoutBuuton();
		
		Thread.sleep(1000);
	}
	
}

package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBazzarHomepage 
{
	WebDriver driver;
	// variable declaration
	
@FindBy(xpath="//a[text()='Sign in']") private WebElement signButton;

@FindBy(xpath="(//label[text()='Mobile Number'])[2]//preceding-sibling::input")private WebElement mobileNumberField;
	
@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signWithPassword;
	
@FindBy(xpath="//input[@name='password']") private WebElement PasswordField;
	
@FindBy(xpath="//span[text()='Sign in']") private WebElement signButton1;	
	
@FindBy(xpath="//div[@class='userprofile']") private WebElement myAccount;	
	
@FindBy(xpath="//span[text()=' My profile ']") private WebElement profile;
	
	
  //initalization using constructor using pagefactory


public PolicyBazzarHomepage(WebDriver driver)
{    this.driver=driver;// we are assining local value to global driver 
	 PageFactory.initElements(driver, this);
}
	
 //usage or resuablity

 public void clickOnSignbuttonHomepage()
 {
	 signButton.click();
 }

public void enterMobileNumber(String mobileNumb)
{
	 mobileNumberField.sendKeys(mobileNumb);
}


public void clickOnsignWithPassword()
{
	signWithPassword.click();
}
	
public void enterPassword(String pass)
{
	PasswordField .sendKeys(pass);
}


public void clickOnSignButton()
{
	signButton1.click();
}

public void clickOnMyAccount()
{
	myAccount.click();
}

public void clickOnProfile()
{
	profile.click();
}







	
}

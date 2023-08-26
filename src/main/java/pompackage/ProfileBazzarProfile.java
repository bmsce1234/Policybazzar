package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileBazzarProfile 
{
static WebDriver driver;
	
	
 @FindBy(xpath="//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']") private WebElement profile;
 @FindBy(xpath="//div[@title=\"Logout\"]") private WebElement logoutButton;	

	public ProfileBazzarProfile (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String verifyUserName()
	{
		return profile.getText();
		
	}
	
	public void clickONLogoutBuuton()
	{
		logoutButton.click();
	}
}

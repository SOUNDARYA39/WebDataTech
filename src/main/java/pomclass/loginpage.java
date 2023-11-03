package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="j_username")
	private WebElement usernametextfield;
	
	@FindBy(name="j_password")
	private WebElement passwordtextfield;
	
	@FindBy(id="j_client_id")
	private WebElement dropdown;
	
	@FindBy(id="login-button")
	private WebElement loginb;

	public WebElement getUsernametextfield() {
		return usernametextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getLoginb() {
		return loginb;
	}

public void loginpageact(String Username, String Password)
{
	System.out.println("username="+Username);
	System.out.println("password="+Password);
	usernametextfield.sendKeys(Username);
	passwordtextfield.sendKeys(Password);
	dropdown.sendKeys("Technical Interview");
	loginb.click();
}

	
	
	

}

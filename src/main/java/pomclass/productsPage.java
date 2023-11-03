package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage {
	
	public productsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@class='menu-link'] )[10]  ")
	private WebElement product;

	public WebElement getProduct() {
		return product;
	}
	
	public void productsel()
	{
		product.click();
	}
	

}

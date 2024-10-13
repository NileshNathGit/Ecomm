package pageObjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;;

public class homePage extends BasePage {

	public homePage(WebDriver driver)
	{
		super(driver);
	}
	
//	locators
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyAccount;
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
//	@FindBy(xpath='')
//	WebElement lnkMyAccount;
//	@FindBy(xpath='')
//	WebElement lnkMyAccount;
//	@FindBy(xpath='')
//	WebElement lnkMyAccount;
//	@FindBy(xpath='')
//	WebElement lnkMyAccount;
//	@FindBy(xpath='')
//	WebElement lnkMyAccount;
//	
	
//	Actions Method
	public void clickMyAccount()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkMyAccount));
        element.click();
        
	}
	public void clickRegister()
	{
		lnkRegister.click();		
	}

}

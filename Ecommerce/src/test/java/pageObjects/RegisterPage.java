package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class RegisterPage extends BasePage{
	//Constructor
	public RegisterPage(WebDriver driver)
	{
		super(driver);
	}
	//	Locators

//	@FindBy(xpath="//input[@id='input-username']")
//	WebElement txtUserName;

	@FindBy(xpath="//input[@id='input-firstname']")
	public WebElement txtFirstName;

	@FindBy(xpath="//input[@id='input-lastname']")
	public WebElement txtLastName;

	@FindBy(xpath="//input[@id='input-email']")
	public WebElement txtEmail;

	@FindBy(xpath="//select[@id='input-country']")
	public WebElement drpCountry;

	@FindBy(xpath="//input[@id='input-password']")
	public WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='agree']")
	public
	WebElement ckdprivacy;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	public WebElement btnContinue;
	
//	Action Methods
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	Actions actions = new Actions(driver);
		public void FirstName(String Fname)
	{
		txtFirstName.sendKeys(Fname);
	}
	public void LastName(String Lname)
	{
		txtLastName.sendKeys(Lname);
	}
	public void Email(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void Password(String pass)
	{
		txtPassword.sendKeys(pass);
	}
	public void Checkprivacypolicy()
	{
		
		actions.moveToElement(ckdprivacy).click().perform();
		
	}
	public void clickSubmit() 
	{
//		wait.until(ExpectedConditions.elementToBeClickable(btnContinue));	
	actions.moveToElement(btnContinue).pause(Duration.ofSeconds(2)).click().perform();
	

	}

}

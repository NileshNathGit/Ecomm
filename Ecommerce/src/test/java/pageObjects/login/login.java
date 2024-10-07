package pageObjects.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	WebDriver driver;
	//Constructor
	public login(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	//locators
	@FindBy(xpath="//input[@name='username']")
	WebElement txt_userName;
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_passwd;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement btn_login;
	//action Methods
	public void setUsername(String username)
	{
		txt_userName.sendKeys(username);
	}
	public void setPass(String Pass)
	{
		txt_passwd.sendKeys(Pass);
	}
	public void clickLogin()
	{
		btn_login.click();
	}
	

}

package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.homePage;

import pageObjects.RegisterPage;

public class TC001_AccountRegister {
	public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost/mypage/Your Store.html");
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	@Test
	public void verify_Registration()
	{
		homePage hp = new homePage(driver);
		RegisterPage rp=new RegisterPage(driver);
		
		hp.clickMyAccount();
		hp.clickRegister();
		rp.FirstName("Nilesh");
		rp.LastName("Nathb");
		rp.Email("nileshf.nn@gmail.com");
		rp.Password("mass@123");
		rp.Checkprivacypolicy();
		rp.clickSubmit();
		
	}
}

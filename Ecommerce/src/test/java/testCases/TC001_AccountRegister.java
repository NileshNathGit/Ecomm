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
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().window().maximize();
		//Done?
	}
	@AfterClass
	public void tearDown()
	{
//		driver.close();
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
		rp.phone("98845685");
		rp.Password("mass@123");
		rp.confirmPassword("mass@123");
		rp.Checkprivacypolicy();
		rp.clickSubmit();
		
	}
}

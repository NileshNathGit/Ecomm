package scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.login.*;

public class Login {
	WebDriver driver;
	@BeforeClass
	  public void beforeClass() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
	  }
  @Test
  public void f() {
	  login lp=new login(driver);
	  lp.setUsername("Admin");
	  lp.setPass("admin123");
	  lp.clickLogin();
  }
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}



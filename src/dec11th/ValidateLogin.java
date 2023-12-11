package dec11th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateLogin {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardowm()
	{
		driver.quit();
	}
	
	@Test(enabled = false)
	public void validateLoginUsingValidCredentials()
	{
		driver.findElement(By.id("username")).sendKeys("reyaz009");
		driver.findElement(By.id("password")).sendKeys("reyaz123");
		driver.findElement(By.id("login")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
		
	}
	
	@Test
	public void validateLoginUsingCredentialsBlank()
	{
		driver.findElement(By.id("login")).click();
		
		String actualText=driver.findElement(By.id("username_span")).getText();
		
		Assert.assertEquals(actualText, "Enter Username");
	}
	

}

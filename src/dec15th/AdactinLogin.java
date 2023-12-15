package dec15th;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLogin {
	
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
	public void teardowm() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void validateLoginTest() throws InterruptedException
	{
		
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz009");
		findElement("//input[@name='username']").sendKeys("reyaz009");
		
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		findElement("//input[@name='password']").sendKeys("reyaz123");
		
		//driver.findElement(By.xpath("//input[@name='login']")).click();
		findElement("//input[@name='login']").click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
		
		
		
	}

	private WebElement findElement(String xpath) throws InterruptedException {
		
		WebElement element=driver.findElement(By.xpath(xpath));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 3px solid red;');", element);
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].removeAttribute('style', 'background: yellow; border: 3px solid red;');", element);

		
		return element;
	
		
	}

}

package dec14th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling2 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.angelfire.com/super/badwebs/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardowm() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void framesHandleTest() throws InterruptedException
	{
		String homeWindowId=driver.getWindowHandle();
		
		driver.switchTo().frame("contents");
		
		driver.findElement(By.xpath("//font[contains(text(),'Hate Frames Page')]/parent::a")).click();
		
		//driver.switchTo().defaultContent();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().window(homeWindowId);
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("main");
		
		driver.findElement(By.xpath("//a[contains(@href,'monkeyspaw')]")).click();
		
	}

}

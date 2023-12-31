package dec11th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardowm() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void mouseHoverTest()
	{
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Loans']")))
		          .pause(3000)
		          .click(driver.findElement(By.xpath("//a[contains(text(),'Two Wheeler Loan')]")))
		          .build()
				 .perform();
		
		
		
	}

}

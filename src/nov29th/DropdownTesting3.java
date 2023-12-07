package nov29th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTesting3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.id("day")).sendKeys("2");
		
		//driver.findElement(By.id("month")).sendKeys("oct");
		
		//driver.findElement(By.id("year")).sendKeys("2000");
		
		//WebElement element1=driver.findElement(By.id("day"));
		//Select s1=new Select(element1);
		//s1.selectByVisibleText("2");
		
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("2");
		
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Oct");
		
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2000");
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}

package nov29th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTesting2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement element1=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(element1);
		
		//selectByIndex(int):void 
		//s1.selectByIndex(11);
		
		//selectByValue(String):void
		//s1.selectByValue("search-alias=stripbooks");
		
		//selectByVisibleText(String):void
		
		s1.selectByVisibleText("Books");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}

package nov27th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverMethods1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//get 
		
		driver.get("https://adactinhotelapp.com/");
		
		Thread.sleep(3000);
		
		//close
		
		//driver.close();
		
		//quit
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		
		//Thread.sleep(3000);
		
		//driver.close();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		
		driver.quit();
		

	}

}

package dec7th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTesting2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		
		List<WebElement>  allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("no of links : "+allLinks.size());
		
		/*
		 * System.out.println(allLinks.get(0).getText());
		 * System.out.println(allLinks.get(1).getText());
		 * System.out.println(allLinks.get(2).getText());
		 * System.out.println(allLinks.get(3).getText());
		 * System.out.println(allLinks.get(4).getText());
		 * System.out.println(allLinks.get(5).getText());
		 * System.out.println(allLinks.get(6).getText());
		 */
		
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
		}
		
		
		driver.quit();
		
		
	}

}

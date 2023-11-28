package nov28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		int x=driver.findElement(By.id("username")).getLocation().getX();
		
		System.out.println("x is "+x);
		
		int y=driver.findElement(By.id("username")).getLocation().getY();
		
		System.out.println("y is "+y);
		
		
		System.out.println(driver.findElement(By.id("username")).getSize().getHeight());
		System.out.println(driver.findElement(By.id("username")).getSize().getWidth());
		
		
		System.out.println(driver.findElement(By.id("username")).getRect().getX());
		System.out.println(driver.findElement(By.id("username")).getRect().getY());
		System.out.println(driver.findElement(By.id("username")).getRect().getHeight());
		System.out.println(driver.findElement(By.id("username")).getRect().getWidth());
		

		driver.quit();
	}

}

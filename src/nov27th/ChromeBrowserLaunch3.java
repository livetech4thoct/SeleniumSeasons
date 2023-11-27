package nov27th;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowserLaunch3 {

	public static void main(String[] args) {
		
		//ChromeOptions options= new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
	
		WebDriverManager.chromedriver().setup();
		new ChromeDriver();
		
		//new FirefoxDriver();
		
		//new EdgeDriver();

	}

}

package nov26th;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\007 LiveTech\\jars\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		new ChromeDriver();
		
	}

}

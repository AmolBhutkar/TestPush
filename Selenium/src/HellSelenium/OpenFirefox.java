package HellSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodriver.driver" ,".\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		Thread.sleep(3000);
		//driver.navigate().to("https://session.npav.net/");
		
		//driver.get("https://www.google.com");
		

		driver.manage().window().maximize();
		Thread.sleep(3000); 
		
		
		driver.navigate().to("https://session.npav.net");
		Thread.sleep(3000);
		
		
		//driver.navigate().forward();
		//Thread.sleep(3000);
		driver.navigate().refresh();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.quit();
	}

}

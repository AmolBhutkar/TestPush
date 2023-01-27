package HellSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement ca=driver.findElement(By.xpath("//span[normalize-space()='Create account']"));
		ca.click();
		driver.findElement(By.xpath("//span[normalize-space()='For my personal use']")).click();
		driver.findElement(By.id("firstName")).sendKeys("Abc");
		driver.findElement(By.id("lastName")).sendKeys("Xyz");
		
		//driver.findElement(By.id("username")).sendKeys("money123");
		//driver.close();

	}

}

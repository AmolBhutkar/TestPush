import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eps {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://192.168.100.137:7777/");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.id("EmailID")).sendKeys("Admin@npav.net");
			driver.findElement(By.id("Password")).sendKeys("Admin@99");
			driver.findElement(By.xpath("//*[@value='Sign In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sideBarToggle']")).click();
			//driver.getTitle();
			System.out.println(driver.getTitle());
			List<WebElement>eps=driver.findElements(By.xpath("//ul[@id='mainnav']/li"));
			for(int i=0;i<eps.size();i++) {
				System.out.println(eps.get(i).getText());
			}
					

	}

}

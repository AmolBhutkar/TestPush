package HellSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class goo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("manual testin interview question");
		List<WebElement>sug=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>div:nth-of-type(1)>span"));
		System.out.println("Total suggetions:" + sug.size());

		for(int i=0;i<sug.size();i++) {
			System.out.println(sug.get(i).getText());
		}
		/*Actions action=new Actions(driver);
		
	    action.moveToElement(get(2)).click().build().perform();
	    Thread.sleep(2000);*/
		sug.get(2).click();
		driver.findElement(By.xpath("//h3[text='75 Manual Testing Interview Questions and answers - Testbytes']"));
	}

}

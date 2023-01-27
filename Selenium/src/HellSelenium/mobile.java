package HellSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mobile {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoblaze.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		List<WebElement> mob=driver.findElements(By.className("hrefch"));
		System.out.println("Total Mobile:"+ mob.size());
		
		List<WebElement> price=driver.findElements(By.cssSelector("div>div:nth-of-type(2)>div>div>div>div>h5"));
		System.out.println("Total price count:"+ price.size());
		for(int i=0;i<mob.size();i++) {
			System.out.println(mob.get(i).getText()+ "=" + price.get(i).getText());
		}
		Thread.sleep(1000);
		WebElement bt=driver.findElement(By.xpath("//*[@id='next2']"));
		System.out.println("Next Buton is Visible:" + bt.isDisplayed());
		Thread.sleep(2000);
		bt.click();
		Thread.sleep(3000);
		System.out.println("Next Buton is Visible:" +bt.isDisplayed());
		driver.close();
		
	}

}

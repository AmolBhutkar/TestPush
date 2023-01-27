import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggetions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("manual testin interview question");
		List <WebElement> sug=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>div:nth-of-type(1)>span"));
		System.out.println("Total suggetions:"+sug.size());

		for(int i=0;i<sug.size();i++) {
			System.out.println(sug.get(i).getText());
		}

	}

}

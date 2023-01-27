package HellSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Radio1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		String title = driver.getTitle();
		System.out.println(title);
//		driver.findElement(By.xpath("//input[@value='1']")).click();
//
//		driver.findElement(By.xpath("//input[@value='2']")).click();
//
//		driver.findElement(By.xpath("//input[@value='-1']")).click();

		List<WebElement> rdo = driver.findElements(By.xpath("//span[@data-type='radio']/span"));
		System.out.println("Total Radio Buttons:" + rdo.size());
		for (int i = 0; i < rdo.size(); i++) {

			System.out.println(rdo.get(i).getText());
		}

//		Actions ac=new Actions(driver);
//		ac.moveToElement(driver.findElement(By.xpath("//input[@value='2']"))).click();
	rdo.get(0).click();
		Thread.sleep(3000);
		rdo.get(1).click();
		Thread.sleep(3000);
		rdo.get(2).click();
		driver.findElement(By.xpath("//span[@data-type='selectors']"));
		Thread.sleep(3000);
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select slt=new Select(day);
		System.out.println("First Select Option:"+slt.getFirstSelectedOption().getText());
		slt.selectByIndex(10);
		
		
		
	}

}

package HellSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import bsh.org.objectweb.asm.Label;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chorme.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		// driver.findElement(By.xpath("//button[@class='sc-jTzLTM bfMZDh']")).click();
		driver.findElement(By.xpath("//*[@id='src']")).sendKeys("Pune");
		List<WebElement> red = driver.findElements(By.cssSelector("ul.autoFill>li"));
		System.out.println("Total from place list:" + red.size());
		for (int i = 0; i < red.size(); i++) {
			System.out.println(red.get(i).getText());
		}
		red.get(1).click();

//code for destination
		driver.findElement(By.xpath("//*[@id='dest']")).sendKeys("mumbai");
		List<WebElement> red1 = driver.findElements(By.cssSelector("ul.autoFill.homeSearch>li"));
		System.out.println("Total from place list:" + red1.size());
		for (int i = 0; i < red1.size(); i++) {
			System.out.println(red1.get(i).getText());
		}
		red1.get(1).click();
		driver.findElement(
				By.cssSelector("#rb-calendar_onward_cal>table>tbody>tr:nth-of-type(1)>td:nth-of-type(3)>button"))
				.click();
		driver.findElement(By.cssSelector("#rb-calendar_onward_cal>table>tbody>tr:nth-of-type(6)>td:nth-of-type(7)"))
				.click();
		driver.findElement(By.id("search_btn")).click();
		List<WebElement> dept = driver.findElements(By.cssSelector("#filter-block>div>div:nth-of-type(2)>ul:nth-of-type(2)>li"));
		System.out.println(dept.size());
		for (int i = 0; i < dept.size(); i++) {
			System.out.println(dept.get(i).getText());
			
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"dtBefore 6 am\"]/following::label[1]")).click();
		//dept.get(2).click();
		Thread.sleep(2000);
		//bus List to selected time
		//Label<WebElemant>bus=driver.findElements(By.cssSelector("ul.bus-items>div"));
		List<WebElement>bus=driver.findElements(By.cssSelector("ul.bus-items>div"));
		System.out.println(bus.size());
		for(int i=0;i<bus.size();i++)
		{
			System.out.println(bus.get(i).getText());
		}
		bus.get(1).click();
		System.out.println("Bus Visiable");

	}

}

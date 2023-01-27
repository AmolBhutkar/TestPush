package HellSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ShibeTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome,driver" , "./Selenium/drivers");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		driver.manage().window().maximize();
		List <WebElement>liCt=driver.findElements(By.xpath("//*[@id='body']/aside/div[1]/ul/li"));
		System.out.println("Total Phone count: " +liCt.size());
		
		//Thread.sleep(10000);
		//driver.close();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for(int i=0;i<liCt.size();i++) {
			
			System.out.println(liCt.get(i).getText());
			
			if(liCt.get(i).getText().equals("VIVO")) {
        		liCt.get(i).click();
			
			}
			//div[@id='review-body']//div//ul//li
	}
		List <WebElement>liCt1=driver.findElements(By.xpath("//div[@id='review-body']//div//ul//li"));
               for(int i=0;i<liCt1.size();i++) {
			
			System.out.println(liCt1.get(i).getText());
			Thread.sleep(3000);
			driver.close();
			
 }	
}
}
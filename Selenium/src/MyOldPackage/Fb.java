package MyOldPackage;


import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fb {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		
		WebElement F=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[1]/div/img"));
		Thread.sleep(3000);
		
		WebElement G =driver.findElement(By.className("_6WOcW9 _2-k99T"));
		
		Thread.sleep(3000);
		
		WebElement H=driver.findElement(By.className("_6WOcW9 _3YpNQe"));
		
		Thread.sleep(3000);
		
		Actions builder =new Actions(driver);
		
		
		
		
		
		
		
		org.openqa.selenium.interactions.Action dragAndDrop =builder.clickAndHold(F).moveToElement(G).release(G).build();
		
		
		dragAndDrop.perform();
	
	}

}

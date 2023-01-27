package HellSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://session.npav.net");
		
		String actualurl="http://session.npav.net";
		String expectedurl=driver.getCurrentUrl();
		String aTitle="Session Tracker - Log in";
		String eTitile=driver.getTitle();
		System.out.println("Actal Title:"+aTitle);
		System.out.println("Expected Title:"+eTitile);
		System.out.println("actual url is:" +actualurl);
		System.out.println("expected url id:" +expectedurl);
	
		System.out.println("Validate Title:"+aTitle.equals(eTitile));
		if(actualurl.equals(expectedurl)) {
			System.out.println("UrlMatched");
		}
		else
		{
			System.out.println("Not MAching");
		}
		driver.findElement(By.xpath("//input[@id='TxtUserId']")).sendKeys("Amol");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@id='TxtPassword']")).sendKeys("Amol");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[@id='btnLogin']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@class='btn btn-default']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@id='btnLogout'] ")).click();
		Thread.sleep(500);
		
		
		String sour=driver.getPageSource();
		System.out.println("Source code are:"+sour);
		System.out.println("Source code length are:"+sour.length());
		driver.close();
		
		

	}

}

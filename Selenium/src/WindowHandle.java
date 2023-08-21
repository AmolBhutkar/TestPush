import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://etrain.info/in");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String homeid=driver.getWindowHandle();
		System.out.println(homeid);

		driver.findElement(By.xpath("//*[@href='http://www.indianrail.gov.in/enquiry/StaticPages/StaticEnquiry.jsp?StaticPage=refund_Rules.html&locale=en']")).click();
		 Set<String>allwindowid=driver.getWindowHandles();
		 System.out.println(allwindowid);
		 allwindowid.remove(homeid);
		 Iterator it=allwindowid.iterator();
		 String childid=(String) it.next();
		 System.out.println(childid);
		 driver.switchTo().window(childid);
		//driver.switchTo().window("'http://www.indianrail.gov.in/enquiry/StaticPages/StaticEnquiry.jsp?StaticPage=refund_Rules.html&locale=en']");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Services']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Mobile Ticketing Services']")).click();
		Thread.sleep(2000);
		String act=driver.getTitle();
		String exp="Welcome to Indian Railway Passenger Reservation Enquiry";
		//assertEquals(act, exp,"not validate");
		//assert.assertEquals(act, exp);
		System.out.println(driver.getTitle());


		
		
		 driver.findElement(By.xpath("//font[@face='Arial']/span/a")).click();
		 Set<String>allwindowid3=driver.getWindowHandles();
		 List<String> windowHandlesList = new ArrayList<>(allwindowid3);
		 
//		 //System.out.println(allwindowid3);
//		 //allwindowid.remove(homeid);
//		 Iterator it3=allwindowid3.iterator();
//		 while(it3.hasNext()) {
//			 System.out.println(it3.next());
//		 }
//		 String s2="B3022AC4172AED6B7B2ED53B2E33F460";
		 driver.switchTo().window(windowHandlesList.get(2));
		 Thread.sleep(5000);
		// driver.getTitle();
		 System.out.println(driver.getTitle());
		 
		  driver.switchTo().window(homeid);
		 driver.findElement(By.id("rsfi2")).sendKeys("Pune");
		 List<WebElement>l=driver.findElements(By.cssSelector(".ui-menu-item>a>i"));
		 for(int i=0;i<l.size();i++) {
			 System.out.println(l.get(i).getText());
		 }
		 l.get(0).click();
		 driver.findElement(By.id("stnsbmtbtn")).click();
		 List<WebElement>tr=driver.findElements(By.xpath("//div[@class='trainlist rnd5']/table/tbody/tr/td[1]/a"));
		 List<WebElement>na=driver.findElements(By.xpath("//div[@class='trainlist rnd5']/table/tbody/tr/td[2]/a"));
		 for(int i =0 ;i<tr.size();i++) {
			 System.out.println(tr.get(i).getText()+" "+na.get(i).getText());
		 }
		 tr.get(10).click();
		 System.out.println("return to home");
	
	}

}

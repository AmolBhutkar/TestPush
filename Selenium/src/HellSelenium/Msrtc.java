package HellSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Msrtc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://msrtc.maharashtra.gov.in/");
		driver.manage().window().maximize();
		WebElement title=driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/a"));
		System.out.println(title.isDisplayed());
		
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(3000);
		//WebElement login=driver.findElements(By.xpath(""));
		WebElement login=driver.findElement(By.xpath("//input[@id='from_txt']"));
		login.sendKeys("Pune");
		
		//Thread.sleep(3000);
		login.click();
		List<WebElement> act=driver.findElements(By.xpath("/html/body/div[4]/ul/li"));
		System.out.println("Total list:" + act.size());
		String str="SWR (SWARGATE, PUNE)";
		//for(int i=0;i<act.size();i++)
		//{
		//	System.out.println(act.get(i).getText());
		//}
		for(int i=0;i<act.size();i++)
		{
			//System.out.println(act.get(i).getText());
			
			if(act.get(i).getText().equalsIgnoreCase(str))
				
				
			{
				//System.out.println(i);
				act.get(i).click();
				break;
							}
			
			
		}
		//destination
		//destination
		WebElement login2=driver.findElement(By.xpath("//input[@id='to_txt']"));
		login2.sendKeys("Satara");
		//Thread.sleep(3000);
		login2.click();
		List<WebElement> act1=driver.findElements(By.xpath("/html/body/div[5]/ul/li"));
		System.out.println("Total list:" + act1.size());
		String str1="SATARA (SATARA)";
		/*for(int i=0;i<act.size();i++)
		{
			System.out.println(act.get(i).getText());
		}*/
		for(int i=0;i<act1.size();i++)
		{
			//System.out.println(act.get(i).getText());
			
			if(act1.get(i).getText().equalsIgnoreCase(str1))
				
				
			{
				//System.out.println(i);
				act1.get(i).click();
				//break;
							}
			
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='journey hasDatepick']")).click();
		WebElement dt=driver.findElement(By.xpath("//*[@id=\"datepick-div\"]/div[3]/table/tbody/tr[4]/td[3]/a"));
		dt.click();
		WebElement mt=driver.findElement(By.xpath("//*[@class='datepick-new-month']"));
		Select sl=new Select(mt);
		sl.selectByValue("0");
		
		
         //driver.close();
	}

}}

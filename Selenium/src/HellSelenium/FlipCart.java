package HellSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipCart {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("body > div._2Sn47c > div > div > button").click();
		/*
		try {
			driver.findElement(By.xpath("body > div._2Sn47c > div > div > button")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  */
		
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		
		List <WebElement>links=driver.findElements(By.tagName("a"));
        System.out.println("Total Links:" + links.size());
        
        List <WebElement>menu=driver.findElements(By.cssSelector("div._37M3Pb>div>a>div:nth-of-type(2)"));
        int size=menu.size();
        System.out.println("Total Menu Count:" +size);
        for(int i=0 ; i<size;i++)
        {
        	menu=driver.findElements(By.cssSelector("div._37M3Pb>div>a>div:nth-of-type(2)"));
        	System.out.println(menu.get(i).getText());
        }
	Thread.sleep(2000);
        //menu.get(2).click();
       // Thread.sleep(2000);
       
	Actions action=new Actions(driver);
    action.moveToElement(menu.get(2)).click().build().perform();
    Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@id=\"container\"]/div/footer/div/div[1]/div/div[8]/a[3]")).click();
  
  //*[@id="container"]/div/footer
    
  //*[@id="container"]/div/footer/div/div[1]/div/div[8]/a[3]
 /* List <WebElement>fas=driver.findElements(By.cssSelector("#container > div > div._331-kn._2tvxW > div > div > div:nth-child(3) > a > div._1psGvi.SLyWEo > div > div"));
	System.out.println("Total Element in Fasion:" + fas.size());
	for(int i=0;i<fas.size();i++)
	{
		fas.get(i).click();
	}*/
	}
	
	

}

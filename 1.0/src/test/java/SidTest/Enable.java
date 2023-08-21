package SidTest;

import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enable {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		WebElement searc=driver.findElement(By.name("q"));
		searc.sendKeys("amazon.in");
		List<WebElement> l = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div/ul/li"));
		int elementsCount = l.size();
        System.out.println("Total Number of Elements : " + elementsCount);
		
        for(int i = 0; i< l.size(); i++) {
	        
	         String s = l.get(i).getText();
	         
	         System.out.println("Text is: " + s);
	        // String s=l.get(i);
	         
	        		 
	        // driver.quit();
	         
	      }
        searc.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/a/h3")).click();
        
       // driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div")).click();
      //*[@id="nav-link-accountList-nav-line-1"]
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        driver.findElement(By.id("ap_email")).sendKeys(Utils.getData("username"));
        driver.findElement(By.id("continue")).click();
       WebElement psw= driver.findElement(By.id("ap_password"));
       psw.sendKeys(Utils.getData("password"));
       psw.sendKeys(Keys.ENTER);
       driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div")).click();
       
       System.out.println("cliked");
       
       WebElement dropdown=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select/option"));
       List <WebElement> l1= driver.findElements(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select/option"));
      // l1.size();
       System.out.println("Total dropdowns are: " +l1.size());
      System.out.println(l1.get(15).getText()); 
      l1.get(15).click();
      WebElement dell=driver.findElement(By.id("twotabsearchtextbox"));
      dell.sendKeys("Dell Computers");
      dell.sendKeys(Keys.ENTER);
      driver.findElement(By.id("low-price")).sendKeys("30000");
      WebElement high=driver.findElement(By.id("high-price"));
      high.sendKeys("50000");
      high.sendKeys(Keys.ENTER);
       //.get(i).getText
       
      /*Select slt=new Select(dropdown);
        slt.selectByValue("electronics");
        slt.isMultiple();*/
       
}
}

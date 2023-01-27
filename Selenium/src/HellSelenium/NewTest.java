package HellSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest extends Base{
 
	
@Test
  public void f() {
	  
	  NewTest.getUrls();
	  
  }
  

  @Test
  public void afterTest() {
	  
	NewTest.closeDriver();
	System.out.println("driver.closed");
	 
  }
  @BeforeTest
  public void beforeTest() {
	  NewTest.setProp();
  }
 
}

class Base
{
	 public  static WebDriver driver=new ChromeDriver();
	 
	
	public static void setProp()
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	public  static void closeDriver()
	{
		driver.quit();
	}
	public static void getUrls()
	{
		driver.get("https://msrtc.maharashtra.gov.in/");
	}
		
	
}

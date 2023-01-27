package HellSelenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


/*Assetion: It will verify the conditon of the test and decide whether the test has fail or pass
3 different assertions
1.Assert.assertTrue()if condition is true ,execute the next line of code .Else Throw ErrorMsg
2.Assert.assetFalse()if condition is false,execute the next lime of code.else throw error msg
3.Assert.assertEquals()*/
public class Asserti {
	
		WebDriver driver ;//globally define
		@Test 
		public void TestCase1() throws InterruptedException {
			String ExpectedMessage = "Sorry, we don't recognize this email.";
			
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://login.yahoo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
			driver.findElement(By.id("login-signin")).click();
			Thread.sleep(2000);
			String actualMessage=driver.findElement(By.id("username-error")).getText();
			
	        Assert.assertEquals(actualMessage, ExpectedMessage);
	        System.out.println("Error Message Verified");
			
		}
	}




package HellSelenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHm {
	WebDriver driver;
@BeforeMethod
public void login() {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("Admin",Keys.TAB);
	driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
	
} 
/*public void captureScreenshot(ITestResult result) throws Exception { //ITestResult is Inteface that check testcase is pass or fail into a log file
	if(ITestResult.FAILURE==result.getStatus()) {
		
		//create TakesScreenShot  interface  and typecasting
		TakesScreenshot src = (TakesScreenshot) driver;
		File sourceFile = src.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("./screenshot/" +result.getName()));
		System.out.println(result.getName()+" method screenshot captured.");
	}*/
//}1

@Test
public void create() throws InterruptedException {
	
	//click on PIp
	driver.findElement(By.xpath("//span[text()='PIM']")).click();
	
	System.out.println("clicked");

	//Fill Employee details
	
	
	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("ash");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("admi");
	
	WebElement clr=driver.findElement(By.xpath("//div[div[2][input[@class='oxd-input oxd-input--active']]]/div[2]/input"));
	clr.click();
	Actions act=new Actions(driver);
	act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("A")).keyUp(Keys.CONTROL).perform();
	
	clr.sendKeys("123456");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	System.out.println("details filled");
	
	driver.findElement(By.xpath("//span[text()='PIM']")).click();
	
	
	driver.findElement(By.xpath("//div[div[2][input[@class='oxd-input oxd-input--active']]]/div[2]/input")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//i[@class='oxd-icon bi-pencil-fill']")).click();//Edit Button click
	
	System.out.println("Edit Button clicked");
	driver.findElement(By.xpath("//*[@class='orangehrm-edit-employee-image-wrapper']/following::a[6]")).click();
	
	Thread.sleep(2000);
	//WebElement mar=driver.findElement(By.cssSelector("div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div:nth-of-type(2)>i"));
	
	
	
	Thread.sleep(2000); 
	
	System.out.println("Job option Cliecked");
	
	
	//dropdown	
driver.findElement(By.cssSelector("#app>div>div:nth-of-type(2) div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div:nth-of-type(2)")).click();

System.out.println("wait");

driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[18]/span")).click();

Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/div/div/div[2]")).click();
 
 driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/div/div[2]/div[5]/span")).click();
 
 driver.findElement(By.xpath("//button[@type='submit']")).click();
//	
//	act.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_DOWN).click().build().perform();
//	
//	
//	System.out.println("Job Titile Selected");
	
}}
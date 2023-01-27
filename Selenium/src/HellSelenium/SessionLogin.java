package HellSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.100.207/zerotabviewer/");
		//driver.findElement(By.name("txtUserName")).sendKeys("amolb");
		
		WebElement userId=driver.findElement(By.name("txtUserName"));
		userId.sendKeys("amolB");
		Thread.sleep(1000);
		WebElement pass=driver.findElement(By.id("txtPassword"));
		pass.sendKeys("a");
		Thread.sleep(1000);
		WebElement submit=driver.findElement(By.id("btnLogin"));
		submit.click();
		
		//WebElement cl=driver.findElement(By.tagName("button"));
		//cl.click();
		
		//Thread.sleep(1000);
		
		//WebElement rmd=driver.findElement(By.linkText("Check RMD5 in ZeroTab"));
		//rmd.click();
		//WebElement logout=driver.findElement(By.id("lnkLogout"));
		
		//logout.click();
		driver.quit();
	}

}

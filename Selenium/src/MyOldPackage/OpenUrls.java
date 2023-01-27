package MyOldPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrls {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
		
	//	WebDriverManager.chromedriver().setup();
		
		//WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.bleepingcomputer.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[1]/div[1]/a/img")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		String src=driver.getPageSource();
		System.out.println(src);
		
		
	}

}

package HellSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20 ,TimeUnit.MILLISECONDS);
		WebElement userLogin=driver.findElement(By.id("username"));
		
		System.out.println("User Name Field Editiale or not?:-" + userLogin.isEnabled() );
		System.out.println("User Name Field visiable?:-" + userLogin.isDisplayed());
		System.out.println("DefaultValue is?:" + userLogin.getAttribute("PlaceHolder"));
		userLogin.sendKeys("admin");
		WebElement ps=driver.findElement(By.name("pwd"));
		ps.sendKeys("manager");
		
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[2]/td[2]/div[2]/a")).click();
		List <WebElement>dr=driver.findElements(By.xpath("//*[@id=\"ext-gen147\"]/span/div[2]"));
		System.out.println("Total opetion are :" + dr.size());
		for(int i=0 ;i<dr.size(); i++)
		{
			System.out.println(dr.get(i).getText());
			if(dr.get(i).getText().equals("Previous month")) {
        		dr.get(i).click();
			
			}
		}
		
	}

}

//}
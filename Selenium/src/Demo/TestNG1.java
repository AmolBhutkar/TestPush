
package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class TestNG1 {
	
	@Test(enabled=true)
	public void a() {
		System.out.println("Welcome to TestNG");
	}

	@Test
	public void b() {
		System.out.println("It is a Testing FrameWork");
	}

	
}

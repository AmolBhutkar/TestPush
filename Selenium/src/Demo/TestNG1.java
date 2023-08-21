
package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test(priority=-1,dependsOnMethods = "openbrowser",ignoreMissingDependencies = true)
	public void login() {
		System.out.println("Welcome to login");
		
	}

	@Test(priority=2)
	public void dashboard() {
		System.out.println("It is a Testing dashboard");
	}

	@Test(priority=3)
	public void logout() {
		System.out.println("logout");
		
	}
	/*
	 * @Test(priority=50) public void openbrowser() {
	 * System.out.println("openbrowser"); System.out.println(10/0);
	 * 
	 * }
	 */
}

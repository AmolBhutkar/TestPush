package Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;


public class Annotation {
	

	@BeforeTest
	  public void start1() {
		//driver=setUp("chrome","C:\\Users\\NPAV\\eclipse-workspace\\Selenium\\drivers");

		
	  }

	@Test
  public void f() {
  }
  
  @AfterTest
  public void afterTest() {
  }

}

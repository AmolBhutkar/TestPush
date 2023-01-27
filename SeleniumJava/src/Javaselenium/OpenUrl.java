
package Javaselenium;


public class OpenUr2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Desktop\\ChromeSetup.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("http://sro.corpwebcontrol.com");
		
	}

}

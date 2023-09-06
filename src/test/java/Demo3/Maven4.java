package Demo3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maven4 {

	@Test
	public void m4() throws Throwable {
		System.out.println("HELLO");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://flipkart.com");
	}
}

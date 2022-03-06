package WM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WMTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.edgedriver().setup();
		WebDriverManager.operadriver().setup();
//		WebDriverManager.chromiumdriver().setup()
//		WebDriverManager.iedriver().setup();
		
//		WebDriverManager.firefoxdriver().setup();

		//driver = new ChromeDriver();
		driver = new OperaDriver();
		
		
///////		// for particular browser versions    *//////////////////
		
//		WebDriverManager.chromedriver().driverVersion("81.0.4044.138").setup();
//		WebDriverManager.firefoxdriver().browserVersion("75").setup();
//		WebDriverManager.operadriver().proxy("server:port").setup();
//		WebDriverManager.edgedriver().mac().setup();
		
	}
	
	@Test
	public void freeCRMTest() {
		
		driver.get("https://classic.freecrm.com/");
		System.out.println(driver.getTitle());
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}

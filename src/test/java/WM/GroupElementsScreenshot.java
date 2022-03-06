package WM;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupElementsScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();  // maximize window

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.get("https://app.hubspot.com/signup-hubspot/crm?loginRedirectUrl=undefined");
		
		WebElement user = driver.findElement(By.xpath("//form"));
		File srcFile = user.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("./target/hubspot_register.png"));
		
		driver.quit();
		
		
		
		
	}

}

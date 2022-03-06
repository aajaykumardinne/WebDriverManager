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

public class TakeElementScreenshot {

	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.get("https://github.com/login");
		
		WebElement email = driver.findElement(By.id("login_field"));
	    WebElement password = driver.findElement(By.id("password"));
	    WebElement signButton = driver.findElement(By.name("commit"));
	    WebElement forgotPwd = driver.findElement(By.linkText("Forgot password?"));
	    
	    
	    email.sendKeys("dinnekumar@outlook.com");
	    password.sendKeys("Nevergiveup_45");
	    
		
	    takeElementScreenshot(email,"emailElement");
	    takeElementScreenshot(password,"passwordElement");
	    takeElementScreenshot(signButton,"signButtonElement");
	    takeElementScreenshot(forgotPwd ,"forgotPwdLink");
	    
	    
	    driver.quit();
	    
	    }
	
	public static void takeElementScreenshot(WebElement element, String fileName) {
		
		
		 File srcFile = element.getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(srcFile,new File("./target/screenshots/"+fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		    
		
	}

}



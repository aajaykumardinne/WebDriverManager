package WM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRectMethodConcept {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();  // maximize window
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		driver.get("https://github.com/login");
		
		WebElement signButton = driver.findElement(By.name("commit"));
		
		//Selenium 3
		Dimension signButtonDim = signButton.getSize(); 
		System.out.println(signButtonDim.getHeight());
		System.out.println(signButtonDim.getWidth());
		
		Point p= signButton.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		//Selenium 4
		Rectangle signButtonRect = signButton.getRect();
		
		System.out.println(signButtonRect.getHeight());
		System.out.println(signButtonRect.getWidth());
		
		System.out.println(signButtonRect.getX());
		System.out.println(signButtonRect.getY());
		
		
		driver.quit();
		
		
	}

}

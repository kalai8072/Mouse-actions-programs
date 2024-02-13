package org.mouseaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// Element size or element point will be changed size of the browser window.

public class LocationofElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		//Maximize
		
		System.out.println("Before maximizing window:"+logo.getLocation()); // (276, 67) //default location
		
		driver.manage().window().maximize(); 
		
		System.out.println("After maximizing window:"+logo.getLocation()); //location-(476, 85)
		
		driver.manage().window().minimize();
		
		//Minimize
		
		System.out.println("After minimizing window:"+logo.getLocation()); //(273, 40)
		
		driver.manage().window().fullscreen();
		
		//FullScreen
		
		System.out.println("After FullScreen window:"+logo.getLocation()); //(476, 119)
		
		// set the size of window
		
		Point p = new Point(100,100); //(Point object - (X,Y)) , Point axis - X,Y axis
		
		driver.manage().window().setPosition(p);
		
		System.out.println("After setting window:"+logo.getLocation()); //(274, 40)

	}

}

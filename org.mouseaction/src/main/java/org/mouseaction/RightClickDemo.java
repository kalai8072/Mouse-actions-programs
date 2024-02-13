package org.mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//Whichever you want to click 'Right click" button you can use - contextClick(Element) method.

public class RightClickDemo {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver); // given driver is mandatory
		act.contextClick(button).build().perform(); 
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click(); // Click on copy
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept(); // close alert window
		

	}

}

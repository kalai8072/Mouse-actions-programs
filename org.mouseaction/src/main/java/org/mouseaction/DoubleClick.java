package org.mouseaction;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//doubleClick(Element)

public class DoubleClick {
	
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement textbox1 = driver.findElement(By.id("field1"));

		textbox1.clear();
		textbox1.sendKeys("Michael");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(button).build().perform();
		WebElement textbox2 = driver.findElement(By.id("field2"));
		
		// When can we use getText() & getAttribute() ?
		
        //String copytext = textbox2.getText();//not worked - no inner text 

	    String copytext = textbox2.getAttribute("value"); // value attribute, Run time created. that is invisible.
	    
	    System.out.println("Copied text:"+copytext);
		
		if(copytext.equals("Michael")) {
			System.out.println("Test Passed");
			
		}
		else {
			System.out.println("Test Failed");
		}
	}

}

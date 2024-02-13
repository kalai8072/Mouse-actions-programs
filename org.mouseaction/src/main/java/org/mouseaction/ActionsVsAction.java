package org.mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsVsAction {
	
	// Where we can use build() ? // Where we can use build().perform() ?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		
		// if the requirement like this , initially set the operation later will perform it.
		
		Action myaction = act.contextClick(button).build(); // Creating action and storing it in variable // Action is interface
		
		myaction.perform(); // Completing action
		
		
		//act.contextClick(button).build().perform(); // immediate performing/operation 

	}

}

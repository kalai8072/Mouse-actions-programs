package org.mouseaction;

import java.awt.Desktop.Action;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


  //Whichever you want to use Mouse hover option, you can use moveToElement(Element) method.

public class MouseOver {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
	    WebElement desktops=driver.findElement(By.xpath("//a[text()='Desktops']"));
	    WebElement mac =driver.findElement(By.xpath("//a[text()='Mac (1)']"));
	    
	    Actions act = new Actions(driver); // To given driver should be mandatory
	    act.moveToElement(desktops).moveToElement(mac).click().build().perform();
	    //act.moveToElement(desktops).moveToElement(mac).click().perform();
	    
	    /* Whenever you are trying to use any methods from the action class object, 
	       those command should end with build().perform()(After completion of actions)
	     * build() ----- Creating an action
	     * perform() ----- Can complete the action.
	     // First comment
	     * whenever we using build(). perform() method the build() will executed two times.
	     * One is by using build() comment, other one is by using perform () comment.  that perform() also having one build method.
	       so that also will be executed.
	       
	     // Second comment
	     *  But in the second statement, this particular operations will be directly performed by perform operations.
	     *  Because when you call this perform(), this perform method internally again called build() method by default,
	     *  then perform() method will be called.
	     * So you can use either first one or second one both will work in a similar way.
	     */
	}

}

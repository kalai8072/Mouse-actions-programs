package org.mouseaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//dragAndDrop(Source Element, Target Element)
public class DragAndDrop {
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		// DragAndDrop - Source element , Target Element
		
		Actions act = new Actions(driver);
		
		WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement usa = driver.findElement(By.xpath("//div[@id='box103']"));
		
		act.dragAndDrop(washington, usa).build().perform();
		
		WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement spain=driver.findElement(By.xpath("//div[@id='box107']"));
		
		act.dragAndDrop(madrid, spain).build().perform();
		

	}

}

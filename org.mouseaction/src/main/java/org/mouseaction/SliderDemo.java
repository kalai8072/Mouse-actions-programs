package org.mouseaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

// dragAndDropBy(Element,x,y)

public class SliderDemo {

	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

		driver.manage().window().maximize();

		Actions act = new Actions(driver);

		// Minimum Slider

		WebElement min_slider = driver.findElement(By.xpath("//span[@style='left: 0%;']"));

		System.out.println("Current Locations:" + min_slider.getLocation()); // (59/252) (x/y) - here x axis only
																				// movable. y axis stable.

		act.dragAndDropBy(min_slider, 200, 252).perform();

		System.out.println("After Sliding:" + min_slider.getLocation()); // (258/252)

		// Maximum Slider

		WebElement Max_Slider = driver.findElement(By.xpath("//span[@style='left: 100%;']"));

		System.out.println("Current locations:" + Max_Slider.getLocation()); // (612/252)

		act.dragAndDropBy(Max_Slider, -200, 252).perform();

		System.out.println("After Sliding" + Max_Slider.getLocation()); // (413, 252)

	}

}

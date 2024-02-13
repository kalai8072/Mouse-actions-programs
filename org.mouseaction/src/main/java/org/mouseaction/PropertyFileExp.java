package org.mouseaction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PropertyFileExp {
	
	static WebDriver driver;

	static int b=10;
	int a=5;
	public static void main(String[] args) throws IOException {
		
		
		PropertyFileExp obj1 = new PropertyFileExp();
		System.out.println(obj1.a);
		System.out.println(b);
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\USER\\Eclipse workspace\\FinalEclipse\\org.mouseaction\\src\\main\\java\\configure.properties");
		
		Properties pr = new Properties();
		pr.load(file);
		
		String browser = pr.getProperty("browser");
		
	
		
		String url = pr.getProperty("url");
		
		if(browser.equalsIgnoreCase("chrome"))	
		{
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			System.out.println(browser);
			
		}
	
		else if(browser.equalsIgnoreCase("Firefox")){
			
			 driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			System.out.println(browser);
		}
		else {
			
			 driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			System.out.println(browser);
		}
		

	}

}

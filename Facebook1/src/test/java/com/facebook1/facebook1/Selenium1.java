package com.facebook1.facebook1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
									//Key				//Value
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");	
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
			
			
			WebElement ak=driver.findElement(By.xpath("//*[@id='u_0_c']"));
			 ak.sendKeys("alok");
		
			 WebElement ap=ak.findElement(By.xpath("//*[@id='u_0_e']"));
			 ap.sendKeys("saha");
			 
			 WebElement aa=ak.findElement(By.xpath("//*[@id=\'u_0_h\']"));
			 aa.sendKeys("aloksaha2565@gmail.com");
			
			 WebElement ab=ak.findElement(By.xpath("//*[@id=\'u_0_k\']"));
			 ab.sendKeys("aloksaha2565@gmail.com");
			 
			 WebElement ac=ak.findElement(By.xpath("//*[@id=\'u_0_o\']"));
			 ac.sendKeys("bangladesh");
			
			 WebElement ad=ak.findElement(By.xpath("//*[@id=\'month\']"));
			 ad.sendKeys("12");
			
			 WebElement ae=ak.findElement(By.xpath("//*[@id=\'day\']"));
			 ae.sendKeys("20");
			 
			 WebElement af=ak.findElement(By.xpath("//*[@id='year']"));
			 af.sendKeys("1990");
			
			 WebElement ag=ak.findElement(By.xpath("//*[@id='u_0_a']"));
			 ag.sendKeys("Male");
			 
			 
					
			 
			
		

	}

}

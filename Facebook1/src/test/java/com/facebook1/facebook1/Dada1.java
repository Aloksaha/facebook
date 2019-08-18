package com.facebook1.facebook1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dada1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/aloksaha/Downloads/Selenium%20(1).html");
		
		
		WebElement a=driver.findElement(By.xpath("/html/body/div/div[1]/input[3]"));
		a.click();
		
		WebElement b=driver.findElement(By.xpath("/html/body/div/div[2]/input[1]"));
		b.click();
		
		WebElement c=driver.findElement(By.xpath("//*[@id=\"issues\"]"));
		c.sendKeys("Bug");
		
		WebElement com=driver.findElement(By.xpath("//*[@id=\'commands\']"));
		Select ak=new Select(com);
		if(ak.isMultiple()) {
			ak.selectByVisibleText("SQL Commands");
			ak.selectByVisibleText("DOS Commands");
			ak.selectByVisibleText("Selenium Commands");
			
		}
		
		
		
		
		
	}

}

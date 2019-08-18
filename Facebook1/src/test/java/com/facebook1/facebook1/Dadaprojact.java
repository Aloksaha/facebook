package com.facebook1.facebook1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dadaprojact {

	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/aloksaha/Downloads/Selenium%20(1).html");
		
		
		WebElement a2=driver.findElement(By.xpath("/html/body/div/div[2]/input[1]"));
		a2.click();
		
		WebElement a3=driver.findElement(By.xpath("/html/body/div/div[1]/input[3]"));
		a3.click();
		
		WebElement a4=driver.findElement(By.xpath("/html/body/div/div[1]/input[4]"));
		a4.click();
		
		WebElement ae=driver.findElement(By.xpath("//*[@id=\'issues\']"));
		 Select set=new Select(ae);
		 set.selectByVisibleText("Task");
		 List<WebElement> k= set.getOptions();
		 for(WebElement z:k) {
			 String s=z.getText();
			 System.out.println(s);}
		
			
		
		
		 WebElement ae1=driver.findElement(By.xpath("//*[@id=\'commands\']/option[3]"));
		 ae1.click();
		 
		 
		 
		 WebElement ae2=driver.findElement(By.xpath("//*[@id=\'chatbutton\']"));
		 ae2.click();
		
		
		// gender("male");
		 
	}
	public static void setdropdown(WebElement x, String y) {
		
		
		 Select set=new Select(x);
		 set.selectByVisibleText(y);
		set.isMultiple();
		
		
	}
//	public static void gender( String y) {
//		
//		WebElement male=driver.findElement(By.xpath("/html/body/div/div[2]/input[1]"));
//		WebElement Female=driver.findElement(By.xpath("/html/body/div/div[2]/input[2]"));
//	male.click();
//	}
//	
}

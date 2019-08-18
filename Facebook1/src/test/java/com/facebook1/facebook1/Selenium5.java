package com.facebook1.facebook1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys("hbnbcud@ygbcx.com");
		
		WebElement pass=driver.findElement(By.xpath("//*[@id='pass']"));
		pass.sendKeys("fhi3rcur");
		
		WebElement firstname=driver.findElement(By.xpath("//*[@id='u_0_c']"));
		firstname.sendKeys("ALOK");
		
		WebElement lastname=driver.findElement(By.xpath("//*[@id='u_0_e']"));
		lastname.sendKeys("SAHA");
		
		WebElement idnumber=driver.findElement(By.xpath("//*[@id='u_0_h']"));
		idnumber.sendKeys("savfwudjher@hbc.com");
		
		WebElement password=driver.findElement(By.xpath("//*[@id='u_0_o']"));
		password.sendKeys("uybfcwufc");
		
		WebElement month=driver.findElement(By.xpath("//*[@id='month']"));
		Select ak=new Select(month);
		ak.selectByVisibleText("May");
		
		WebElement day=driver.findElement(By.xpath("//*[@id='day']"));
		Select ap=new Select(day);
		ap.selectByVisibleText("12");
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\'year']"));
		Select sk=new Select(year);
		sk.selectByVisibleText("2003");
		
		WebElement male=driver.findElement(By.xpath("//*[@id='u_0_a']"));
		male.click();
		
		
		
		driver.close();
	}

}

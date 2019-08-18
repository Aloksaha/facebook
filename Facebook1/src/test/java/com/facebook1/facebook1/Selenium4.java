package com.facebook1.facebook1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver3 =new ChromeDriver();
		driver3.get("http://www.facebook.com");
		
		WebElement userid=driver3.findElement(By.xpath("//tr/td/input"));
		userid.sendKeys("jhdjk@yahoo.com");
		
		WebElement pass=driver3.findElement(By.xpath("//tr/td/input/../following-sibling::*[1]/input"));
		pass.sendKeys("jhdjk@yahoo.com");
		
		WebElement firstname=driver3.findElement(By.xpath("//input[@id='u_0_c']"));
		firstname.sendKeys("ALOK");
		
		WebElement lastname=driver3.findElement(By.xpath("//input[@id='u_0_e']"));
		lastname.sendKeys("SAHA");
		
		WebElement alok=driver3.findElement(By.xpath("//*[@id='u_0_h']"));
		alok.sendKeys("bferib474b f");

		WebElement pword=driver3.findElement(By.xpath("//*[@id=\"u_0_o\"]"));//*[@id="u_0_o"]
		pword.sendKeys("nbieck");
		
		WebElement month=driver3.findElement(By.xpath("//*[@id=\'month\']"));
		Select ak=new Select(month);
		ak.selectByVisibleText("Feb");
		
		WebElement day=driver3.findElement(By.xpath("//select[@id='day']"));
		Select ap=new Select(day);
		ap.selectByVisibleText("23");
		
		WebElement year=driver3.findElement(By.xpath("//select[@id='year']"));
		Select sk=new Select(year);
		sk.selectByVisibleText("2002");
		
		
		
	}

}

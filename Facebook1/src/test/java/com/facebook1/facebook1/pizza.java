package com.facebook1.facebook1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pizza {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		WebElement ak=driver.findElement(By.xpath("//input[@id='email']/../following-sibling::*[1]/input"));
		ak.sendKeys("fvjhgjd");
		
		WebElement ap=driver.findElement(By.xpath("//input[@id='email']/../following-sibling::*[1]/input/../preceding-sibling::*/input"));
		ap.sendKeys("iufnciurhfrh893n");



	}

}

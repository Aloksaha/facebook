package com.facebook1.facebook1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		List<WebElement> a=driver.findElements(By.tagName("input"));
		for(WebElement v:a) {
		String s=v.getAttribute("value");	
		System.out.println(s);	

	}
	}
	
}

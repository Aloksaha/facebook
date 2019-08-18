package com.facebook1.facebook1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooklinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
	
		 List<WebElement> links =driver.findElements(By.tagName("a"));
		  for(WebElement e: links) {
			  
		  
			 String value= e.getAttribute("href");
			  System.out.println(value);
			 if(value.equals("")) {e.click();
			 
			 }
			  
			  int total=links.size();

				 System.out.println(total);
		   
		 
		 
	}

	}}

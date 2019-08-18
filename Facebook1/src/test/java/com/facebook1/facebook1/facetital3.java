package com.facebook1.facebook1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facetital3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\'month\']"));
	
		Select ak=new Select(month);
		List<WebElement>a=ak.getOptions();
		
		for(WebElement w:a) {
			String s=w.getText();
			System.out.println(s);
		}
		
		WebElement day=driver.findElement(By.xpath("//*[@id=\'day\']"));
		Select as=new Select(day);
		List<WebElement>b=as.getOptions();
		for(WebElement e:b) {
			String t=e.getText();
			System.out.println(t);
		}
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\'year\']"));
		Select ap=new Select(year);
		List<WebElement>c=ap.getOptions();
		for(WebElement t:c) {
			String i=t.getText();
			System.out.println(i);
		}
		
		
		
		
		
		
		

	}

}

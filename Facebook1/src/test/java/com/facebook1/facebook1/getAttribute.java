package com.facebook1.facebook1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class getAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver ak=new ChromeDriver();
		ak.get("https://www.hotels.com/");
		
		List<WebElement> a=ak.findElements(By.tagName("a"));
		System.out.println(a);
		for(WebElement v:a) {
		String s=v.getAttribute("href");	
		System.out.println(s);	
			
		int b=a.size();
		System.out.println(b);		
		}
		Actions act=new Actions(ak);
		WebElement packges=ak.findElement(By.xpath("//*[@id=\'hdr-packages\']"));
		act.moveToElement(packges);
		act.click();
		act.build().perform();
		
		WebElement ori=ak.findElement(By.xpath("//*[@id=\'package-origin-hp-package\']"));
		ori.sendKeys("JFK");
		WebElement des=ak.findElement(By.xpath("//*[@id=\'package-destination-hp-package\']"));
		des.sendKeys("DAC");
		
		WebElement day1=ak.findElement(By.xpath("//*[@id=\'package-departing-hp-package\']"));	
		day1.sendKeys("12/22/2019");
		WebElement day2=ak.findElement(By.xpath("//*[@id=\'package-returning-hp-package\']"));	
		day2.sendKeys("12/28/2019");

		WebElement select=ak.findElement(By.xpath("//*[@id=\'package-advanced-preferred-class-hp-package\']"));	
		Select ap=new Select(select);
		ap.selectByVisibleText("Business");
		
	
	}	
}

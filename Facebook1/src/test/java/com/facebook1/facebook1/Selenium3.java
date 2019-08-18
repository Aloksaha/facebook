package com.facebook1.facebook1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver2 =new ChromeDriver();
		driver2.get("http://www.facebook.com");
	
		WebElement email=driver2.findElement(By.xpath("//*[@id=\'email\']"));
		email.sendKeys("sahaalok326@yahoo.com");
		
		WebElement pass=driver2.findElement(By.xpath("//*[@id=\'pass\']"));
		pass.sendKeys("hdududfnf");
		
		
		WebElement first=driver2.findElement(By.xpath("//*[@id=\'u_0_c\']"));
		first.sendKeys("ALOK");
		
		WebElement last=driver2.findElement(By.xpath("//*[@id=\'u_0_e\']"));
		last.sendKeys("SAHA");
		
		WebElement phone=driver2.findElement(By.xpath("//*[@id=\'u_0_h\']"));
		phone.sendKeys("3479882203m");
		
		WebElement pass1=driver2.findElement(By.xpath("//*[@id=\'u_0_o\']"));
		pass1.sendKeys("hfy376erb");
		
		WebElement male=driver2.findElement(By.xpath("//*[@id=\'u_0_a\']"));
		male.click();
		
		WebElement day=driver2.findElement(By.xpath("//*[@id=\'day\']"));
		Select ak=new Select(day);
		ak.selectByVisibleText("23");
		
		WebElement year=driver2.findElement(By.xpath("//*[@id=\'year\']"));
		Select ap=new Select(year);
		ap.selectByVisibleText("2002");
		
		WebElement month=driver2.findElement(By.xpath("//*[@id=\'month\']"));
		Select as=new Select(month);
		as.selectByVisibleText("May");
		
		WebElement sign=driver2.findElement(By.xpath("//*[@id=\'u_0_u\']"));
		sign.click();
		
		List<WebElement> links=driver2.findElements(By.tagName("a"));
		int a=links.size();
		System.out.println(a);
		
		for(WebElement w:links) {
			String s=w.getAttribute("href");
			System.out.println(s);
		}
		
		
		
		
		
		
//		driver2.close();
	}

}

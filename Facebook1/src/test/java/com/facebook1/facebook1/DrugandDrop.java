package com.facebook1.facebook1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrugandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		WebElement drag = driver.findElements(By.xpath("//*[text()='Teens']")).get(0);
		WebElement drop=driver.findElements(By.xpath("//*[text()='Magazines']")).get(1);
				Actions ak=new Actions(driver);

		//ak.moveToElement(deal);
		ak.dragAndDrop(drag, drop);
		//ak.click();
		ak.build().perform();
	}

}

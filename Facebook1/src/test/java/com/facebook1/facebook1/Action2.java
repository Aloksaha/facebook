package com.facebook1.facebook1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.hotels.com");

		Actions ak=new Actions(driver);
		WebElement sign=driver.findElement(By.xpath("//*[@id=\'hdr-account\']"));
		ak.moveToElement(sign);
		ak.click();
		

		WebElement acc=driver.findElement(By.xpath("//*[@id=\'hdr-create\']"));
		ak.moveToElement(acc);
		ak.click();
		ak.build().perform();
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\'sign-up-email\']"));
		email.sendKeys("sahaalok123@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"sign-up-password\"]"));
		pass.sendKeys("hgfsdsdy");
		
		
		WebElement first=driver.findElement(By.xpath("//*[@id=\'sign-up-first-name\']"));
		first.sendKeys("ALOK");
		
		WebElement last=driver.findElement(By.xpath("//*[@id=\'sign-up-last-name\']"));
		last.sendKeys("SAHA");
		
//		Actions ap=new Actions(driver);
		WebElement up=driver.findElement(By.xpath("//*[@id=\'signup-button\']"));
		ak.moveToElement(up);
		ak.click();		
		ak.build().perform();
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File screen1=shot.getScreenshotAs(OutputType.FILE);
		File target=new File("picture/alok4.png");
		FileUtils.copyFile(screen1, target);
		
		
		
		
	}

}

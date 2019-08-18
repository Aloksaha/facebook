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

public class Action {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.hotels.com/");
		driver.navigate().to("http://www.hotels.com");
		
		Actions ak=new Actions(driver);
		By x=By.xpath("//a[contains(@id,'hdr-packages')]");
		WebElement pack=driver.findElement(x);
		ak.moveToElement(pack);
		
		ak.click();
		
		ak.build().perform();
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File screen=shot.getScreenshotAs(OutputType.FILE);
		
		File target=new File("picture/al.png");
		FileUtils.copyFile(screen, target);
		
		
		
	}

}

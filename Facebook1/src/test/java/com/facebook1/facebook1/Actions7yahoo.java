package com.facebook1.facebook1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions7yahoo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.yahoo.com");
		
		TakesScreenshot screen=(TakesScreenshot)driver;
		
		File source=screen.getScreenshotAs(OutputType.FILE);
		
		File target = new File("picture/short.png");
		
		FileUtils.copyFile(source,target);
		
		
		
		
		
	}

}

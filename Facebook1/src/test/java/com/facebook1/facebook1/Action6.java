package com.facebook1.facebook1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action6 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.hotels.com");

		Actions ak=new Actions(driver);
		WebElement deal=driver.findElement(By.xpath("//*[@id='hdr-deals']"));
		ak.moveToElement(deal);
		ak.click();
		ak.build().perform();
		
		Actions ap=new Actions(driver);
		WebElement signup=driver.findElement(By.xpath("//*[@id='hdr-account']"));
		ap.moveToElement(signup);
		ap.click();
		ap.build().perform();
		
		Actions aq=new Actions(driver);
		WebElement sign=driver.findElement(By.xpath("//*[@id='hdr-create']"));
		aq.moveToElement(sign);
		aq.click();
		aq.build().perform();
		
		WebElement email=driver.findElement(By.xpath("//*[@id='sign-up-email']"));
		email.sendKeys("ashdbjf@bujfdv.com");
		
		WebElement pass=driver.findElement(By.xpath("//*[@id='sign-up-password']"));
		pass.sendKeys("hgbeduejdf");
		
		WebElement firstname=driver.findElement(By.xpath("//*[@id='sign-up-first-name']"));
		firstname.sendKeys("ALOK");
		
		WebElement lastname=driver.findElement(By.xpath("//*[@id='sign-up-last-name']"));
		lastname.sendKeys("SAHA");
		
		Actions aw=new Actions(driver);
		WebElement rewords=driver.findElement(By.xpath("//*[@id='hdr-rewards']"));
		aw.moveToElement(rewords);
		aw.click();
		aw.build().perform();
		
		Actions ae=new Actions(driver);
		WebElement us=driver.findElement(By.xpath("//*[@id='ftr-about-us']"));
		ae.moveToElement(us);
		ae.click();
		ae.build().perform();
		
		Actions ar=new Actions(driver);
		WebElement menu=driver.findElement(By.xpath("//*[@id='hdr-customer-bookings']"));
		ar.moveToElement(menu);
		ar.click();
		ar.build().perform();
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File screen=shot.getScreenshotAs(OutputType.FILE);
		File target=new File("picture/alok.png");
		FileUtils.copyFile(screen, target);
		
		
		
	//	driver.close();
	}

}

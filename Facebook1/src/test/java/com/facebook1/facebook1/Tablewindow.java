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
import org.openqa.selenium.interactions.Actions;

public class Tablewindow {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.livescore.in/bangladesh/");
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File screen=shot.getScreenshotAs(OutputType.FILE);
		File target=new File("picture/alok2.png");
		FileUtils.copyFile(screen,target);

		
		
		List<WebElement> time= driver.findElements(By.xpath("//tr/td[1]"));
		
		
		
		int total=time.size();
		System.out.println(total);
		for(int i=1;i<=total-1;i++) {
			//String datetime="//table[1]/tbody[1]/tr["+i+"]/td[1]";
			
			
		String datetime="//tr["+i+"]/td[1]";
			
		
		WebElement row=driver.findElement(By.xpath(datetime));
		String s=row.getText();
		
		System.out.println(s);
		

		
//		String team="//table[1]/tbody[1]/tr["+i+"]/td[3]";
//		WebElement cell=driver.findElement(By.xpath(team));
//		String b=cell.getText();
//		System.out.print(b);
		
		
		}
		
		}

	}



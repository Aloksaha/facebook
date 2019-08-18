package cusxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class class1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///Users/aloksaha/Desktop/FrameExample.html");
		WebElement txt = driver.findElement(By.xpath("//input[@name='executer']"));
		txt.clear();
		txt.sendKeys("Alok");
		
		
		
		
		List<WebElement> name=driver.findElements(By.xpath("//iframe"));
		System.out.println(name.size());
		String[]ak= {"alok","karim","nick","mamun"};
		int i=0;
		
		for(WebElement w:name) {
			driver.switchTo().frame(w);	
			
			WebElement text=driver.findElement(By.xpath("//input[@id='b']"));
			text.sendKeys(ak[i]);
			i++;
			
			
			driver.switchTo().defaultContent();
			
			
		}
	
	}

}

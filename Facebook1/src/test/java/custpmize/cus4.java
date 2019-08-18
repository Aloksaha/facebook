package custpmize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cus4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nytimes.com/");
		
		WebElement link=driver.findElements(By.xpath("//h2[contains(@class,'css-9ywo2s esl82me2')]")).get(2);
		link.click();
		
	}

}

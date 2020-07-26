package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	
	WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
	}
	public void searchWord(String word) {
		
		driver.findElement(By.className("search-box")).sendKeys(word);
		driver.findElement(By.xpath("//*[@id=\'auto-complete-app\']/div/div/input")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/a")).click();
		driver.findElement(By.className("pr-in-btn add-to-bs")).click();
		
	}

}

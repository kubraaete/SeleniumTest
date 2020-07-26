package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPage {
	WebDriver driver;
	
	public BasketPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void basket(String number) {
		driver.findElement(By.id("myBasketListItem")).click();
		driver.findElement(By.className("ty-numeric-counter-button")).click();
		
		WebElement element=driver.findElement(By.className("counter-content"));
		String numberMain=element.getAttribute("value");
		
		if(number.equals(numberMain)) {
			System.out.println("Ürün adet sayýsý doðru.");
		}
		else {
			System.out.println("Ürün adet sayýsý yanlýþ.");
		}
	}
	
	public void basketDelete() {
		driver.findElement(By.xpath("//*[@id=\'partial-basket\']/div/div[3]/div[2]/div[3]/button")).click();
		driver.findElement(By.className("btn")).click();
	}
	
	

}

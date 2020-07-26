package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Login(String username, String password) {
		
		driver.findElement(By.xpath("//*[@id=\'accountBtn\']")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("loginSubmit")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String title=driver.getTitle();
		if("Kad�n, Moda, Giyim, Stil, Giyim Markalar� | Trendyol".equals(title)) {
			System.out.println("Giri� Yap�ld�.");
			
		}
		else {
			System.out.println("Giri� Yap�lamad�.");
			driver.close();
		}
		
		
	}

}

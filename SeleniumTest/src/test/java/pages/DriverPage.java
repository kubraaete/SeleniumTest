package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverPage {
	
	public WebDriver open(WebDriver driver, String browser, String url) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\SeleniumTest\\drivers\\chromedriver\\chromedriver.exe");
		
		if("Chrome".equals(browser)) {
			driver=new ChromeDriver();
		}
		else {
			System.out.println("Bulunamadý!");
		}
		driver.get(url);
		
		String title=driver.getTitle();
		
		if(title.equals("En Trend Ürünler Türkiye'nin Online Alýþveriþ Sitesi Trendyol'da")) {
			System.out.println("Trendyol Sayfasý Açýldý.");
			
		}
		else {
			System.out.println("Trendyol Sayfasý Açýlamadý.");
			driver.close();
		}
		
		return driver;
		
		
	}

}

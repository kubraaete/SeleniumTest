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
			System.out.println("Bulunamad�!");
		}
		driver.get(url);
		
		String title=driver.getTitle();
		
		if(title.equals("En Trend �r�nler T�rkiye'nin Online Al��veri� Sitesi Trendyol'da")) {
			System.out.println("Trendyol Sayfas� A��ld�.");
			
		}
		else {
			System.out.println("Trendyol Sayfas� A��lamad�.");
			driver.close();
		}
		
		return driver;
		
		
	}

}

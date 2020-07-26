package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import data.Data;
import pages.BasketPage;
import pages.DriverPage;
import pages.LoginPage;
import pages.SearchPage;

public class Test {
	
	public static void main(String[] args) {

		Data data=new Data();
		
		WebDriver driver =null;
		
		DriverPage driverPage=new DriverPage();
		driver=driverPage.open(driver, data.browser, data.url);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		loginPage.Login(data.user, data.password);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		SearchPage searchPage=PageFactory.initElements(driver, SearchPage.class);
		searchPage.searchWord(data.SearchObject);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		BasketPage basketPage=PageFactory.initElements(driver, BasketPage.class);
		basketPage.basket(data.number);
		basketPage.basketDelete();

		
	}

}

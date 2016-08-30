package com.google.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchPageObject {
	
	
	private WebDriver driver;
	
	public GoogleSearchPageObject(){
		System.out.println("Inside googleObject");
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	
	public SearchResultPageObject searchOnGoogleWithKeyword(String keyword){
		
		driver.findElement(By.id("lst-ib")).sendKeys(keyword);
		driver.findElement(By.name("btnG")).click();
		
		return new SearchResultPageObject(driver);
				
	}
	

}

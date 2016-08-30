package com.google.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPageObject {
	
	private WebDriver driver;
	
	public SearchResultPageObject(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	public String getFirstLinkText(){
		
		List <WebElement> links = driver.findElements(By.xpath(".//*[@id='rso']/div[1]/div[1]/div/h3/a"));
		
		System.out.println("Size of Link Array "+links.size());
		
		for(WebElement link: links){
			System.out.print("Href Attribute is ----" + link.getAttribute("href"));
			System.out.println("Link is ----"+link.getText());
		}
		
		
		return links.get(0).getText();
	}

}

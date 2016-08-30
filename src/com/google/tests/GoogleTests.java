package com.google.tests;

import org.testng.annotations.Test;

import com.google.pageObject.GoogleSearchPageObject;
import com.google.pageObject.SearchResultPageObject;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class GoogleTests {
	  GoogleSearchPageObject googleSearchPageObject;
	  
	  SearchResultPageObject searchResultObject;
	  
  @BeforeMethod
  public void beforeMethod() {
	  googleSearchPageObject = new GoogleSearchPageObject();
	
	System.out.println("Before Method called !");
	  
  }
  
  
  @Test
  public void GoogleSearch() {
	  String linkText;
	  searchResultObject =  googleSearchPageObject.searchOnGoogleWithKeyword("Google Search");
	  linkText = searchResultObject.getFirstLinkText();
	  System.out.println("--------------------"+linkText+"----------------------------");
	  Assert.assertEquals("Google", linkText);
	  
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	  googleSearchPageObject = null;
  }

}

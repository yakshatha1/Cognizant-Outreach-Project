package com.outreach.testcases;



import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.outreach.Utilities.Screenshot;
import com.outreach.pages.OutreachPage;

public class SearchFilterValidation extends BaseTest {
  @Test
  public void validate() throws InterruptedException, IOException {
	  OutreachPage o =new OutreachPage(driver);
	  o.searchEvents();
	 try {
	  o.printsearchedEvents();
	  Screenshot s= new Screenshot(driver);
      s.screenshot("Test6");}
	 catch(NoSuchElementException e)
	  {
		  System.out.println("No Elements in the specified dates");
		  Screenshot s= new Screenshot(driver);
	      s.screenshot("Test6");
	  }
  }
}

package com.outreach.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.outreach.Utilities.Screenshot;
import com.outreach.pages.OutreachPage;

public class IntrestEvents extends BaseTest  {
  @Test
  public void print_interest() throws InterruptedException, IOException {
	  
	  OutreachPage o =new OutreachPage(driver);
	  o.click_upcoming();
	  try {
	  o.printInterests();
	  Screenshot s= new Screenshot(driver);
      s.screenshot("Test5");}
	 
	  catch(Exception e)
	  { Screenshot s= new Screenshot(driver);
        s.screenshot("Test5");
		  System.out.println("No Elements in the specified dates");
	  }
	  
  }
}

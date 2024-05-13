package com.outreach.testcases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.outreach.Utilities.Screenshot;
import com.outreach.pages.OneCognizant;

public class NavigateToOutReach extends BaseTest {
  @Parameters({"browser"})
  @Test
  public void navigate_outreach(String br) throws InterruptedException, IOException {
	  OneCognizant one= new OneCognizant(driver);
	  one.switchToOneCogniHandle();
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  
	  if(br.equalsIgnoreCase("chrome")) {
			one.clickOnSearchChrome();
			Screenshot s= new Screenshot(driver);
	        s.screenshot("Test3");
			one.searchOutReachChrome("outreach");
			
		}else if(br.equalsIgnoreCase("edge")) {
			one.clickOnSearchEdge();
			one.searchOutreachEdge("outreach");
		}
	  
	  
  }
}

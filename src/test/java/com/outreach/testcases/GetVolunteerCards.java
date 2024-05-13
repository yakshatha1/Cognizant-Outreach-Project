package com.outreach.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.outreach.Utilities.Screenshot;
import com.outreach.pages.VolenteersAroundMe;

public class GetVolunteerCards extends BaseTest {
  @Test
  public void fetch_cards() throws InterruptedException, IOException {
	  VolenteersAroundMe m= new VolenteersAroundMe(driver);
	  m.clickVolunteersAm();
	  Thread.sleep(5000);
	  Screenshot s= new Screenshot(driver);
      s.screenshot("Test9");
	  m.printCards();
	  
	  
	  
  }
}

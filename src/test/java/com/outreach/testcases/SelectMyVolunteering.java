package com.outreach.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.outreach.Utilities.Screenshot;
import com.outreach.pages.OutreachPage;

public class SelectMyVolunteering extends BaseTest {
  @Test
  public void click_vol() throws IOException {
	  OutreachPage o =new OutreachPage(driver);
	  o.clickOnMyVolunteering();
	  Screenshot s= new Screenshot(driver);
      s.screenshot("Test8");
  }
}

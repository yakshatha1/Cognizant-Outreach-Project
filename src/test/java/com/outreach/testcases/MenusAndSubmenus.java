package com.outreach.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.outreach.Utilities.Screenshot;
import com.outreach.pages.OutreachPage;

public class MenusAndSubmenus extends BaseTest {
  @Test(priority=1)
  public void print_menu() {
	  
	  OutreachPage o =new OutreachPage(driver);
	  o.switchFrame();
	  o.printMenues();
  }
  
  @Test(priority=2)
  public void print_submenu() throws InterruptedException, IOException {
	  
	  OutreachPage o =new OutreachPage(driver);
	  o.eventsSubMenue();
	  Screenshot s= new Screenshot(driver);
      s.screenshot("Test4-1");
	  o.moveToSecondSubMenu();
      s.screenshot("Test4-2");
	  o.moveToThirdSubMenu();
      s.screenshot("Test4-3");
	  o.moveToFourthSubMenu();
      s.screenshot("Test4-4");
	  o.moveToFifthSubMenu();
	  
  }
}

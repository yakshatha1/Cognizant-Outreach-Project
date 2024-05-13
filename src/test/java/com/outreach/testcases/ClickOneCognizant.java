package com.outreach.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.testng.annotations.Test;
import com.outreach.Utilities.Screenshot;
import com.outreach.pages.BeCognizant;

public class ClickOneCognizant extends BaseTest {
	
	@Test()
	public void verifyOneCogni() throws InterruptedException, IOException {
		
		
		
		BeCognizant be = new BeCognizant(driver);
		//be.clickAccDetails();
		assertEquals(be.verifyOneCogni(), "OneCognizant");
		Screenshot s= new Screenshot(driver);
        s.screenshot("Test2");
		be.clickOnOneCogni();
		Thread.sleep(5000);
		

	}
}

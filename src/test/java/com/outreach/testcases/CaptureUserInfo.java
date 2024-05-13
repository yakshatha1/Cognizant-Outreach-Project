package com.outreach.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.outreach.Utilities.*;
import com.outreach.pages.BeCognizant;

public class CaptureUserInfo extends BaseTest {

    
	@Test(priority = 1)
	public void getInfo() throws InterruptedException, IOException {
        
		
		BeCognizant be = new BeCognizant(driver);
		be.clickAccDetails();
        Screenshot s= new Screenshot(driver);
        s.screenshot("Test1");
		Assert.assertEquals(be.getAccManagerName(), "Pardhikar, Aditya (Contractor)");
		Assert.assertEquals(be.getAccManagerEmail(), "2327235@cognizant.com");
		System.out.println("User Name: "+be.getAccManagerName());
		System.out.println("User Email: "+be.getAccManagerEmail());
		System.out.println();

	}

}

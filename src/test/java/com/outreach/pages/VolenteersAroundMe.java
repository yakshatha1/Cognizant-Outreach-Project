package com.outreach.pages;
import java.time.Duration;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class VolenteersAroundMe  {
 
	WebDriver driver;
	By VolunteersAm = By.xpath("//*[@id='divvolteer']");
    By Cardss = By.xpath("//div[@class='profilevoltext']");
    public VolenteersAroundMe(WebDriver driver) {
		this.driver = driver;

	}
    
    
    
    public void clickVolunteersAm() throws InterruptedException {
    	Thread.sleep(5000);
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(VolunteersAm));
		
        driver.findElement(VolunteersAm).click();
    }
    public void printCards()
	{   List<WebElement> Cards=driver.findElements(Cardss);
		for(int i=0;i<Cards.size();i++)
	     {
	    	 String s= Cards.get(i).getText();
	    	 System.out.println(s);
	    	 
	     }
	}
}
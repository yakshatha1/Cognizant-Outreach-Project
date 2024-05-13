package com.outreach.pages;
import java.io.IOException;
import java.time.Duration;
import com.outreach.Utilities.*;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class OutreachPage {
	WebDriver driver;
	Actions action;
	By menues = By.xpath("//a[@class='nav-link dropdown-toggle' or @class='nav-link']");
    By submenu = By.xpath("/html/body/div/nav/ul/li[1]/a");
    By firstDropdownbtn = By.xpath("/html/body/div[1]/nav/ul/li[1]/div/a");
	By secondSubmenu = By.xpath("/html/body/div/nav/ul/li[2]/a");
	By thirdSubmenu = By.xpath("/html/body/div/nav/ul/li[3]/a");
	By donate = By.xpath("/html/body/div[1]/nav/ul/li[3]/div");
	By fourthSubmenu = By.xpath("/html/body/div/nav/ul/li[4]/a");
	By explore = By.xpath("/html/body/div[1]/nav/ul/li[4]/div");
	By fifthSubmenu = By.xpath("/html/body/div/nav/ul/li[5]/a");
	By readmore = By.xpath("/html/body/div[1]/nav/ul/li[5]/div");
	By moveFromReadMore = By.xpath("//*[@id=\"viewevents-admin\"]");
	By interests = By.xpath("//div[@class='title_event']");
	By searchbtn = By.xpath("//div[@title='Search']");
	By viewDropDown = By.xpath("//span[@class='vieweventDrop']");
	By BaseLocation = By.xpath("//*[@id='jsonBaseLocation']");
	By EventType = By.xpath("//*[@id='jsonEventType']");
	By WeekType = By.xpath("//*[@id='jsonWeekType']");
	By fromDate = By.xpath("//*[@id='fromDate']");
	By toDate = By.xpath("//*[@id='toDate']");
	By eventsHomeSearchBtn = By.xpath("//*[@id='Viewallsearch']");
	By events = By.xpath("//div[@class='title_event']");
	By myVolunteering = By.xpath("/html/body/div/nav/ul/li[2]/a");
 
	public OutreachPage(WebDriver driver) {
		this.driver = driver;

	}
	
	 public void switchFrame() {
		     driver.switchTo().frame("appFrame");
	        
	    }
	 
	 public void printMenues() 
		{List<WebElement> menus= driver.findElements(menues);
		for(int i=0;i<menus.size();i++)
	     {
	    	 String s= menus.get(i).getText();
	    	 System.out.println(s);
	     }
		}
	 public void eventsSubMenue()  
		{
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait1.until(ExpectedConditions.elementToBeClickable(submenu));
			
		 Actions action=new Actions(driver);
		 WebElement subm=driver.findElement(submenu);
		 action.moveToElement(subm).build().perform();
		 
		 WebElement first=driver.findElement(firstDropdownbtn);
		 String firstDropdown =(first).getText();
		 System.out.println(firstDropdown);
		 
		}
	 
	 public void click_upcoming()
	 {
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait1.until(ExpectedConditions.elementToBeClickable(submenu));
			
		 Actions action=new Actions(driver);
		 WebElement subm=driver.findElement(submenu);
		 action.moveToElement(subm).build().perform();
		 
		driver.findElement(firstDropdownbtn).click();
		
		 
	 }

	 public void moveToSecondSubMenu() throws InterruptedException 
		{
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait1.until(ExpectedConditions.elementToBeClickable(secondSubmenu));   
		 
		 action=new Actions(driver);
		    WebElement subm=driver.findElement(secondSubmenu);
			action.moveToElement(subm).perform();
		 
		}
		public void moveToThirdSubMenu() throws InterruptedException 
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			 wait1.until(ExpectedConditions.elementToBeClickable(thirdSubmenu));  
			
			  action=new Actions(driver);
			    WebElement subm=driver.findElement(thirdSubmenu);
				action.moveToElement(subm).perform();
				
				List<WebElement> subme=driver.findElements(donate);
				for(int i=0 ;i<subme.size(); i++)
				{
				     System.out.println(subme.get(i).getText());
				}	
			
		}
		public void moveToFourthSubMenu() throws InterruptedException 
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			 wait1.until(ExpectedConditions.elementToBeClickable(fourthSubmenu));  
			action=new Actions(driver);
		    WebElement subm=driver.findElement(fourthSubmenu);
			action.moveToElement(subm).perform();
			
			List<WebElement> subme=driver.findElements(explore);
			for(int i=0 ;i<subme.size(); i++)
			{
			     System.out.println(subme.get(i).getText());
			}	
		}
		public void moveToFifthSubMenu() throws InterruptedException 
		{   WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait1.until(ExpectedConditions.elementToBeClickable(fifthSubmenu));  
			action=new Actions(driver);
		    WebElement subm=driver.findElement(fifthSubmenu);
			action.moveToElement(subm).perform();
			List<WebElement> subme=driver.findElements(readmore);
			for(int i=0 ;i<subme.size(); i++)
			{
			     System.out.println(subme.get(i).getText());
			}	
		}
		public void printInterests() throws InterruptedException 
		{  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait1.until(ExpectedConditions.elementToBeClickable(moveFromReadMore));  
		action=new Actions(driver);
	    WebElement subm=driver.findElement(moveFromReadMore);
		action.moveToElement(subm).perform();
		
		List<WebElement> subme=driver.findElements(interests);
		for(int i=0 ;i<subme.size(); i++)
		{
		     System.out.println(subme.get(i).getAttribute("title"));
		}	
		System.out.println("Search Results:");
		
			
		}
		public void searchEvents() throws InterruptedException, IOException 
		{
			action=new Actions(driver);
			WebElement s=driver.findElement(searchbtn);
			action.moveToElement(s).perform();
			Excel_data da=new Excel_data();
			String[] datas=da.excel_read();
			
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait1.until(ExpectedConditions.elementToBeClickable(viewDropDown)); 
		    
			WebElement dd=driver.findElement(viewDropDown);
			dd.click();
			Thread.sleep(7000);
			WebElement loc=driver.findElement(BaseLocation);
			Select selectingLocation = new Select(loc);
			selectingLocation.selectByVisibleText(datas[0]);
			
			WebElement et=driver.findElement(EventType);
			Select selectingEventType = new Select(et);
			selectingEventType.selectByVisibleText(datas[1]);
			WebElement wt=driver.findElement(WeekType);
			Select selectingWeekType = new Select(wt);
			selectingWeekType.selectByVisibleText(datas[2]);
			
			WebElement from=driver.findElement(fromDate);
			from.sendKeys(datas[3]);
			WebElement to=driver.findElement(toDate);
		    to.sendKeys(datas[4]);
		    
		    Thread.sleep(5000);
		    action=new Actions(driver);
			driver.findElement(searchbtn).click();
		    
		    Screenshot sd= new Screenshot(driver);
	        sd.screenshot("Test6_1");
		    WebElement ehs=driver.findElement(eventsHomeSearchBtn);
			(ehs).click();
			
			
			
			
		}
		
		public void random_location() throws IOException, InterruptedException
		{
			action=new Actions(driver);
			WebElement s=driver.findElement(searchbtn);
			action.moveToElement(s).perform();
			Excel_data da=new Excel_data();
			String[] datas=da.excel_read();
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait1.until(ExpectedConditions.elementToBeClickable(viewDropDown)); 
			WebElement dd=driver.findElement(viewDropDown);
			dd.click();
			Thread.sleep(7000);
			WebElement loc=driver.findElement(BaseLocation);
			Select selectingLocation = new Select(loc);
			
			WebElement from=driver.findElement(fromDate);
			from.sendKeys(datas[3]);
			Thread.sleep(5000);
			WebElement to=driver.findElement(toDate);
		    to.sendKeys(datas[4]);
		    Thread.sleep(5000);
		    action=new Actions(driver);
			driver.findElement(searchbtn).click();
			
			List <WebElement> elementCount = selectingLocation.getOptions();
			Random rand = new Random();
	       String ran_loc=elementCount.get(rand.nextInt(elementCount.size())).getText();
			
			selectingLocation.selectByVisibleText(ran_loc);
		    Screenshot sd= new Screenshot(driver);
	        sd.screenshot("Test7_1");
		    WebElement ehs=driver.findElement(eventsHomeSearchBtn);
			(ehs).click();
			
			
			
			
			
		}
		public void printsearchedEvents() throws InterruptedException 
		{   Thread.sleep(5000);
			List<WebElement> subme=driver.findElements(events);
			for(int i=0 ;i<subme.size(); i++)
			{   
			     String r=subme.get(i).getText();
			     if(r.length()>2)
			     {
			    	 System.out.println(r);
			     }
			}	
			
		}
		public void clickOnMyVolunteering() 
		{
	        driver.findElement(myVolunteering).click();
	        System.out.println("Test requirement: My Volunteering button is clicked");
	        
 
		}
 
 
}
package com.outreach.pages;
import com.outreach.Utilities.*;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OneCognizant {
	public WebDriver driver;
	public static String beHandle, oneCogniHandle;

	public OneCognizant(WebDriver driver) {
		this.driver = driver;
	}

	By inpSearch = By.id("oneC_searchAutoComplete"); // chrome
	By searcBtn = By.className("searchTopBar"); // edge
	By inputSearch = By.id("oneCSearchTop"); // edge
	By btnSearch = By.xpath("//li[@class = 'oneC_searchbar']/div");
	By btnOutreach = By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div[1]/div[6]/div/div/div[1]/div[2]/div/div/div/div[2]");
	By txtTruTime = By.linkText("My TruTime");

	public void switchToOneCogniHandle() {
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			driver.switchTo().window(handle);
			if (driver.getTitle().equals("OneCognizant")) {
				System.out.println("Successfully Switches into 1C Page \n");
				break;
			} else {
				continue;
			}

		}
	}

	public void clickOnSearchChrome() {
		driver.findElement(inpSearch).click();
	}

	public void clickOnSearchEdge() {
		driver.findElement(searcBtn).click();
	}

	public void searchOutReachChrome(String txt) throws InterruptedException, IOException {
		driver.findElement(inpSearch).sendKeys(txt);
		Thread.sleep(5000);
		Screenshot s= new Screenshot(driver);
        s.screenshot("Test3_1");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(btnOutreach));
		driver.findElement(btnOutreach).click();
		Thread.sleep(5000);

	}

	public void searchOutreachEdge(String txt) throws InterruptedException, IOException {
		driver.findElement(inputSearch).sendKeys(txt);
		Thread.sleep(5000);
		Screenshot s= new Screenshot(driver);
        s.screenshot("Test3_1");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(btnOutreach));
		driver.findElement(btnOutreach).click();
		Thread.sleep(5000);

	}


}

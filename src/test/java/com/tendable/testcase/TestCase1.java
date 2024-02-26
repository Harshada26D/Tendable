package com.tendable.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.tendable.pageobject.marketingpageobject;
import com.tendable.pageobject.pageobject1;

public class TestCase1 extends BaseClass {
	@Test(priority=0)
	public void Test1() throws InterruptedException
	{
		driver.get(baseURL);
		
		pageobject1 po1= new pageobject1(driver);
		
		Actions act = new Actions(driver);
	
		po1.ourstory();
		po1.oursolution();
		po1.whytendable();
		po1.reqDemo();
		po1.contactUs();
		po1.mrktcont();
		
		marketingpageobject mpo= new marketingpageobject(driver);
		
		mpo.fullname(fullname);
		mpo.Orgname(orgname);
		mpo.phoneno();
		mpo.mailId(Email);
		

		JavascriptExecutor js = (JavascriptExecutor)driver;
	   	js.executeScript("window.scrollBy(0,550)","");
		
		mpo.JobRole();
		//Thread.sleep(2000);
		mpo.agreebtn();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/div[1]/form[1]/div[9]/div[1]/label[2]/input[1]"))).click();
		
		mpo.SubmitBtn();
		//mpo.ErrorMsg();
		
		Thread.sleep(1000);
		


	}	
}

package com.tendable.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tendable.testcase.BaseClass;

public class pageobject1 extends BaseClass {
	WebDriver ldriver;
	public pageobject1(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[text()='Our Story']")
	WebElement OurStory;
	
	@FindBy(xpath="//a[text()='Our Solution']")
	WebElement OurSolution;
	
	@FindBy(xpath="//a[text()='Why Tendable?']")
	WebElement WhyTendable;
	
	@FindBy(xpath="//a[@class='button']")
	WebElement RequestADemo;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	WebElement contactUs;
	
	@FindBy(xpath="(//button[@class=\"body-button bg-plain-600 toggle-control\"])[1]")
	WebElement marketingContact;
	
	Actions act = new Actions(driver);

	public void ourstory() 
	{
		//Actions act = new Actions(driver);
		act.moveToElement(OurStory).perform();
		OurStory.isDisplayed();
    }
	
	public void oursolution() 
	{
	act.moveToElement(OurSolution).perform();
	OurSolution.isDisplayed();
    }
	
	public void whytendable()
	{
		act.moveToElement(WhyTendable).perform();
		WhyTendable.isDisplayed();
	}
	
	public void reqDemo()
	{
		RequestADemo.isEnabled();
	}

	public void contactUs()
	{
		contactUs.click();
	}
	
	public void mrktcont() {
		marketingContact.click();
	}
}

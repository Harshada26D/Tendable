package com.tendable.pageobject;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tendable.testcase.BaseClass;

public class marketingpageobject extends BaseClass {
	WebDriver ldriver;
	public marketingpageobject(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="(//input[@id=\"form-input-fullName\"])[1]")
	WebElement Fullname;
	
	@FindBy(xpath="(//input[@id=\"form-input-organisationName\"])[1]")
	WebElement orgName;
	
	@FindBy(xpath="(//input[@id=\"form-input-cellPhone\"])[1]")
	WebElement phnNo;
	
	@FindBy(xpath="(//input[@id=\"form-input-email\"])[1]")
	WebElement email;
	
	@FindBy(xpath="(//option[text()='Job Role'])[1]")
	WebElement jobRole;

	@FindBy(css="#form-input-consentAgreed-0")
	WebElement radiobtn;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement submitBtn;
	
	@FindBy(xpath="//div[@class=\"ff-form-errors\"]")
	WebElement errormsg;

	public void fullname(String fullname) 
	{
		Fullname.sendKeys(fullname);
	}
	
	public void Orgname(String orgname) 
	{
		orgName.sendKeys(orgname);
	}
	
	public void phoneno()
	{
		phnNo.sendKeys("1234567890");
		
	}
	public void mailId(String Email) {
		email.sendKeys(Email);
	}
	
	public void JobRole() {
		jobRole.click();
	}
	
	public void agreebtn(){
		radiobtn.isSelected();
		//radiobtn.click();
		//radiobtn.isEnabled();
	}
	
	public void SubmitBtn() {
		submitBtn.click();
	}
	
	public void ErrorMsg() {
		errormsg.isDisplayed();
		}
}


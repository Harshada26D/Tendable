package com.tendable.testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.tendable.utilities.ReadConfig;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	public String baseURL="https://www.tendable.com";
	public String fullname= "Harshada Dhanwate";
	public String orgname="Tendable";
	public String Email="abcd@gmail.com";
	public static WebDriver driver;

	@BeforeClass
	public void setup() 
	{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
	   //WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
}

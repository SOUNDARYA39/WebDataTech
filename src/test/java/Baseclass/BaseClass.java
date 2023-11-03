package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomclass.loginpage;

import webdata.Beforesuite;

public class BaseClass {


	WebDriver driver;
@Beforesuite()
public void beforesuite()
{
	System.out.println("database");
}

@BeforeTest()
public void beforetest()
{
	System.out.println("parallel");
}

@BeforeClass()
public void beforeclass()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://139.84.162.246:8080/");
	
	
}

@BeforeMethod()
public void beforemethod()
{
	
	loginpage lp = new loginpage(driver);
	lp.loginpageact();
}

@AfterMethod()
public void aftermethod()
{
	
}

@AfterClass()
public void afterclass()
{
	
}

@AfterTest()
public void aftertest()
{
	
}

@AfterSuite()
public void aftersuite()
{
	
}
}

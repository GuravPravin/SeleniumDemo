package com.accenture.tests;

import org.testng.annotations.Test;

import com.accenture.pages.HomePage;
import com.accenture.pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class LoginTest {
	WebDriver d;
	HomePage h;
	LoginPage l;
	
  @Test
  public void TestLogin() {
	  
	  d.get("http://demowebshop.tricentis.com/");
	  d.manage().window().maximize();
	  h.clickLogin();
	  l.enterLoginData("abc","xyz");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\drivers1\\chromedriver.exe");
		d = new ChromeDriver();
		h = PageFactory.initElements(d, HomePage.class);
		l= PageFactory.initElements(d, LoginPage.class);
	  
  }

}

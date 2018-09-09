package com.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver d;
	@FindBy(id="Email")
	static WebElement UserName_Textbox;
	
	@FindBy(id="Password")
	static WebElement Password_Textbox;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	static WebElement Login_Button;
	
	public void enterLoginData(String u, String p) {
		UserName_Textbox.sendKeys(u);
		Password_Textbox.sendKeys(p);
		Login_Button.click();
		
	}

}

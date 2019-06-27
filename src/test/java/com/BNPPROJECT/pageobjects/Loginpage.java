package com.BNPPROJECT.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	WebDriver ldriver;
	
	public Loginpage(WebDriver rdriver)
	{
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name ="loginForm:userName")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name ="loginForm:password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name ="loginForm:submit")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(xpath ="//*[@id=\"alreadyLoginForm:j_id20\"]")
	@CacheLookup
	WebElement popup;
	
	@FindBy(xpath ="//*[@id=\"logoutHeaderForm:logoutwhennomenu\"]")
	@CacheLookup
	WebElement logout;
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	
	public void setPassword(String Pwd)
	{
		txtPassword.sendKeys(Pwd);
	}
	
	
	public void Clickbtn()
	{
		btnlogin.click();
	}
	
	public void loginpop()
	{		popup.click();}
		
		
		public void logout1()
		{ logout.click();   }
	


	
}


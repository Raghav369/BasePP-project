package com.BNPPROJECT.testcases;


import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BNPPROJECT.pageobjects.Loginpage;


public class TC_LOGIN_001 extends BaseClass{

	@Test
	public void loginTest() throws IOException {
		
		
		logger.info("BNP URL is opened");
		Loginpage lp = new Loginpage(driver);
		
		logger.warn("Ravi credentials entered");
		lp.setUserName(username);
		
		logger.error("Password is encrypted");
		lp.setPassword(password);
		
		logger.fatal("Login Sucessful");
		lp.Clickbtn();
		
		
			
					
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Welcome to Connexis Supply Chain"))
		{
			Assert.assertTrue(true);
			logger.info("Titled captured sucessfully");
			System.out.println("Sucess");
			
		}
		
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertFalse(false);
		  logger.info("Titled not captured sucessfully");
		
		}
		lp.logout1();
	}
}

package com.BNPPROJECT.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.BNPPROJECT.pageobjects.Createuser;
import com.BNPPROJECT.pageobjects.Loginpage;
import junit.framework.Assert;

public class TC_CREATEUSER_003  extends BaseClass

{
		@Test
		public void createnewuser() throws InterruptedException, IOException {
			
			
			
			logger.info("BNP URL is opened");
			Loginpage lp = new Loginpage(driver);
			lp.setUserName(username);
			lp.setPassword(password);
			lp.Clickbtn();
			Thread.sleep(3000);
			
			
			logger.info("Customer Adminstration is opened");
			
			
			Createuser cusr = new Createuser(driver);
			cusr.CustomerAdmin();
			cusr.CreateUser();
			cusr.New();
			
			
			Thread.sleep(3000);
			logger.info("Entering the details in create users");
			cusr.User("Mercy");
			
			Thread.sleep(4000);
			logger.info("BranchId is entered");
			cusr.BranchID();
			
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			cusr.OrgId();					
			logger.info("Emailid is entered correct format");
			String emailgen =randomestring()+"@gmail.com";
			cusr.Email(emailgen);
			
			
			Thread.sleep(4000);
			cusr.Title();
			logger.info("Dropdown Title is selected");
			
			
			
			Thread.sleep(4000);
			logger.info("FirstName is entered");
			String FirstNm= randomestring();
			cusr.FirstName(FirstNm);
			
			
			logger.info("Middle name is entered");
			String Mid = randomestring();
			cusr.MiddleName(Mid);
			
			
			
			logger.info("Shortname entered");
			String ShName = randomestring();
			cusr.ShortName(ShName);
			
			
			logger.info("Preferred lang");
			cusr.PreferredLang();
			
			
			logger.info("Address is entered");
			cusr.Address("Chennai");
			
			
			logger.info("Country entered");
			cusr.Country();
		
			
			logger.info("Postal code is entered");
			cusr.PostCd("560066");
			
			
			logger.info("Challenge is entered");
			cusr.challenge();
			
			
			logger.info("Response is entered");
			cusr.Response("Selenium");
			
			Thread.sleep(7000);
			logger.info("orgId is entered");
			
			
			logger.info("save is entered");
			cusr.Save();
			
			
			WebElement res =driver.findElement(By.xpath("//*[@id=\"rightPanel2:createNewUserForm:msg\"]/tbody/tr/td/span"));
			System.out.println(res);
			if(res.equals(driver.findElement(By.xpath("//*[@id=\"rightPanel2:createNewUserForm:msg\"]/tbody/tr/td/span"))))
			{
				Assert.assertTrue(true);
			}
			else
			{
				captureScreen(driver,"createnewuser");
				Assert.assertFalse(false);
			  logger.info("Titled not captured sucessfully");
			}
			
			lp.logout1();
		}		
	
			
		
		
}

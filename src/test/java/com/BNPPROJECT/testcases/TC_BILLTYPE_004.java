package com.BNPPROJECT.testcases;

import org.testng.annotations.Test;

import com.BNPPROJECT.pageobjects.Bill;
import com.BNPPROJECT.pageobjects.Createuser;
import com.BNPPROJECT.pageobjects.Loginpage;

public class TC_BILLTYPE_004 extends BaseClass {
	
	@Test
	public void Billtype() throws InterruptedException 
	{
	logger.info("BNP URL is opened");
	Loginpage lp = new Loginpage(driver);
	lp.setUserName(username);
	lp.setPassword(password);
	lp.Clickbtn();
	
	Thread.sleep(3000);
	logger.info("Customer Adminstration is opened");
	
	
	Createuser cusr = new Createuser(driver);
	cusr.CustomerAdmin();
	
	Bill bill = new Bill(driver);
	logger.info("Clcik on Billtype");
	bill.Billtype();
	
	logger.info("Clcik on New Bill link");
	bill.billnew();
	Thread.sleep(4000);
	
	logger.info("Enter the Customer org ID");
	bill.CustomerOrgID("JPHUAWEN-HUAWEN Mobiles");
		
	logger.info("Enter the txt in billtype");
	String billtype = randomestring();
	bill.Billtxt(billtype);
	
	logger.info("Enter the shortname");
	String sn = randomestring();
	bill.shortName(sn);
	
	logger.info("Enter the Name");
	String abc = randomestring();
	bill.NameBill(abc);
	
	logger.info("Save the bill");
	bill.savebill();
	
	lp.logout1();
	
}
	}

package com.BNPPROJECT.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Bill                                                                                                                                               {

WebDriver ldriver;
	


	public  Bill(WebDriver rdriver)
	{	

	ldriver =rdriver;
	PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how =How.XPATH, using= "//*[@id=\"iconcustomerAdministrationform:billtype\"]")
	@CacheLookup
	WebElement lnkBilltype;
	
	@FindBy(how = How.XPATH, using= "//input[@tabindex =\"11\" and @value =\"New\"]")
	@CacheLookup
	WebElement lnkNew;
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"rightPanel2:linkOrgDiscForm:custOrgId\"]")
	@CacheLookup
	WebElement txtCustOrgID;
	
	@FindBy(how= How.XPATH, using="//*[@id=\"rightPanel2:linkOrgDiscForm:Shortname12\"]")
	@CacheLookup
	WebElement txtBillType;
	
	@FindBy(how= How.XPATH, using="//*[@id=\"rightPanel2:linkOrgDiscForm:Shortname\"]")
	@CacheLookup
	WebElement txtshrnme;
	
	@FindBy(how= How.XPATH, using="//*[@id=\"rightPanel2:linkOrgDiscForm:NameoftheBilltype\"]")
	@CacheLookup
	WebElement txtnme;
	
	@FindBy(how= How.XPATH, using="//*[@id=\"rightPanel2:linkOrgDiscForm:saveBtn\"]")
	@CacheLookup
	WebElement lnksave;
	
	

	public void Billtype() 
		{		lnkBilltype.click(); }
	
	public void billnew()
	{lnkNew.click();}
	
	public void CustomerOrgID(String txt) {
		txtCustOrgID.sendKeys(txt);
		txtCustOrgID.sendKeys(Keys.TAB);
		}
		
		public void Billtxt(String txtbil)
		{txtBillType.sendKeys(txtbil);}
		
		public void shortName(String SNaMe)
		{ txtshrnme.sendKeys(SNaMe); 	}
	
	public void NameBill(String BillName)
	
	{ txtnme.sendKeys(BillName); 	}
	
	public void savebill()
	{ lnksave.click(); }

	
}	

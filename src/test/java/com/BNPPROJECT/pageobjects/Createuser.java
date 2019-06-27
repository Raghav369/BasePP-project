package com.BNPPROJECT.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Createuser {
	WebDriver ldriver;
	
	public Createuser(WebDriver rdriver)
	{	

	ldriver =rdriver;
	PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how =How.XPATH, using= "//td[text() ='Customer Administration' ]")
	@CacheLookup
	WebElement lnkCustomerAdminstration;
	
	
	@FindBy(how = How.XPATH, using ="//td[@id ='iconcustomerAdministrationform:createuser'"
			+ "and @class='rich-pmenu-group-self-label rich-pmenu-item-label']")
	@CacheLookup
	WebElement lnkCreaterUser;
	
	@FindBy(how = How.XPATH, using = "//input[@class ='bnpButtons' and @value= 'New' and @type='button' and @id='rightPanel2:searchUserForm:j_id1087']") 
	@CacheLookup
	WebElement lnknew;
	
	
	@FindBy(how =How.XPATH, using = "//input[@class='inputText' and @type= 'text' and @tabindex='1' ]")
	@CacheLookup
	WebElement txtUserId ;
	
	
	@FindBy(how =How.XPATH, using = "//select[@tabindex ='2']//option[contains(., 'JP3000001-BNPP Tokyo')]")
	@CacheLookup
	WebElement DrpdwnBranchID;
	
	@FindBy(how =How.XPATH, using = "//select[@tabindex ='3' ]//option[contains(@value,\"JPHUAWEN\")]")
	@CacheLookup
	WebElement DrpdwnOrgID;
	
	@FindBy(how = How.XPATH, using = "//input[@tabindex ='4']")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how = How.XPATH, using ="//select[@tabindex ='5' ]//option[contains(@value,\"Mrs\")]")
	@CacheLookup
	WebElement DrpdownTitile;
	
	@FindBy(how= How.XPATH , using ="//input[@tabindex ='6']")
	@CacheLookup
	WebElement txtFName;
	
	@FindBy(how = How.XPATH,using = "//input[@tabindex ='8']")
	@CacheLookup
	WebElement txtLName;
	
	@FindBy(how = How.XPATH, using = "//input[@tabindex ='9']")
	@CacheLookup
	WebElement txtSName;
	
	@FindBy(how = How.XPATH, using = "//select[@tabindex ='10' ]//option[contains(., \"English\")]")
	@CacheLookup
	WebElement DrpdwnPrefLang;
	
	@FindBy(how = How.XPATH, using = "//input[@tabindex ='11']")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(how = How.XPATH, using = "//select[@tabindex ='16' ]//option[contains(., \"JAPAN\")]")
	@CacheLookup
	WebElement txtCountry;
	
	@FindBy(how = How.XPATH, using = "//input[@tabindex ='17']")
	@CacheLookup
	WebElement txtPostcd;
	
	@FindBy(how = How.XPATH, using ="//select[@tabindex ='31' ]//option[contains(., \"What is your favorite book?\")]")
	@CacheLookup
	WebElement Drpdwnchallenge;
	
	@FindBy(how = How.XPATH, using ="//input[@tabindex ='32' and @type= 'text']")
	@CacheLookup
	WebElement txtResp;
	
	@FindBy(how = How.XPATH, using = "//input[@tabindex ='33' and @type= 'button']")
	@CacheLookup
	WebElement ClickSave;
	
	
	public void CustomerAdmin() 
		{		lnkCustomerAdminstration.click(); }
	
	public void CreateUser()
		{       lnkCreaterUser.click(); 		  }
	
	public void New()
	    { 			lnknew.click();               }
	
	public void User(String UserId)
	
		{ txtUserId.sendKeys(UserId); 			  }
	
	public void BranchID()
		{ DrpdwnBranchID.click(); 				  }
	
	public void OrgId()
	
		{ DrpdwnOrgID.click();					  }
	
	public void Title()
		{  DrpdownTitile.click();				}
	
	public void Email(String mail)
		{ txtEmail.sendKeys(mail);				  }
	
	public void FirstName(String Fname)
		{txtFName.sendKeys(Fname);				 }
	
	public void MiddleName(String Mname)
		{ txtLName.sendKeys(Mname) ;			}
	
	public void ShortName(String Sname)
		{txtSName.sendKeys(Sname);				}
	
	public void PreferredLang()
		{DrpdwnPrefLang.click();      			 }
	
	public void Address(String Addr)
		{txtAddress.clear();
		txtAddress.sendKeys(Addr); 			}
	
	public void Country()
		{txtCountry.click();	 }
	
	public void PostCd(String Pscd)
		{ txtPostcd.clear(); 
		txtPostcd.sendKeys(Pscd); }
				
	public void challenge()
		{Drpdwnchallenge.click();				}
	
	public void Response(String Res)
		{txtResp.sendKeys(Res);						}
	
	public void Save()
		{ClickSave.click();						}
}

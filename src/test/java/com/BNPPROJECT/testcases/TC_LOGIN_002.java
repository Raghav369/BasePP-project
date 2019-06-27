package com.BNPPROJECT.testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BNPPROJECT.pageobjects.Loginpage;
import com.BNPPROJECT.utilities.XLUtils;
import com.sun.media.jfxmedia.logging.Logger;

public class TC_LOGIN_002 extends BaseClass{
	
	
	@Test(dataProvider ="LoginData")
	public void LoginDDT(String user, String pwd) {
		
		Loginpage lp1 = new Loginpage(driver);
		lp1.setUserName(user);
		logger.info("User Name Entered");
		lp1.setPassword(pwd);
		logger.info("Password entered");
		lp1.Clickbtn();
		logger.warn("Click login button sucessfully");
		
	
	if(isAlertPresent() == true)
	{
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		Assert.assertTrue(false);
		lp1.loginpop();
		logger.warn("User is already login");
		}
	else
	{
		Assert.assertTrue(true);
		logger.fatal("Login Sucessful");
		//driver.switchTo().defaultContent();
	}

}

public boolean isAlertPresent() {
	
	try {
		
		driver.switchTo().alert();
		return true;
	} catch (NoAlertPresentException e)
	{
		return false;
	}
	
	
}
@DataProvider(name="LoginData")
String[][] getData() throws IOException
{

String path = System.getProperty("user.dir")+"/src/test/java/com/BNPPROJECT/testdata/Input.xlsx";
int rownum = XLUtils.getRowCount(path,"Sheet1");
int colcount = XLUtils.getCellCount(path,"Sheet1",1);

String logindata [] [] = new String[rownum][colcount];

for(int i=1;i<=rownum;i++)
{
  for(int j=0;j<colcount;j++)
  
  {
    logindata[i-1][j] = XLUtils.getCellData(path,"sheet1",i,j);
	}
	}
	return logindata;
	}
}
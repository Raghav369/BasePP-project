package com.BNPPROJECT.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	
	public Readconfig()
	{
		
		File src = new File("./Configuration/config.properties");
		
		try {
			
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
			
		} catch (Exception e)
		{
			System.out.println("Exception is " + e.getMessage());
		}
	}

		public String getApplicationURL() {
			
			String URL = pro.getProperty("baseURL");			
			return URL;			
		}
	
		public String getUserName() {
			
			String UserName = pro.getProperty("username");
			return UserName;
		}
	
		public String getPassword() {
			
			String Password =pro.getProperty("password");
			return Password;
		}
		
		public String GetChromepath() {
			
			String chrompath = pro.getProperty("chromepath");
			return chrompath;
		}
		
public String GetFirefoxpath() {
			
			String Firepath = pro.getProperty("firefoxpath");
			return Firepath;
		}
public String GetIEpath() {
	
	String iepath = pro.getProperty("iepath");
	return iepath;
}


}


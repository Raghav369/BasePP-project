package com.BNPPROJECT.testcases;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class AutomateBarCode  {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException, NotFoundException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rrgaddam\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		 driver = new FirefoxDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	
	String barcodeUrl = driver.findElement(By.xpath("//*[@id=\"HTML12\"]/div[1]/img[1]")).getAttribute("src");
	
	URL url = new URL(barcodeUrl);
	BufferedImage bufferedimage = ImageIO.read(url);
	LuminanceSource luminancesource = new BufferedImageLuminanceSource(bufferedimage);
	BinaryBitmap binaybitmap = new BinaryBitmap(new HybridBinarizer (luminancesource));
	
	Result result = new MultiFormatReader().decode(binaybitmap);
	
	System.out.println(result.getText());
	
	}
	

}

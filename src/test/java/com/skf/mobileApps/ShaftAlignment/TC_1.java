package com.skf.mobileApps.ShaftAlignment;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC_1 extends Base_Capabilities{
	
	
	
	@Test
	public void HomePage_Validation() throws InterruptedException, IOException
	{
	
	startServer(); //To start the appium server automatically by calling the method from Base_Capabilities class.
	AndroidDriver<AndroidElement> driver= cap("ShaftAlignmentApp");
	
	HomePage Home =new HomePage(driver);
	System.out.println(Home.MachineLibraryButton.isDisplayed());
	System.out.println(Home.SelectButton.isDisplayed());
	Home.SelectButton.click();
	System.out.println(Home.CancelButton.isDisplayed());
	Home.SelectReport.click();
	System.out.println(Home.SelectReportTitle.isDisplayed());
	System.out.println(Home.SelectReportTitle.getText());
	Assert.assertEquals("Select Reports", Home.SelectReportTitle.getText());
	Thread.sleep(5000);
	}
	
	@Test
	public void HomePageIcon_Validation() throws InterruptedException, IOException
	{
		AndroidDriver<AndroidElement> driver= cap("ShaftAlignmentApp");
		
		HomePage Home =new HomePage(driver);
		Home.SettingsButton.isEnabled();
		Home.SettingsButton.isDisplayed();
		Home.HelpButton.isEnabled();
		Home.HelpButton.isDisplayed();
		Home.NewsButton.isDisplayed();
		Home.NewsButton.isEnabled();
		Thread.sleep(5000);
		service.stop(); //Stop the appium server
		
		
}
	
}


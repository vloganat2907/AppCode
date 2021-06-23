
package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage{

public HomePage(AppiumDriver<AndroidElement> driver) 
{
	// TODO Auto-generated constructor stub
	
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

//FindElements for Homebuttons

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.RelativeLayout[1]")
public WebElement SettingsButton;	

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.RelativeLayout[2]")
public WebElement MachineLibraryButton;

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.RelativeLayout[3]")
public WebElement HelpButton;

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.RelativeLayout[4]")
public WebElement NewsButton;

//Page Title Id : com.skf.shaftalignment:id/title
@AndroidFindBy(xpath=".//*[contains(@text, 'Shaft Alignment - Horizontal')][1]")
public WebElement HomePageTitle;

@AndroidFindBy(id="com.skf.shaftalignment:id/right_action") 
public WebElement SelectButton;

@AndroidFindBy(xpath="com.skf.shaftalignment:id/title")
public WebElement ReportTitle;

@AndroidFindBy(id="com.skf.shaftalignment:id/right_action")
public WebElement CancelButton;

@AndroidFindBy(xpath=".//*[contains(@text, 'Select Reports')][1]")
public WebElement SelectReportTitle;


//*** Report Section ***
@AndroidFindBy(id="com.skf.shaftalignment:id/selectedFrame")
public WebElement SelectReport;

@AndroidFindBy(id="com.skf.shaftalignment:id/name")
public WebElement ReportName;

@AndroidFindBy(id="com.skf.shaftalignment:id/date_and_time")
public WebElement ReportDate_Time;





}
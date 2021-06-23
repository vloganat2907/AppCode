package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HardwarePage {
	
	public HardwarePage(AppiumDriver<AndroidElement> driver) 
	{
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//***Hardware Page Title "Shaft Alignment"
	@AndroidFindBy(xpath=".//*[contains(@text, 'Shaft Alignment')][1]")
	public WebElement HardwarePageTitle;
	
	@AndroidFindBy(id="android:id/content")
	public WebElement HardwarePageContent;
	
	@AndroidFindBy(id="com.skf.shaftalignment:id/fragment_title")
	public WebElement HardwareBoxTitle;
	@AndroidFindBy(id="com.skf.shaftalignment:id/fragment_up")
	public WebElement HardwareCancelButton;
	@AndroidFindBy(id="com.skf.shaftalignment:id/fragment_progress")
	public WebElement HardwareProgress;
	
	//***Hardware Tile Name Details****
	
	@AndroidFindBy(id="com.skf.shaftalignment:id/header")
	public WebElement HardwareHeader;
	@AndroidFindBy(id="com.skf.shaftalignment:id/header_stationary")
	public WebElement Stationary;
	@AndroidFindBy(id="com.skf.shaftalignment:id/header_movable")
	public WebElement Movable;
	
	
	//***Hardware Contents***
	
	@AndroidFindBy(id="com.skf.shaftalignment:id/content_view")
	public WebElement HardwareContent;
	@AndroidFindBy(id="com.skf.shaftalignment:id/list_stationary")
	public WebElement Stationary_Name;
	@AndroidFindBy(id="com.skf.shaftalignment:id/list_movable")
	public WebElement Movable_Name;
	
	
	//***Hardware Button Layout***
		
	@AndroidFindBy(id="com.skf.shaftalignment:id/button_layout")
	public WebElement ButtonLayout;
	@AndroidFindBy(id="com.skf.shaftalignment:id/demo_mode_button")
	public WebElement DemoModeButton;
	@AndroidFindBy(id="com.skf.shaftalignment:id/proceed_button")
	public WebElement Done_Button;
	


}

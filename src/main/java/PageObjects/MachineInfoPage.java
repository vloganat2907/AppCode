package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MachineInfoPage {
	
	
public MachineInfoPage (AppiumDriver<AndroidElement> driver)

	
	{
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

//Machine Information Page Container which contains fields.

@AndroidFindBy(id="com.skf.shaftalignment:id/container")
public WebElement machineInfoContainer;
@AndroidFindBy(id="com.skf.shaftalignment:id/machine_info_fragment")
public WebElement machineInfoFragment;
@AndroidFindBy(id="com.skf.shaftalignment:id/fragment_toolbar")
public WebElement machineInfoToolbar;
@AndroidFindBy(id="com.skf.shaftalignment:id/fragment_title")
public WebElement machineInfoTitle;
@AndroidFindBy(id="com.skf.shaftalignment:id/fragment_up")
public WebElement machineDoneButton;
@AndroidFindBy(id="com.skf.shaftalignment:id/fragment_next")
public WebElement qrCodeScan;


//MachineId card container
@AndroidFindBy(id="com.skf.shaftalignment:id/target_values_row")
public WebElement machineIdRow;



}

package com.skf.mobileApps.ShaftAlignment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Random;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.JsonException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Verify;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

	
public class Base_Capabilities {
	
	
/*Below startServer method is to start the Appium server automatically by adding the AppiumDriverLocalService */	
	public static AppiumDriverLocalService service;
	
	public AppiumDriverLocalService startServer()
	{
		boolean flag= checkIfServerIsRunning(4723);
		if(!flag) {
		
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		}
		return service;
	}
		
	public static boolean checkIfServerIsRunning( int port)
	{

		boolean isServerRunning= false;
		ServerSocket serverSocket;
        try
        {
            serverSocket = new ServerSocket(port);
            System.out.println("Connected");
            serverSocket.close(); 
        }
        catch(IOException e)
        {// if control comes here port is in use
        	isServerRunning= false;
        }
            
        finally
        {
            serverSocket=null;
        }
        return isServerRunning;
	}

	public static AndroidDriver<AndroidElement> cap(String App) throws InterruptedException, IOException {
	
		
		FileInputStream file = new 	FileInputStream("C:\\Users\\WY2702\\Eclipse Wokspace\\ShaftAlignment\\src\\main\\java\\global.properties");
		//System.out.println(System.getProperty("user.dir"));
		
				//***Adding java properties to load the file from global.properties file.***  
		Properties prop= new Properties();
		prop.load(file);		
		AndroidDriver<AndroidElement> driver;
				//***Taking file from the destination and calling globally declared variable name***
		
		File f=new File("src");
				//***Getting app file from global variable from global.properties file***  
		File fs=new File(f,(String) prop.get(App));
		DesiredCapabilities cap= new DesiredCapabilities();
		
				//***Globally declared the device details in glabal.properties file*** 
		String device =prop.getProperty("device");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, device); //Android 7 tablet
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("noReset", true);
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		//cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
		//AndroidDriver driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver,1000);
		return driver;
	
	}

}

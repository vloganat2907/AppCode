package com.skf.mobileApps.ShaftAlignment;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import objects.MachineId;

public class TestCase2 extends Base_Capabilities {

	
	//Base_Capabilities BC= new Base_Capabilities();
		
			
		
			
	//Setting the resuable code for any apk invocation.
	
	@Test
	public void Report_Validation() throws InterruptedException, IOException
	{
			AndroidDriver<AndroidElement> driver= cap("ShaftAlignmentApp");
			
			TouchAction touch = new TouchAction(driver);
			//touch.touchAction({actions: 'tap', x: 146, y: 158});
			//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"New Alignment\")").click();
			
			//Page Title
			
			String Title = driver.findElementById("com.skf.shaftalignment:id/title").getText();
			System.out.println(Title);
			
			// select button
			driver.findElementById("com.skf.shaftalignment:id/right_action").getText();
			
			touch.tap(PointOption.point(146, 158)).perform();
			Thread.sleep(5000);
			
			WebDriverWait wait = new WebDriverWait(driver,5000);
			//driver.findElementsById("com.skf.shaftalignment:id/reportGridView").get(-1).click();
			
				//driver.switchTo().alert().accept();
			//driver.switchTo().window("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout");
			AndroidElement Select_Hardware = driver.findElementById("com.skf.shaftalignment:id/container");
			if(wait.until(ExpectedConditions.visibilityOf(Select_Hardware)).isDisplayed())
			{
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout");
			
			driver.findElementById("com.skf.shaftalignment:id/button_layout");
			driver.findElementById("com.skf.shaftalignment:id/demo_mode_button").click();
			}
			Thread.sleep(3000);
			
			String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

		    // create random string builder
		    StringBuilder sb = new StringBuilder();

		    // create an object of Random class
		    Random random = new Random();

		    // specify length of random string
		    int length = 8;

		    for(int i = 0; i < length; i++) {

		      // generate random index number
		      int index = random.nextInt(alphabet.length());

		      // get character specified by index
		      // from the string
		      char randomChar = alphabet.charAt(index);

		      // append the character to string builder
		      sb.append(randomChar);
		    }

		    String machineid = sb.toString();
		    System.out.println("New Machine ID for current measurement is : " + machineid);
			
			driver.findElementById("com.skf.shaftalignment:id/machine_info_fragment");
			driver.findElementById("com.skf.shaftalignment:id/machine_id_text").click();
			driver.findElementById("com.skf.shaftalignment:id/machine_id_text").sendKeys(String.valueOf(machineid));
			//driver.pressKeyCode(AndroidKeyCode.ENTER);
			driver.findElementById("com.skf.shaftalignment:id/length_one").click();
			driver.findElementById("com.skf.shaftalignment:id/length_one").clear();
			driver.findElementById("com.skf.shaftalignment:id/length_one").sendKeys("35");
			driver.findElementById("com.skf.shaftalignment:id/keyboard");
			driver.findElementById("com.skf.shaftalignment:id/button_enter").click();
			String d1= driver.findElementById("com.skf.shaftalignment:id/length_one").getText();
			System.out.println(d1);
			Thread.sleep(100);
			driver.findElementById("com.skf.shaftalignment:id/length_two").click();
			driver.findElementById("com.skf.shaftalignment:id/length_two").clear();
			driver.findElementById("com.skf.shaftalignment:id/length_two").sendKeys("45");
			driver.findElementById("com.skf.shaftalignment:id/keyboard");
			driver.findElementById("com.skf.shaftalignment:id/button_enter").click();
			String d2= driver.findElementById("com.skf.shaftalignment:id/length_two").getText();
			System.out.println(d2);
			Thread.sleep(100);
			driver.findElementById("com.skf.shaftalignment:id/length_three").click();
			driver.findElementById("com.skf.shaftalignment:id/length_three").clear();
			driver.findElementById("com.skf.shaftalignment:id/length_three").sendKeys("55");
			driver.findElementById("com.skf.shaftalignment:id/keyboard");
			driver.findElementById("com.skf.shaftalignment:id/button_enter").click();
			String d3= driver.findElementById("com.skf.shaftalignment:id/length_three").getText();
			System.out.println(d3);
			Thread.sleep(100);
			driver.findElementById("com.skf.shaftalignment:id/length_four").click();
			driver.findElementById("com.skf.shaftalignment:id/length_four").clear();
			driver.findElementById("com.skf.shaftalignment:id/length_four").sendKeys("100");
			driver.findElementById("com.skf.shaftalignment:id/keyboard");
			driver.findElementById("com.skf.shaftalignment:id/button_enter").click();
			String d4= driver.findElementById("com.skf.shaftalignment:id/length_four").getText();
			System.out.println(d4);
			//touch.press(PointOption.point(588, 900)).perform();
			touch.longPress(PointOption.point(588, 900)).moveTo(PointOption.point(677, 369)).release().perform();
			//touch.moveTo(PointOption.point(677,369)).perform();
			//touch.release();
			//driver.findElementById("com.skf.shaftalignment:id/photo_item").sendKeys(INBAN5CG9504X0C\\Galaxy Tab Active2\\Tablet\\Pictures\\Galaxy_BGscreen_1600x1280.jpg); //Image attachment
			driver.findElementById("com.skf.shaftalignment:id/vertical_adjustment_card");

			if(driver.findElementById("com.skf.shaftalignment:id/shims_check").isSelected())
			{
				driver.findElementById("com.skf.shaftalignment:id/chocks_check").click();
			}
			else {
				driver.findElementById("com.skf.shaftalignment:id/shims_check").click();
			}
			
			touch.press(PointOption.point(310, 1043)).perform();
			touch.moveTo(PointOption.point(458,677)).perform();
			touch.release();
			MobileElement el = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable("+ "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().text(\"Report Name\"));");
			driver.findElementsByClassName("android.widget.FrameLayout").indexOf("6");
			//driver.findElementByXPath("	\r\n" +"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout");
			driver.findElementById("com.skf.shaftalignment:id/report_name").sendKeys("Report1");
			Thread.sleep(500);
			driver.findElementById("com.skf.shaftalignment:id/softfoot_check").click();
			driver.findElementById("com.skf.shaftalignment:id/machine_info_fragment");
			driver.findElementById("com.skf.shaftalignment:id/fragment_up").click();
			Thread.sleep(3000);
			driver.findElementById("com.skf.shaftalignment:id/measurement_container");
			Thread.sleep(3000);
			
			
			//driver.findElementById("com.skf.shaftalignment:id/demo_mode").isDisplayed();
			//driver.findElementById("com.skf.shaftalignment:id/sensor_status_button").isEnabled();
			//driver.findElementsByClassName("com.skf.shaftalignment").indexOf("3");
			driver.findElementById("com.skf.shaftalignment:id/record_button").click();
			Thread.sleep(3000);
			driver.findElementById("com.skf.shaftalignment:id/record_button").click();
			Thread.sleep(3000);
			driver.findElementById("com.skf.shaftalignment:id/record_button").click();
			Thread.sleep(3000);
			driver.findElementById("com.skf.shaftalignment:id/remeasure_button").isDisplayed(); //Validate remeasure button
			driver.findElementById("com.skf.shaftalignment:id/remeasure_button").isEnabled();
			driver.findElementById("com.skf.shaftalignment:id/align_button").isDisplayed();
			driver.findElementById("com.skf.shaftalignment:id/align_button").isEnabled();
			driver.findElementById("com.skf.shaftalignment:id/done_button").isDisplayed();
			driver.findElementById("com.skf.shaftalignment:id/done_button").isEnabled();
			driver.findElementById("com.skf.shaftalignment:id/done_button").click();
			Thread.sleep(3000);
			//driver.findElementById("com.skf.shaftalignment:id/back_text").click();
			driver.findElementById("com.skf.shaftalignment:id/selectedFrame").click();
			Thread.sleep(1000);
			driver.findElementById("com.skf.shaftalignment:id/toolbar");
			driver.findElementByAccessibilityId("More options").click();
			Thread.sleep(1000);
			driver.findElementByXPath(".//*[@text=\"View PDF\"]").click();
			Thread.sleep(5000);
			//String Page= driver.getPageSource();
			//	System.out.println(Page);
			//String PdfText = driver.findElementById("com.google.android.apps.docs:id/pdf_view").getText();
			AndroidElement data = driver.findElementByXPath(".//*[contains(@content-desc, 'Shaft Alignment Report')][1]");
			String text = data.getAttribute("content-desc");
			System.out.println(text);
			String[] data1 = text.split("\n");
			//String[] M_id = text.split("\t");
			System.out.println(data1[3]+" " +"is" + " " + data1[4]);
			Assert.assertEquals(machineid, data1[4],"Test Failed");
			System.out.println("Machine Id Matched");
			String[] D= data1[25].split(" ");
			String D1=D[0];
			String D2=D[1];
			String D3=D[2];
			String D4=D[3];
			System.out.println(D[0]);
			System.out.println(D[1]);
			System.out.println(D[2]);
			System.out.println(D[3]);
			Assert.assertEquals(D[0], d1);
			System.out.println(D[0]+" "+"Distance 1 is matched with the entered D1"+" "+d1);
			Assert.assertEquals(D[1], d2);
			System.out.println(D[1]+" "+"Distance 2 is matched with the entered D2"+" "+d2);
			Assert.assertEquals(D[2], d3);
			System.out.println(D[2]+" "+"Distance 3 is matched with the entered D3"+" "+d3);
			Assert.assertEquals(D[3], d4);
			System.out.println(D[3]+" "+"Distance 4 is matched with the entered D4"+" "+d4);
	}
			}

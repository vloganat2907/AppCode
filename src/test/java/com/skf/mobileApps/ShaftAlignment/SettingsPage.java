package com.skf.mobileApps.ShaftAlignment;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingsPage {
	
	//***Report Template Box
	
	@AndroidFindBy(id="com.skf.shaftalignment:id/scroll_view")
	public WebElement ScrollView;	
	@AndroidFindBy(id="com.skf.shaftalignment:id/report_template_card")
	public WebElement reportTemplate;	
	@AndroidFindBy(id="com.skf.shaftalignment:id/company_name")
	public WebElement CompanyName;		
	@AndroidFindBy(id="com.skf.shaftalignment:id/operator_name")
	public WebElement OperatorName;
	
	
	//***Select Units Objects***	
	@AndroidFindBy(id="com.skf.shaftalignment:id/measuring_unit_card")
	public WebElement UnitCardBox;
	@AndroidFindBy(id="com.skf.shaftalignment:id/unit_row")
	public WebElement ClickUnit;	
	@AndroidFindBy(id="com.skf.shaftalignment:id/unit_text")
	public WebElement GetUnitText;	
	@AndroidFindBy(xpath=".//*[contains(@text, 'Automatic (Metric)')][1]")
	public WebElement Automatic_Metrics;	
	@AndroidFindBy(xpath=".//*[contains(@text, 'Metric')][1]")
	public WebElement Metrics;
	@AndroidFindBy(xpath=".//*[contains(@text, 'Imperial')][1]")
	public WebElement Imperial;
	
	
	//***Angular Error Box***	
	@AndroidFindBy(id="com.skf.shaftalignment:id/angular_error_card")
	public WebElement Angular_Box;
	@AndroidFindBy(id="com.skf.shaftalignment:id/rad_row")
	public WebElement Unit_mm;
	@AndroidFindBy(id="com.skf.shaftalignment:id/gap_row")
	public WebElement Unit_gap;
	
	
	//***Sensor Values Box***
	@AndroidFindBy(id="com.skf.shaftalignment:id/sensor_values_card")
	public WebElement SensorValue_Box;	
	@AndroidFindBy(id="com.skf.shaftalignment:id/sensor_values_row")
	public WebElement AlwaysDisplay;
	
	
	//*** Measurement Options ***	
	@AndroidFindBy(id="com.skf.shaftalignment:id/measurement_options_card")
	public WebElement MeasurementCard;	
	@AndroidFindBy(id="com.skf.shaftalignment:id/automatic_measure_row")
	public WebElement EnableAutoMeasure;	
	@AndroidFindBy(id="com.skf.shaftalignment:id/automatic_measure_switch")
	public WebElement CheckBoxStatus_EnagleAuto;
	@AndroidFindBy(id="com.skf.shaftalignment:id/fixed_position_row")
	public WebElement UseFixedAngle;	
	@AndroidFindBy(id="com.skf.shaftalignment:id/fixed_position_switch")
	public WebElement CheckBoxStatus_UseFixed;
	
	
	//*** Extended Filter Length for Auto measure after some time delay ***	
	@AndroidFindBy(id="com.skf.shaftalignment:id/extended_filter_card")
	public WebElement ExtendedCardBoxCard;	
	@AndroidFindBy(id="com.skf.shaftalignment:id/enable_filter_row")
	public WebElement EnableFixedLenth;	
	@AndroidFindBy(id="com.skf.shaftalignment:id/enable_filter_switch")
	public WebElement ExtendedFilter_CheckBoxStatus;	
	@AndroidFindBy(id="com.skf.shaftalignment:id/filter_length_row")
	public WebElement FixedLenthRow;	
	@AndroidFindBy(id="com.skf.shaftalignment:id/filter_length_value")
	public WebElement FilterValue;
	
	//***Select Hardware from Hardware_Page
	@AndroidFindBy(id="com.skf.shaftalignment:id/measuring_hardware_card")
	public WebElement HardwareCardBox;
	@AndroidFindBy(id="com.skf.shaftalignment:id/select_hardware_row")
	public WebElement SelectHardware;
	@AndroidFindBy(id="com.skf.shaftalignment:id/select_hardware_text")
	public WebElement SelectedHardwareName;
	
	
	//***Titles of each blocks***
	@AndroidFindBy(xpath=".//*[contains(@text, 'MEASUREMENT OPTIONS')][1]")
	public WebElement MeasurementTitle;	
	@AndroidFindBy(xpath=".//*[contains(@text, 'EXTENDED FILTER LENGTH')][1]")
	public WebElement ExtendedFilter_Title;	
	@AndroidFindBy(xpath=".//*[contains(@text, 'SENSOR VALUES')][1]")
	public WebElement SensorTitle;	
	@AndroidFindBy(xpath=".//*[contains(@text, 'REPORT TEMPLATE')][1]")
	public WebElement ReportBoxTitle;	
	@AndroidFindBy(xpath=".//*[contains(@text, 'ANGULAR ERROR')][1]")
	public WebElement AngularBoxTitle;
	@AndroidFindBy(xpath=".//*[contains(@text, 'HARDWARE')][1]")
	public WebElement HardwareTitle;
	
	

	
	
	
	

}

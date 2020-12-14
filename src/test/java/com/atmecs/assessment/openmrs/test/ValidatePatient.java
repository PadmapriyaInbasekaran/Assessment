package com.atmecs.assessment.openmrs.test;

import static org.testng.AssertJUnit.assertArrayEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.util.Properties;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.assessment.openmrs.basetest.BaseTest;
import com.atmecs.assessment.openmrs.constants.Constants;
import com.atmecs.assessment.openmrs.helperclass.HelperClass;
import com.atmecs.assessment.openmrs.utilities.UtilitiesClass;

public class ValidatePatient extends BaseTest {
	Properties locationPath;
	@Test(dataProvider = "Data", dataProviderClass = ValidatePatientDataProvider.class)
	public void demoTest(String username, String password,String patientId) throws InterruptedException
	{
		Logger logger = Logger.getLogger(ValidatePatient.class);
		locationPath = UtilitiesClass.readProperty(Constants.LOCATORS_FILE);
		HelperClass helper = new HelperClass(driver);
		logger.info("Sending username");
		helper.sendKeyUsingXpath(locationPath.getProperty("username_xpath"), username);
		logger.info("Sending password");
		helper.sendKeyUsingXpath(locationPath.getProperty("password_xpath"), password);
		logger.info("Selecting pharmacy from Location for this session tab");
		helper.selectElementFromTab(locationPath.getProperty("pharmacy_xpath"));
		logger.info("Clicking on login button");
		helper.clickOnButton(locationPath.getProperty("loginbutton_xpath"));
		helper.findPatientRecord(locationPath.getProperty("find_patient_record"));
		helper.sendKeyUsingXpath(locationPath.getProperty("search_patient"),patientId);

	}
}

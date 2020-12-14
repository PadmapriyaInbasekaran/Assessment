package com.atmecs.assessment.openmrs.test;

import java.util.Properties;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.assessment.openmrs.basetest.BaseTest;
import com.atmecs.assessment.openmrs.constants.Constants;
import com.atmecs.assessment.openmrs.helperclass.HelperClass;

import com.atmecs.assessment.openmrs.utilities.UtilitiesClass;
public class MergePatientRecords extends BaseTest{
	Properties locationPath;
	@Test(dataProvider = "Data", dataProviderClass = MergePatientRecordsDataProvider.class)
	public void demoTest(String username, String password, String firstName, String familyName,String gender,String day,String month,String year,String address, String cityVillage, String state,String country,String postalCode,String phoneNumber,String relationType,String relationName) throws InterruptedException
	{
		Logger logger = Logger.getLogger(MergePatientRecords.class);
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
		logger.info("Clicking on register patient");
		helper.clickOnCoreApp(locationPath.getProperty("register_patient"));
		logger.info("Entering firstname");
		helper.sendKeyUsingXpath(locationPath.getProperty("firstname_xpath"), firstName);
		logger.info("Entering familyname");
		helper.sendKeyUsingXpath(locationPath.getProperty("familyname_xpath"), familyName);
		logger.info("Cliking on forward icon");
		helper.clickOnForwardIcon(locationPath.getProperty("forward_icon"));
		logger.info("Selecting gender");
		helper.selectingElementFromDropdown(locationPath.getProperty("gender_xpath"),gender);
		logger.info("Cliking on forward icon");
		helper.clickOnForwardIcon(locationPath.getProperty("forward_icon"));
		logger.info("Entering Day");
		helper.sendKeyUsingXpath(locationPath.getProperty("day_xpath"), day);
		logger.info("Selecting month");
		helper.selectingElementFromDropdown(locationPath.getProperty("month_xpath"),month);
		logger.info("Selecting year");
		helper.sendKeyUsingXpath(locationPath.getProperty("year_xpath"), year);
		logger.info("Cliking on forward icon");
		helper.clickOnForwardIcon(locationPath.getProperty("forward_icon"));
		logger.info("Entering address");
		helper.sendKeyUsingXpath(locationPath.getProperty("address_xpath"), address);
		helper.sendKeyUsingXpath(locationPath.getProperty("city_village_xpath"), cityVillage);
		helper.sendKeyUsingXpath(locationPath.getProperty("state_xpath"), state);
		helper.sendKeyUsingXpath(locationPath.getProperty("country_xpath"), country);
		helper.sendKeyUsingXpath(locationPath.getProperty("postalcode_xpath"), postalCode);
		logger.info("Cliking on forward icon");
		helper.clickOnForwardIcon(locationPath.getProperty("forward_icon"));
		logger.info("Entering phone number");
		helper.sendKeyUsingXpath(locationPath.getProperty("phonenumber_xpath"), phoneNumber);
		logger.info("Cliking on forward icon");
		helper.clickOnForwardIcon(locationPath.getProperty("forward_icon"));
		logger.info("selecting relationship type");
		helper.selectingElementFromDropdown(locationPath.getProperty("relationtype_xpath"),relationType);
		logger.info("entering relationship name");
		helper.sendKeyUsingXpath(locationPath.getProperty("relationname_xpath"), relationName);
		logger.info("Cliking on forward icon");
		helper.clickOnForwardIcon(locationPath.getProperty("forward_icon"));
		logger.info("Submitting data");
		helper.clickOnButton(locationPath.getProperty(("submit_xpath")));
		Thread.sleep(10000);
		logger.info("Moving back to home page");
		helper.clickOnHomePage(locationPath.getProperty("homeicon_xpath"));
		logger.info("clicking on data management");
		helper.clickOnCoreApp(locationPath.getProperty("datamanagement_xpath"));
		logger.info("clicking on merge patient records");
		helper.clickOnCoreApp(locationPath.getProperty("mergepatient_xpath"));
		Thread.sleep(10000);
		helper.sendKeyUsingXpath(locationPath.getProperty("patient_xpath"),"Padmapriya");
		Thread.sleep(10000);
		helper.pressDownArrow(locationPath.getProperty("patient_xpath"));
		Thread.sleep(10000);
		helper.pressEnter(locationPath.getProperty("patient_xpath"));
		Thread.sleep(10000);
		helper.clickOnButton((locationPath.getProperty("cancelbutton_xpath")));
		Thread.sleep(10000);
		helper.sendKeyUsingXpath(locationPath.getProperty("patient_xpath"),"Aadhi");
		Thread.sleep(10000);
		helper.pressDownArrow(locationPath.getProperty("patient_xpath"));
		Thread.sleep(10000);
		helper.pressDownArrow(locationPath.getProperty("patient_xpath"));
		Thread.sleep(10000);
		helper.pressEnter(locationPath.getProperty("patient_xpath"));
		Thread.sleep(10000);
		helper.clickOnButton((locationPath.getProperty("cancelbutton_xpath")));
		helper.clickOnButton((locationPath.getProperty("continuebutton_xpath")));
		Thread.sleep(10000);
		helper.clickOnSecondPatient(locationPath.getProperty("secondpatient_xpath"));
		Thread.sleep(10000);
		helper.clickOnButton((locationPath.getProperty("continuebutton_xpath")));
		Thread.sleep(10000);
		logger.info("Moving back to home page");
		Thread.sleep(10000);
		helper.clickOnHomePage(locationPath.getProperty("homeicon_xpath"));
		Thread.sleep(10000);
		helper.findPatientRecord(locationPath.getProperty("find_patient_record"));
		Thread.sleep(10000);
		helper.sendKeyUsingXpath(locationPath.getProperty("search_patient"),"padmapriya");

	}
}

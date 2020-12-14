package com.atmecs.assessment.openmrs.test;

import org.testng.annotations.DataProvider;

import com.atmecs.assessment.openmrs.constants.Constants;
import com.atmecs.assessment.openmrs.utilities.ReadExcelData;

public class ValidatePatientDataProvider {
	@DataProvider( name= "Data" )
	public static Object[][] demoTestDataProvider() throws Exception
	{
		ReadExcelData readSheet = new ReadExcelData(Constants.TEST_FILE1);
		Object[][] data = readSheet.setExcelFile("LoginData");
		return data;	
	}
}

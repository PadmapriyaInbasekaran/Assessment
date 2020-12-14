package com.atmecs.assessment.openmrs.helperclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HelperClass {
	public WebDriver driver;
	public HelperClass(WebDriver driver)
	{
		this.driver = driver;
	}
	public void selectElementFromTab(String xpath) throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement Element = driver.findElement(By.xpath(xpath));
		List<WebElement> sessionList=Element.findElements(By.tagName("li"));
		for (WebElement li : sessionList) {
			if (li.getText().equals("Pharmacy")) {
				li.click();
			}
		}

	}
	public void sendKeyUsingId(String id, String value) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement Element = driver.findElement(By.id(id));
		Element.click();
		Element.sendKeys(value);
	}
	public void sendKeyUsingXpath(String xpath, String value) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement Element = driver.findElement(By.xpath(xpath));
		Element.click();
		Element.sendKeys(value);
	}
	public void sendKeyUsingName(String name, String value) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement Element = driver.findElement(By.name(name));
		Element.click();
		Element.sendKeys(value);

	}
	public void findPatientRecord(String xpath) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement Element = driver.findElement(By.xpath(xpath));
		Element.click();
	}
	public WebElement findElementByXpath(String xpath) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement Element = driver.findElement(By.xpath(xpath));
		Element.click();
		return Element;
	}
	public void clickOnButton(String xpath) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement Button = driver.findElement(By.xpath(xpath));
		Button.click();
	}
	public void clickOnHomePage(String xpath) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement Button = driver.findElement(By.xpath(xpath));
		Button.click();
	}
	public void clickOnSecondPatient(String xpath) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement Button = driver.findElement(By.xpath(xpath));
		Button.click();
	}
	public void pressEnter(String xpath) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement Button = driver.findElement(By.xpath(xpath));
		Button.sendKeys(Keys.ENTER);
	}
	public void pressDownArrow(String xpath) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement Button = driver.findElement(By.xpath(xpath));
		Button.sendKeys(Keys.ARROW_DOWN);
	}
	public void clickOnTableRow(String xpath) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement Element = driver.findElement(By.xpath(xpath));
		Element.click();
	}
	public void clickOnCoreApp(String xpath) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement Element = driver.findElement(By.xpath(xpath));
		Element.click();
	}
	public void clickOnForwardIcon(String xpath) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement Element = driver.findElement(By.xpath(xpath));
		Element.click();
	}
	public void selectingElementFromDropdown(String xpath,String value) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		Select s= new Select(driver.findElement(By.xpath(xpath)));
		s.selectByVisibleText(value);


	}
}



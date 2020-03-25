package WebDriverUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Variables;

public class Utils
{

	public static WebDriverWait wait;
	public static JavascriptExecutor js;

	public static void WaitForElement(WebDriver driver, WebElement element) 
	{
		wait= new WebDriverWait(driver,Variables.WebElement_wait);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));	
	}

	public static void WaitForElement(WebDriver driver, WebElement element,int timeunit)
	{
		wait= new WebDriverWait(driver,timeunit);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));	
	}

	public static void waitForPageLoad(WebDriver  driver) 
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("return document.readyState").toString().equals("Complete");
	}

}

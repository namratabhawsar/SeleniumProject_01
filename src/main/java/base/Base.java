package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Base 
{

	public static WebDriver driver;

	public static Properties prop;

	public static final String properties_filePath="src/main/java/Properties/config.properties";

	public Base() 
	{
		try
		{
			initialization();
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void initialization() throws Exception 
	{
		File file= new File(properties_filePath);

		FileInputStream ip= new FileInputStream(file);

		//FileReader freader= new FileReader(file);

		prop= new Properties();

		try 
		{
			prop.load(ip);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver",prop.getProperty("chromeDriverPath"));

		//System.setProperty("webdriver.chrome.driver",Variables.CHROMEDRIVER_PATH);

		driver= new ChromeDriver(BrowserCapabilities.ChromeBrowserCapabilities());

		driver.get(prop.getProperty("app_url"));
	}

}
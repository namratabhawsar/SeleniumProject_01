package base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserCapabilities 
{

	public static ChromeOptions ChromeBrowserCapabilities() 
	{

		ChromeOptions options= new ChromeOptions();
		options.addArguments("--start-maximized");
		//options.addArguments("--silent");
		options.addArguments("--disable-pop-blocking");

		/*
		 * Map<String,String> chMap= new HashMap<String,String>();
		 * chMap.put("http-proxy","127.0.0.1"); chMap.put("http-port","9515");
		 */
		
		return options;
	}	
}
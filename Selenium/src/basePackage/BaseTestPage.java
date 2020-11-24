package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utility.DataProviderClass;

public class BaseTestPage extends DataProviderClass{
	public static WebDriver driver;
	
	{		
		System.setProperty("webdriver.chrome.driver","C://Users//ACER-Z3-451//Downloads//Shashi_Folder//Selenium//Drivers//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();  
		options.addArguments("test-type");
		options.addArguments("--disable-extensions");
		driver = new ChromeDriver(options);
	}

	
	}





package utility;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class UtilityClass {

	@Test
	public static void captureScreenShot(WebDriver webdriver,String FileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)basePackage.BaseTestPage.driver;	
		
		File source=ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
				{
		FileUtils.copyFile(source, new File("./ScreenShots/FirstSS"+FileName+".png"));
		System.out.println("Taken ScreenShot");}
	}
	
//	<File> void beforeGetScreenshotAs​(OutputType<File> File) {}

}

package utility;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetUpClass {
	
	@BeforeTest 	
	public void setup() {
		//	driver.manage().deleteAllCookies();
		System.out.println("\n@BeforeTest");

	}

	@AfterTest
	public void tearup() {
		System.out.println("\n@AfterTest\n ");
		//	driver.quit();
	}

	
}

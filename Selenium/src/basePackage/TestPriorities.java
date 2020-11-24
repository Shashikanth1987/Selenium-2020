package basePackage;

import java.io.IOException;

import org.testng.annotations.Test;

import utility.UtilityClass;

public class TestPriorities extends BaseTestPage {

//	@Test(dataProvider="getData",invocationCount=1,priority=1,enabled=false)
	@Test(priority=1)// invocationCount=1)
	public void TestLogin(String uid, String pwd) {
			driver.manage().deleteAllCookies();
		//	driver.get("https://www.facebook.com");
		System.out.println("\nusername is "+uid+"\npassword is "+pwd);
	}

	@Test(priority=2)
	public void FactoryTest1_M1() throws IOException {
		System.out.println("From FactoryTest1_M1");
		basePackage.BaseTestPage.driver.get("https://www.google.com");
		UtilityClass.captureScreenShot(driver,"GOOGLE");
	}

	@Test(priority=3)
	public void FactoryTest1_M2() throws IOException {
		System.out.println("From FactoryTest1_M2");
		basePackage.BaseTestPage.driver.get("https://www.facebook.com");
		UtilityClass.captureScreenShot(driver,"FACEBOOK");
	}

	@Test(priority=4, enabled=false)
	public void FactoryTest1_M3() throws IOException {
		System.out.println("From FactoryTest1_M3");
		basePackage.BaseTestPage.driver.get("https:/www.gmail.com");
		UtilityClass.captureScreenShot(driver,"GMAIL");
	}

}

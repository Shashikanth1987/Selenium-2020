package basePackage;

import java.io.IOException;

import org.testng.annotations.Test;

import utility.UtilityClass;

public class FactoryTest1 extends BaseTestPage{

	@Test
public void FactoryTest1_M1() throws IOException {
	System.out.println("From FactoryTest1_M1");
	driver.get("https://www.google.com");
	UtilityClass.captureScreenShot(null, "GOOGLE");
}

	@Test
public void FactoryTest1_M2() throws IOException {
	System.out.println("From FactoryTest1_M2");
	driver.get("https://facebook.com");
	UtilityClass.captureScreenShot(null, "FACEBOOK");
}

	@Test
public void FactoryTest1_M3() throws IOException {
	System.out.println("From FactoryTest1_M3");
	driver.get("https://gmail.com");
	UtilityClass.captureScreenShot(null, "GMAIL");
}


}

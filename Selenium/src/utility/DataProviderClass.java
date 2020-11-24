package utility;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "getData")
	public Object[][] getData(){
		Object[][] data = new Object[2][2];
		data[0][0]="FirstUserName";
		data[0][1]="FirstPwd";
//		data[1][0]="SecondUserName";
//		data[1][1]="SecondPWD";
		return data;
	
}
}

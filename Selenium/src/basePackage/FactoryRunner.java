package basePackage;

import org.testng.annotations.*;

public class FactoryRunner {
	@Test
	@Factory
	public Object[] RunTest(){
//	return new Object[] {new FactoryTest1(),new FactoryTest2(), new FactoryTest3()};
//		return new Object[] {new FactoryTest1()};
		return new Object[] {new FactoryTest3()};
	
	} 
}
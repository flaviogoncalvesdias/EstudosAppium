package core;

import org.junit.AfterClass;

public class BaseTest {
	

	@AfterClass
	public static void finalizaTestes() {
		DriveFactory.killDriver();
	}

}

package core;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;

public class BaseTest {
	
	@Rule
	public TestName testName = new TestName();

	@After
	public void after() {
		try {
			geraScreenShot();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public static void finalizaTestes() {
		DriveFactory.killDriver();
	}

	public void geraScreenShot() throws WebDriverException, IOException {
		File imagem = DriveFactory.getDriver().getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(imagem, new File("output/screenshots/"+testName.getMethodName()+".png"));
	}
	
	public void esperar(){
		
	}

}

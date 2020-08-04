package page;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.DriveFactory;

public class SplashPage extends BasePage {

	public SplashPage() throws MalformedURLException {
		super();
	}

	public boolean isSplashVisivel() {
		return existeElelementoPorTexto("Splash");
	}

	public void aguardarSaidaSplash() throws MalformedURLException {
		DriveFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));

	}

}

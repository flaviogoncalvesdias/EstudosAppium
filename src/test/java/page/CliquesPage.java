package page;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class CliquesPage extends BasePage {

	public CliquesPage() throws MalformedURLException {
		super();
	}

	public void cliqueLongo() {
		
		new TouchAction(driver)
		.longPress(new LongPressOptions()
		.withElement(ElementOption.element(driver.findElement(By.xpath("//*[@text='Clique Longo']"))))
		.withDuration(Duration.ofMillis(2000)))
		.release()
		.perform();
	}

	public String obterTextoCampo() {
		return driver.findElement(By.xpath("//android.widget.TextView")).getText();
	}

}

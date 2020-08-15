package page;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.DriveFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class AlertaPage extends BasePage {

	public AlertaPage() throws MalformedURLException {
		super();
	}

	public void clicarAlerta() {
		clicaBtnTexto("ALERTA CONFIRM");
	}

	public String obterTituloAlerta() {
		return retornaValorElelementoPorTexto("Info");

	}
	
	public String obterMensagemAlerta() {
		return retornaValorElelementoPorTexto("Info");

	}
	
	public void clicarAlertaSimples() {
		clicaBtnTexto("ALERTA SIMPLES");

	}

	public void clicarCoordenadas(int x, int y) {
		
	new TouchAction(driver).tap(PointOption.point(x,y)).perform();

		
	}

}

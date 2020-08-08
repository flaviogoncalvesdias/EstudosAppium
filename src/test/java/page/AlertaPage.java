package page;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.DriveFactory;

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

}

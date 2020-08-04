package stepsTest;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Test;

import page.BasePage;
import page.MenuPage;
import page.SplashPage;

public class SplashTeste extends BasePage {

	public SplashTeste() throws MalformedURLException {
		super();
	}

	@Test
	public void deveAguardarSplashSumir() throws MalformedURLException {

		MenuPage menuPage = new MenuPage();
		SplashPage splashPage = new SplashPage();
		menuPage.acessarMenuSplash();

		splashPage.isSplashVisivel();

		splashPage.aguardarSaidaSplash();

		assertTrue(splashPage.existeElelementoPorTexto("Formulário"));

	}

}

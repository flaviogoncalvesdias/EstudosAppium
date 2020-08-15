package stepsTest;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import core.BaseTest;
import page.CliquesPage;
import page.MenuPage;

public class CliquesTeste extends BaseTest {
	MenuPage menuPage;
	CliquesPage cliquesPage;

	public CliquesTeste() throws MalformedURLException {
		super();
	}


//	@Test
	public void deveRealizarCliqueLongo() throws MalformedURLException, InterruptedException {
		menuPage = new MenuPage();
		cliquesPage = new CliquesPage();
		esperar(2000);
		menuPage.clicaBtnTexto("Cliques");
		cliquesPage.cliqueLongo();
		Assert.assertEquals("Clique Longo", cliquesPage.obterTextoCampo());

	}
	@Test
	public void deveRealizarCliqueDuplo() throws MalformedURLException, InterruptedException {
		menuPage = new MenuPage();
		cliquesPage = new CliquesPage();
		esperar(2000);
		menuPage.clicaBtnTexto("Cliques");
		cliquesPage.clicaBtnTexto("Clique duplo");
		cliquesPage.clicaBtnTexto("Clique duplo");

		Assert.assertEquals("Duplo Clique", cliquesPage.retornaValorElelementoPorTexto("Duplo Clique"));
		

	}

}

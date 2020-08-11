package stepsTest;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import page.AbasPage;
import page.MenuPage;

public class AbasTeste extends BaseTest {

	public AbasTeste() throws MalformedURLException {
		super();
	}

	private MenuPage menu;
	private AbasPage abasPage;

	@Test
	public void iteragirComAbas() throws MalformedURLException {
		menu = new MenuPage();
		abasPage = new AbasPage();
		
		menu.acessarAbas();
		Assert.assertTrue(abasPage.isAba1());
		abasPage.selecionarAba2();
		Assert.assertTrue(abasPage.isAba2());
	}

}

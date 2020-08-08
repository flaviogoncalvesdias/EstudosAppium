package stepsTest;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

import core.BaseTest;
import page.AlertaPage;
import page.FormularioPage;
import page.MenuPage;

public class AlertTest extends BaseTest{
	private MenuPage menu;
	private AlertaPage alertaPage;
	
	@Before
	public void iniciaTeste() throws MalformedURLException {
		menu = new MenuPage();
		alertaPage  = new AlertaPage();
	}
	@Test
	public void confirmarAlerta(){
		menu.acessarAlertas();
		alertaPage.clicarAlerta();
		
		
	}
	

}

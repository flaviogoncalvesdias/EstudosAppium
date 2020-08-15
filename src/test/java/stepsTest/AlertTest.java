package stepsTest;

import static org.junit.Assert.assertFalse;

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

	public void confirmarAlerta(){
		menu.acessarAlertas();
		alertaPage.clicarAlerta();
		
		
	}
	
	@Test
	public void cliquePorCoordenadas() throws InterruptedException {
		menu.acessarAlertas();
		alertaPage.clicarAlertaSimples();
		esperar(1000);
		alertaPage.clicarCoordenadas(100,150);
		assertFalse("Elemento continua visivel. ", alertaPage.existeElelementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
	}
	
}
package page;

import java.net.MalformedURLException;


public class MenuPage extends BasePage {
	
	
	public MenuPage() throws MalformedURLException {
		super();
	}

	public void acessarFormulario() {
		clicarEmFormulario();

	}

	public void acessarMenuSplash() {
		clicaBtnTexto("Splash");
	}
	
	

}

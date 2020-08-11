package page;

import java.net.MalformedURLException;

public class AbasPage extends BasePage {

	public AbasPage() throws MalformedURLException {
		super();
	}
	
	public Boolean isAba1() {
		return existeElelementoPorTexto("Este é o conteúdo da Aba 1");
		
	}
	
	public Boolean isAba2() {
		return existeElelementoPorTexto("Este é o conteúdo da Aba 2");
		
	}
	
	public void selecionarAba2(){
		clicaBtnTexto("ABA 2");
	}

}

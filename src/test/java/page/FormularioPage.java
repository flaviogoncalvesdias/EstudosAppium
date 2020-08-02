package page;

import java.net.MalformedURLException;

public class FormularioPage extends BasePage{


	public FormularioPage() throws MalformedURLException {
		super();
			}

	public void escreverNome(String nome) {
		preencherNome(nome);
	}

	public String obterTextoPorNome(String nome) {
		return retornaValorElelementoPorTexto(nome);
	}

	public void clicarLista() {
		clicaAccId("console");
	}

	public void clicarCheck() {
		clicaAccId("check");

	}

	public void clicarCombo() {
		clicaAccId("switch");

	}

	public void selecionarConsole(String console) {
		selecionaOpcao(console);

	}

	public void clicarSalvar() {
		clicaBtnTexto("SALVAR");

	}

}

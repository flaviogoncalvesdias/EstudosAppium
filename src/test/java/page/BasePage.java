package page;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import core.DriveFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BasePage {
	
	public AndroidDriver<MobileElement> driver;

	public BasePage() throws MalformedURLException {
		driver = DriveFactory.getDriver();
	}
	
	
	public void selecionaOpcao(String opcao) {
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='" + opcao + "']")).click();
	}

	public void clicaAccId(String accId) {
		driver.findElement(MobileBy.AccessibilityId(accId)).click();
	}

	public void preencherNome(String nome) {
		driver.findElement(MobileBy.AccessibilityId("nome")).sendKeys(nome);
	}

	public void clicarEmFormulario() {
		driver.findElement(By.xpath("//android.widget.TextView[@text='Formulário']")).click();

	}

	public void clicaBtnTexto(String txt) {
		driver.findElement(By.xpath("//android.widget.TextView[@text='" + txt + "']")).click();
	}

	public String retornaValorElelementoPorTexto(String txt) {
		return driver.findElement(By.xpath("//*[@text='" + txt + "']")).getText();
	}
	

}

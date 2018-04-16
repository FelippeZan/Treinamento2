package test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import main.BasePage;

public class Teste {
	BasePage bp = new BasePage();

	@Given("^testeTrivago - Acessar a tela inicial$")
	public void acessarPagina() {
		bp.abrirPage("https://www.trivago.com.br");
	}

	@When("^testeTrivago - Fazer busca Rio Branco$")
	public void realizarBusca() {
		bp.escreverPorName("sQuery", "Rio Branco");
		bp.clicarElementoPorClassName("horus-btn-search");
	}

	@When("^tesetTrivago - Escolher data qualquer entrada$")
	public void dataInicial() throws InterruptedException {
		Thread.sleep(5000);
		//bp.esperarPorXpath("//*[@id=\"js-fullscreen-hero\"]/div/form/div[2]/div[2]/div/table/tbody/tr[3]/td[6]");
		bp.clicarElementoPorXpath("//*[@id=\"js-fullscreen-hero\"]/div/form/div[2]/div[2]/div/table/tbody/tr[3]/td[6]");
	}
	@When("^testeTrivago - Escolher data qualquer saida$")
	public void dataFinal() throws InterruptedException {
		Thread.sleep(5000);
		//bp.esperarPorXpath("//*[@id=\"js-fullscreen-hero\"]/div/form/div[2]/div[2]/div/table/tbody/tr[5]/td[1]");
		bp.clicarElementoPorXpath("//*[@id=\"js-fullscreen-hero\"]/div/form/div[2]/div[2]/div/table/tbody/tr[5]/td[1]");
	}
	@When("^testeTrivago - Escolher primeira oferta$")
	public void verOferta() throws InterruptedException {
		Thread.sleep(5000);
		bp.clicarElementoPorXpath("//*[@id=\"js_item_3809554\"]/div[1]/div[3]/section[2]/div/div[2]/button");
	}

}

package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import web.pageActions.GooglePageActions;

public class GoogleStepDefinitions {
    private GooglePageActions googlePageActions;

    public GoogleStepDefinitions() {
        this.googlePageActions = new GooglePageActions();
    }

    @Dado("eu faça uma pesquisa por {string} no Google")
    public void euFaçaUmaPesquisaPorNoGoogle(String string) {
        this.googlePageActions.pesquisaNoGoogle(string);
    }

    @Então("O titulo da página contem o título {string}")
    public void oTituloDaPáginaContemOTítulo(String string) {
        this.googlePageActions.validaTitulodaPagina(string);
    }
}

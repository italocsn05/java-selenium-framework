package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

public class AutomacaoComBatistaStepDefinitions {
    private HomePageActions homePageActions;
    private CriarUsuarioPageActions criarUsuarioPageActions;

    public AutomacaoComBatistaStepDefinitions() {
        this.homePageActions = new HomePageActions();
        this.criarUsuarioPageActions = new CriarUsuarioPageActions();
    }

    @Dado("cliquei no botão {string}")
    public void cliqueiNoBotão(String string) {
        this.homePageActions.clicarNoBotao(string);
    }
    @Dado("preenchi o campo {string}")
    public void preenchiOCampo(String string) {
        this.criarUsuarioPageActions.preencheOCampo(string);
    }
    @Então("a mensagem {string} é exibida")
    public void aMensagemÉExibida(String string) {
        this.criarUsuarioPageActions.visualizaAMensagem(string);
    }
}


package stepDefinitions.AutomacaoComBatista;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import web.pageActions.AutomacaoComBatista.FormularioCriarUsuario.FormularioCriarUsuarioPageActions;
import web.pageActions.AutomacaoComBatista.Home.HomePageActions;
import web.pageActions.AutomacaoComBatista.ListaFuncionalidades.ListaFuncionalidadesPageActions;

public class StepDefinitions {
    private HomePageActions homePageActions;
    private ListaFuncionalidadesPageActions listaFuncionalidadesPageActions;
    private FormularioCriarUsuarioPageActions formularioCriarUsuarioPageActions;

    public StepDefinitions() {
        this.homePageActions = new HomePageActions();
        this.listaFuncionalidadesPageActions = new ListaFuncionalidadesPageActions();
        this.formularioCriarUsuarioPageActions = new FormularioCriarUsuarioPageActions();
    }

    @Dado("na tela Home eu clique no botão {string}")
    public void naTelaHomeEuCliqueNoBotão(String campo) {
        this.homePageActions.naTelaHomeCliquarNoBotão(campo);
    }

    @E("na tela Lista de Funcionalidades eu clique no botão {string}")
    public void naTelaListaDeFuncionalidadesEuCliqueNoBotão(String campo) {
        this.listaFuncionalidadesPageActions.naTelaListaDeFuncionalidadesCliquarNoBotão(campo);
    }

    @E("na tela Novo Usuário eu preencha o campo {string} com o valor {string}")
    public void naTelaNovoUsuárioEuPreenchaOCampoComOValor(String campo, String valor) {
        this.formularioCriarUsuarioPageActions.naTelaNovoUsuárioPreencheOCampoComOValor(campo, valor);
    }

    @Quando("na tela Novo Usuário eu clique no botão {string}")
    public void naTelaNovoUsuárioEuCliqueNoBotão(String campo) {
        this.formularioCriarUsuarioPageActions.naTelaNovoUsuárioCliqueNoBotão(campo);
    }

    @Então("na tela Usuário Criado eu visualizo a mensagem {string}")
    public void naTelaUsuárioCriadoEuVisualizoAMensagem(String valor) {

    }
}

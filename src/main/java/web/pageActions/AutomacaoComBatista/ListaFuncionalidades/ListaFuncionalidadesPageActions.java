package web.pageActions.AutomacaoComBatista.ListaFuncionalidades;

import commons.BaseConfig;
import org.junit.Assert;
import web.BaseActions.Commons;
import web.pageObjects.AutomacaoComBatista.Home.HomePageObjects;
import web.pageObjects.AutomacaoComBatista.ListaFuncionalidades.ListaFuncionalidadesPageObjects;

public class ListaFuncionalidadesPageActions extends BaseConfig {
    private Commons commons;
    private ListaFuncionalidadesPageObjects listaFuncionalidadesPageObjects;

    public ListaFuncionalidadesPageActions() {
        this.commons = new Commons();
        this.listaFuncionalidadesPageObjects = new ListaFuncionalidadesPageObjects(webDriver);
    }

    public void naTelaListaDeFuncionalidadesCliquarNoBotão(String campo) {
        if (campo.equalsIgnoreCase("Formulário")){
            this.commons.webElementWaitIsVisible(this.listaFuncionalidadesPageObjects.getaFormulario());
            Assert.assertTrue(this.listaFuncionalidadesPageObjects.getaFormulario().isDisplayed());

            this.commons.webElementGetEvidence(this.listaFuncionalidadesPageObjects.getaFormulario());
            this.commons.webElementSendClick(this.listaFuncionalidadesPageObjects.getaFormulario());
        }else if (campo.equalsIgnoreCase("Criar Usuários")){
            this.commons.webElementWaitIsVisible(this.listaFuncionalidadesPageObjects.getaCriarUsuarios());
            Assert.assertTrue(this.listaFuncionalidadesPageObjects.getaCriarUsuarios().isDisplayed());

            this.commons.webElementGetEvidence(this.listaFuncionalidadesPageObjects.getaCriarUsuarios());
            this.commons.webElementSendClick(this.listaFuncionalidadesPageObjects.getaCriarUsuarios());
        }
    }
}

package web.pageActions;

import commons.BaseConfig;
import org.junit.Assert;
import web.BaseActions.Commons;
import web.pageObjects.GooglePageObjects;

public class GooglePageActions extends BaseConfig {
    private GooglePageObjects googlePageObjects;
    private Commons commons;

    public GooglePageActions() {
        this.googlePageObjects = new GooglePageObjects(webDriver);
        this.commons = new Commons();
    }

    public void pesquisaNoGoogle(String value){
        this.commons.webElementWaitIsVisible(this.googlePageObjects.getInputPesquisa());
        this.commons.webElementSendKeys(this.googlePageObjects.getInputPesquisa(), value);
        this.commons.webElementGetEvidence(this.googlePageObjects.getInputPesquisa());
        this.googlePageObjects.getInputPesquisa().submit();
    }

    public void validaTitulodaPagina(String value){
        Assert.assertEquals(value, webDriver.getTitle());
    }
}

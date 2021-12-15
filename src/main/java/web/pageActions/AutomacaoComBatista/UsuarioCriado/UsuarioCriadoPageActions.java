package web.pageActions.AutomacaoComBatista.UsuarioCriado;

import commons.BaseConfig;
import org.junit.Assert;
import web.BaseActions.Commons;
import web.pageObjects.AutomacaoComBatista.UsuarioCriado.UsuarioCriadoPageObjects;

public class UsuarioCriadoPageActions extends BaseConfig {
    private Commons commons;
    private UsuarioCriadoPageObjects usuarioCriadoPageObjects;

    public UsuarioCriadoPageActions() {
        this.commons = new Commons();
        this.usuarioCriadoPageObjects = new UsuarioCriadoPageObjects(webDriver);
    }

    public void naTelaUsuárioCriadoVisualizoAMensagem(String valor) {
        this.commons.webElementWaitIsVisible(this.usuarioCriadoPageObjects.getpNotice());
        Assert.assertTrue(this.usuarioCriadoPageObjects.getpNotice().isDisplayed());

        Assert.assertEquals(valor, this.usuarioCriadoPageObjects.getpNotice().getText());
        this.commons.webElementGetEvidence(this.usuarioCriadoPageObjects.getpNotice());
    }
}

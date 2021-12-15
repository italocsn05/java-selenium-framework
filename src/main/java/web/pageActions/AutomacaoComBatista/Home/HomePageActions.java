package web.pageActions.AutomacaoComBatista.Home;

import commons.BaseConfig;
import org.junit.Assert;
import web.BaseActions.Commons;
import web.pageObjects.AutomacaoComBatista.Home.HomePageObjects;

public class HomePageActions extends BaseConfig {
    private Commons commons;
    private HomePageObjects homePageObjects;

    public HomePageActions() {
        this.commons = new Commons();
        this.homePageObjects = new HomePageObjects(webDriver);
    }

    public void naTelaHomeCliquarNoBotão(String campo) {
        if (campo.equalsIgnoreCase("Começar Automação Web")){
            this.commons.webElementWaitIsVisible(this.homePageObjects.getaComecarAutomacao());
            Assert.assertTrue(this.homePageObjects.getaComecarAutomacao().isDisplayed());

            this.commons.webElementGetEvidence(this.homePageObjects.getaComecarAutomacao());
            this.commons.webElementSendClick(this.homePageObjects.getaComecarAutomacao());
        }
    }
}

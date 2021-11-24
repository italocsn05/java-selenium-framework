package web.pageActions;

import commons.BaseConfig;
import org.openqa.selenium.support.ui.ExpectedConditions;
import web.pageObjects.CriarUsuarioPageObjects;
import web.pageObjects.HomePageObjects;

public class HomePageActions extends BaseConfig {
    private HomePageObjects homePageObjects;
    private CriarUsuarioPageObjects criarUsuarioPageObjects;

    public HomePageActions() {
        this.homePageObjects = new HomePageObjects(webDriver);
        this.criarUsuarioPageObjects = new CriarUsuarioPageObjects(webDriver);
    }

    public void clicarNoBotao(String string){
        if (string.equalsIgnoreCase("Começar automação web")){
            webDriverWait.until(ExpectedConditions.visibilityOf(homePageObjects.getLinkComeçarAutomaçãoWeb()));
            homePageObjects.getLinkComeçarAutomaçãoWeb().click();
        }
        if (string.equalsIgnoreCase("Formulário")){
            webDriverWait.until(ExpectedConditions.visibilityOf(homePageObjects.getLinkFormulário()));
            homePageObjects.getLinkFormulário().click();
        }
        if (string.equalsIgnoreCase("Criar usuários")){
            webDriverWait.until(ExpectedConditions.visibilityOf(homePageObjects.getLinkCriarUsuário()));
            homePageObjects.getLinkCriarUsuário().click();
        }
        if (string.equalsIgnoreCase("Criar")){
            webDriverWait.until(ExpectedConditions.visibilityOf(criarUsuarioPageObjects.getInputCriar()));
            criarUsuarioPageObjects.getInputCriar().click();
        }
    }

}

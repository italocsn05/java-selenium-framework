package web.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
    public HomePageObjects(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[contains(text(), 'Começar Automação Web')]")
    private WebElement linkComeçarAutomaçãoWeb;

    @FindBy(xpath = "//a[contains(text(), 'Formulário')]")
    private WebElement linkFormulário;

    @FindBy(xpath = "//a[contains(text(), 'Criar Usuário')]")
    private WebElement linkCriarUsuário;

    public WebElement getLinkComeçarAutomaçãoWeb() {
        return linkComeçarAutomaçãoWeb;
    }

    public WebElement getLinkFormulário() {
        return linkFormulário;
    }

    public WebElement getLinkCriarUsuário() {
        return linkCriarUsuário;
    }
}

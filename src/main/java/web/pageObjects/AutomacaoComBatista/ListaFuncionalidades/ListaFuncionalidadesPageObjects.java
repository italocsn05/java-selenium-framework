package web.pageObjects.AutomacaoComBatista.ListaFuncionalidades;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListaFuncionalidadesPageObjects {

    public ListaFuncionalidadesPageObjects(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Formulário')]")
    private WebElement aFormulario;

    @FindBy(xpath = "//a[contains(text(),'Criar Usuários')]")
    private WebElement aCriarUsuarios;

    public WebElement getaFormulario() {
        return aFormulario;
    }

    public WebElement getaCriarUsuarios() {
        return aCriarUsuarios;
    }
}

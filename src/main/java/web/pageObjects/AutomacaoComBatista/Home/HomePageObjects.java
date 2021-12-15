package web.pageObjects.AutomacaoComBatista.Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
    public HomePageObjects(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Começar Automação Web')]")
    private WebElement aComecarAutomacao;

    public WebElement getaComecarAutomacao() {
        return aComecarAutomacao;
    }
}

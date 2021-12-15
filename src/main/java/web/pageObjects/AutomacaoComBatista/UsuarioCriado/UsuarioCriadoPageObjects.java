package web.pageObjects.AutomacaoComBatista.UsuarioCriado;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsuarioCriadoPageObjects {

    public UsuarioCriadoPageObjects(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//p[@id=\"notice\"]")
    private WebElement pNotice;

    public WebElement getpNotice() {
        return pNotice;
    }
}

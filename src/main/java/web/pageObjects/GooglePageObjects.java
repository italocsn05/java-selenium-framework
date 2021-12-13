package web.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePageObjects {
    public GooglePageObjects(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@name=\"q\"]")
    private WebElement inputPesquisa;

    public WebElement getInputPesquisa() {
        return inputPesquisa;
    }
}

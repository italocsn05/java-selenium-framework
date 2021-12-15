package web.pageObjects.AutomacaoComBatista.FormularioCriarUsuario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormularioCriarUsuariosPageObjects {

    public FormularioCriarUsuariosPageObjects(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id=\"user_name\"]")
    private WebElement inputUserName;

    @FindBy(xpath = "//input[@id=\"user_lastname\"]")
    private WebElement inputUserLastname;

    @FindBy(xpath = "//input[@id=\"user_email\"]")
    private WebElement inputUserEmail;

    @FindBy(xpath = "//input[@id=\"user_address\"]")
    private WebElement inputUserAddress;

    @FindBy(xpath = "//input[@id=\"user_university\"]")
    private WebElement inputUserUniversity;

    @FindBy(xpath = "//input[@id=\"user_profile\"]")
    private WebElement inputUserUserProfile;

    @FindBy(xpath = "//input[@id=\"user_gender\"]")
    private WebElement inputUserUserGender;

    @FindBy(xpath = "//input[@id=\"user_age\"]")
    private WebElement inputUserUserAge;

    @FindBy(xpath = "//input[@value=\"Criar\"]")
    private WebElement inputCriar;

    @FindBy(xpath = "//a[contains(text(),'Voltar')]")
    private WebElement aVoltar;

    public WebElement getInputUserName() {
        return inputUserName;
    }

    public WebElement getInputUserLastname() {
        return inputUserLastname;
    }

    public WebElement getInputUserEmail() {
        return inputUserEmail;
    }

    public WebElement getInputUserAddress() {
        return inputUserAddress;
    }

    public WebElement getInputUserUniversity() {
        return inputUserUniversity;
    }

    public WebElement getInputUserUserProfile() {
        return inputUserUserProfile;
    }

    public WebElement getInputUserUserGender() {
        return inputUserUserGender;
    }

    public WebElement getInputUserUserAge() {
        return inputUserUserAge;
    }

    public WebElement getInputCriar() {
        return inputCriar;
    }

    public WebElement getaVoltar() {
        return aVoltar;
    }
}

package web.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CriarUsuarioPageObjects {
    public CriarUsuarioPageObjects(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id=\"user_name\"]")
    private WebElement inputNome;

    @FindBy(xpath = "//input[@id=\"user_lastname\"]")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@id=\"user_email\"]")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id=\"user_address\"]")
    private WebElement inputUserAddress;

    @FindBy(xpath = "//input[@id=\"user_university\"]")
    private WebElement inputUserUniversity;

    @FindBy(xpath = "//input[@id=\"user_profile\"]")
    private WebElement inputUserProfile;

    @FindBy(xpath = "//input[@id=\"user_gender\"]")
    private WebElement inputUserGender;

    @FindBy(xpath = "//input[@id=\"user_age\"]")
    private WebElement inputUserAge;

    @FindBy(xpath = "//input[@value=\"Criar\"]")
    private WebElement inputCriar;

    @FindBy(xpath = "//p[@id=\"notice\"]")
    private WebElement pNoticia;

    public WebElement getInputNome() {
        return inputNome;
    }

    public WebElement getInputLastName() {
        return inputLastName;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputUserAddress() {
        return inputUserAddress;
    }

    public WebElement getInputUserUniversity() {
        return inputUserUniversity;
    }

    public WebElement getInputUserProfile() {
        return inputUserProfile;
    }

    public WebElement getInputUserGender() {
        return inputUserGender;
    }

    public WebElement getInputUserAge() {
        return inputUserAge;
    }

    public WebElement getInputCriar() {
        return inputCriar;
    }

    public WebElement getpNoticia() {
        return pNoticia;
    }
}

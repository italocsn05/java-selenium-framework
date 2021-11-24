package web.pageActions;

import commons.BaseConfig;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import web.pageObjects.CriarUsuarioPageObjects;
import static org.junit.Assert.*;

public class CriarUsuarioPageActions extends BaseConfig {
    private CriarUsuarioPageObjects criarUsuarioPageObjects;

    public CriarUsuarioPageActions() {
        this.criarUsuarioPageObjects = new CriarUsuarioPageObjects(webDriver);
    }

    public void preencheOCampo(String string){
        if (string.equalsIgnoreCase("Nome")){
            webDriverWait.until(ExpectedConditions.visibilityOf(criarUsuarioPageObjects.getInputNome()));
            criarUsuarioPageObjects.getInputNome().sendKeys(dataGenerator.getLastName());
        }
        if (string.equalsIgnoreCase("Último nome")){
            webDriverWait.until(ExpectedConditions.visibilityOf(criarUsuarioPageObjects.getInputLastName()));
            criarUsuarioPageObjects.getInputLastName().sendKeys(dataGenerator.getLastName());
        }
        if (string.equalsIgnoreCase("Email")){
            webDriverWait.until(ExpectedConditions.visibilityOf(criarUsuarioPageObjects.getInputEmail()));
            criarUsuarioPageObjects.getInputEmail().sendKeys(dataGenerator.getEmail());
        }
        if (string.equalsIgnoreCase("Endereço")){
            webDriverWait.until(ExpectedConditions.visibilityOf(criarUsuarioPageObjects.getInputUserAddress()));
            criarUsuarioPageObjects.getInputUserAddress().sendKeys(dataGenerator.getAddress());
        }
        if (string.equalsIgnoreCase("Universidade")){
            webDriverWait.until(ExpectedConditions.visibilityOf(criarUsuarioPageObjects.getInputUserUniversity()));
            criarUsuarioPageObjects.getInputUserUniversity().sendKeys(dataGenerator.getUniversity());
        }
        if (string.equalsIgnoreCase("Profissão")){
            webDriverWait.until(ExpectedConditions.visibilityOf(criarUsuarioPageObjects.getInputUserProfile()));
            criarUsuarioPageObjects.getInputUserProfile().sendKeys(dataGenerator.getProfile());
        }
        if (string.equalsIgnoreCase("Gênero")){
            webDriverWait.until(ExpectedConditions.visibilityOf(criarUsuarioPageObjects.getInputUserGender()));
            criarUsuarioPageObjects.getInputUserGender().sendKeys(dataGenerator.getGender());
        }
        if (string.equalsIgnoreCase("Idade")){
            webDriverWait.until(ExpectedConditions.visibilityOf(criarUsuarioPageObjects.getInputUserAge()));
            criarUsuarioPageObjects.getInputUserAge().sendKeys("23");
        }
    }

    public void visualizaAMensagem(String string){
        if (string.equalsIgnoreCase("Usuário Criado com sucesso")){
            webDriverWait.until(ExpectedConditions.visibilityOf(criarUsuarioPageObjects.getpNoticia()));
            String notice = criarUsuarioPageObjects.getpNoticia().getText();
            Assert.assertEquals(notice, string);
        }
    }
}

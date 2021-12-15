package web.pageActions.AutomacaoComBatista.FormularioCriarUsuario;

import commons.BaseConfig;
import org.junit.Assert;
import web.BaseActions.Commons;
import web.pageObjects.AutomacaoComBatista.FormularioCriarUsuario.FormularioCriarUsuariosPageObjects;
import web.pageObjects.AutomacaoComBatista.ListaFuncionalidades.ListaFuncionalidadesPageObjects;

public class FormularioCriarUsuarioPageActions extends BaseConfig {
    private Commons commons;
    private FormularioCriarUsuariosPageObjects formularioCriarUsuariosPageObjects;

    public FormularioCriarUsuarioPageActions() {
        this.commons = new Commons();
        this.formularioCriarUsuariosPageObjects = new FormularioCriarUsuariosPageObjects(webDriver);
    }

    public void naTelaNovoUsuárioPreencheOCampoComOValor(String campo, String valor) {
        if (campo.equalsIgnoreCase("Nome")){
            this.commons.webElementWaitIsVisible(this.formularioCriarUsuariosPageObjects.getInputUserName());
            Assert.assertTrue(this.formularioCriarUsuariosPageObjects.getInputUserName().isDisplayed());

            this.commons.webElementSendKeys(this.formularioCriarUsuariosPageObjects.getInputUserName(), valor);
            this.commons.webElementGetEvidence(this.formularioCriarUsuariosPageObjects.getInputUserName());
        } else if (campo.equalsIgnoreCase("Último Nome")){
            this.commons.webElementWaitIsVisible(this.formularioCriarUsuariosPageObjects.getInputUserLastname());
            Assert.assertTrue(this.formularioCriarUsuariosPageObjects.getInputUserLastname().isDisplayed());

            this.commons.webElementSendKeys(this.formularioCriarUsuariosPageObjects.getInputUserLastname(), valor);
            this.commons.webElementGetEvidence(this.formularioCriarUsuariosPageObjects.getInputUserLastname());
        } else if (campo.equalsIgnoreCase("Email")){
            this.commons.webElementWaitIsVisible(this.formularioCriarUsuariosPageObjects.getInputUserEmail());
            Assert.assertTrue(this.formularioCriarUsuariosPageObjects.getInputUserEmail().isDisplayed());

            this.commons.webElementSendKeys(this.formularioCriarUsuariosPageObjects.getInputUserEmail(), valor);
            this.commons.webElementGetEvidence(this.formularioCriarUsuariosPageObjects.getInputUserEmail());
        } else if (campo.equalsIgnoreCase("Endereço")){
            this.commons.webElementWaitIsVisible(this.formularioCriarUsuariosPageObjects.getInputUserAddress());
            Assert.assertTrue(this.formularioCriarUsuariosPageObjects.getInputUserAddress().isDisplayed());

            this.commons.webElementSendKeys(this.formularioCriarUsuariosPageObjects.getInputUserAddress(), valor);
            this.commons.webElementGetEvidence(this.formularioCriarUsuariosPageObjects.getInputUserAddress());
        } else if (campo.equalsIgnoreCase("Universidade")){
            this.commons.webElementWaitIsVisible(this.formularioCriarUsuariosPageObjects.getInputUserUniversity());
            Assert.assertTrue(this.formularioCriarUsuariosPageObjects.getInputUserUniversity().isDisplayed());

            this.commons.webElementSendKeys(this.formularioCriarUsuariosPageObjects.getInputUserUniversity(), valor);
            this.commons.webElementGetEvidence(this.formularioCriarUsuariosPageObjects.getInputUserUniversity());
        } else if (campo.equalsIgnoreCase("Profissão")){
            this.commons.webElementWaitIsVisible(this.formularioCriarUsuariosPageObjects.getInputUserUserProfile());
            Assert.assertTrue(this.formularioCriarUsuariosPageObjects.getInputUserUserProfile().isDisplayed());

            this.commons.webElementSendKeys(this.formularioCriarUsuariosPageObjects.getInputUserUserProfile(), valor);
            this.commons.webElementGetEvidence(this.formularioCriarUsuariosPageObjects.getInputUserUserProfile());
        } else if (campo.equalsIgnoreCase("Gênero")){
            this.commons.webElementWaitIsVisible(this.formularioCriarUsuariosPageObjects.getInputUserUserGender());
            Assert.assertTrue(this.formularioCriarUsuariosPageObjects.getInputUserUserGender().isDisplayed());

            this.commons.webElementSendKeys(this.formularioCriarUsuariosPageObjects.getInputUserUserGender(), valor);
            this.commons.webElementGetEvidence(this.formularioCriarUsuariosPageObjects.getInputUserUserGender());
        } else if (campo.equalsIgnoreCase("Idade")){
            this.commons.webElementWaitIsVisible(this.formularioCriarUsuariosPageObjects.getInputUserUserAge());
            Assert.assertTrue(this.formularioCriarUsuariosPageObjects.getInputUserUserAge().isDisplayed());

            this.commons.webElementSendKeys(this.formularioCriarUsuariosPageObjects.getInputUserUserAge(), valor);
            this.commons.webElementGetEvidence(this.formularioCriarUsuariosPageObjects.getInputUserUserAge());
        }
    }

    public void naTelaNovoUsuárioCliqueNoBotão(String campo) {
        if (campo.equalsIgnoreCase("Criar")){
            this.commons.webElementWaitIsVisible(this.formularioCriarUsuariosPageObjects.getInputCriar());
            Assert.assertTrue(this.formularioCriarUsuariosPageObjects.getInputCriar().isDisplayed());

            this.commons.webElementGetEvidence(this.formularioCriarUsuariosPageObjects.getInputCriar());
            this.commons.webElementSendClick(this.formularioCriarUsuariosPageObjects.getInputCriar());
        }
    }
}

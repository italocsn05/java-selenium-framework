package web.pageActions.commons;

import commons.BaseConfig;
import io.cucumber.java.Scenario;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Commons extends BaseConfig {

    public void webElementGetEvidence(WebElement webElement, Scenario scenario){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        javascriptExecutor.executeScript("arguments[0].style.border=’3px solid red", webElement);
    }

    public void webElementWaitIsVisible(WebElement webElement){
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
}

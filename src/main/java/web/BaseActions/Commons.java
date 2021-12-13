package web.BaseActions;

import commons.BaseConfig;
import io.cucumber.java.Scenario;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Commons extends BaseConfig {

    public void webElementGetEvidence(WebElement webElement){
        JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) webDriver);
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", webElement);
        javascriptExecutor.executeScript("arguments[0].style.border = arguments[1]", webElement, "solid 3px red");
    }

    public void webElementWaitIsVisible(WebElement webElement){
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void webElementSendKeys(WebElement webElement, String value){
        webElement.sendKeys(value);
    }

    public void webElementSendClick(WebElement webElement){
        webElement.click();
    }

    public void webElementSelectByVisibleText(WebElement webElement, String value){
        Select select = new Select(webElement);
        select.selectByVisibleText(value);
    }
}

package configuration;

import commons.BaseConfig;
import io.cucumber.java.*;

public class Hooks extends BaseConfig {
    @Before(value = "@web")
    public void beforeWebScenario(){
        System.out.println("Hooks Web Execution");
        browserSettings();
    }

    @After(value = "@web")
    public void afterWebScenario(Scenario scenario){
        browserScreenShotSaveFile(scenario);
        browserTearDown();
    }

    @AfterStep
    public void afterStepWeb(Scenario scenario){
        browserScreenShotCucumberAttachReport(scenario);
    }
}

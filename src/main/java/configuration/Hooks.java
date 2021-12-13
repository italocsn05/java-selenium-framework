package configuration;

import commons.BaseConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseConfig {
    @Before(value = "@web")
    public void beforeWebScenario(){
        System.out.println("Hooks Web Execution");
        browserSettings();
    }

    @After(value = "@web")
    public void afterWebScenario(Scenario scenario){
        System.out.println("Hooks Web Execution Finished");
        browserScreenShot(" " + scenario.getName() + "_(" + scenario.getStatus() + ")");
        browserTearDown();
    }
}

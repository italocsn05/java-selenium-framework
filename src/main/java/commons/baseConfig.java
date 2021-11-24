package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseConfig {
    protected static WebDriver webDriver;
    protected static WebDriverWait webDriverWait;
    protected dataGenerator dataGenerator = new dataGenerator();
    protected propertiesManager propertiesManager = new propertiesManager();


}

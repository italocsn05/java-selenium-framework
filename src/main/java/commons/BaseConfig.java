package commons;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;

public class BaseConfig {
    protected static WebDriver webDriver;
    protected static WebDriverWait webDriverWait;
    protected DataGenerator dataGenerator = new DataGenerator();
    protected PropertiesManager propertiesManager = new PropertiesManager();

    public static void browserSettings() {
        String browser = PropertiesManager.getPropertiesValue("browser");

        if (browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
        }

        if (browser.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            webDriver = new FirefoxDriver();
        }

        if (browser.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            webDriver = new EdgeDriver();
        }

        if (browser.equalsIgnoreCase("Opera")) {
            WebDriverManager.chromedriver().setup();
            webDriver = new OperaDriver();
        }

        if (browser.equalsIgnoreCase("Explorer")) {
            WebDriverManager.iedriver().setup();
            webDriver = new InternetExplorerDriver();
        }

        webDriver.manage().window().maximize();
        webDriver.get(PropertiesManager.getPropertiesValue("baseUrl"));
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public static void browserTearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    public static void browserScreenShotCucumberAttachReport(Scenario scenario) {
        String dateTime = new SimpleDateFormat(" dd-MM-yyyy ").format(new Timestamp(System.currentTimeMillis()));
        String fileName = "Test Case Name - " + scenario.getName() + " - Data da execução - " + dateTime + " - Status execução - " + scenario.getStatus();

        byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", fileName);
    }

    public static void browserScreenShotSaveFile(Scenario scenario) {
        String dateTime = new SimpleDateFormat("dd-MM-yyyy").format(new Timestamp(System.currentTimeMillis()));
        String fileName = "Test Case Name - " + scenario.getName() + " - Data da execução - " + dateTime + " - Status execução - " + scenario.getStatus();

        File screenshoot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshoot, new File("test-output/" + fileName + ".png"));
        } catch (IOException e) {
            System.out.println("Ocorreu um problema ao copiar o arquivo para a pasta!\n" + e.getMessage());
        }
    }
}

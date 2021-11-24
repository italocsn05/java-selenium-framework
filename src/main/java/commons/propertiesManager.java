package commons;

import java.io.*;
import java.util.Properties;

public class propertiesManager {

    public static String getPropertiesValue(String key){
        Properties properties = new Properties();
        File file = new File("src/main/resources");
        try {
            properties.load(new FileInputStream(file.getAbsolutePath()+"/application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

    public void setPropertiesValue(String key, String value){
        Properties properties = new Properties();
        File file = new File("src/main/resources");
        try {
            FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath()+"/application.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
            FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsolutePath()+"/application.properties");
            properties.setProperty(key, value);
            properties.store(fileOutputStream, null);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

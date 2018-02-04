package parsers;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {
    private Properties prop;
    private String data;

    public PropertiesReader(String propertiesFilePath) {
        try {
            prop = new Properties();
            File file = new File(propertiesFilePath);
            FileInputStream reader = new FileInputStream(file);
            prop.load(reader);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getProperty(String propertyName) {
        data = prop.getProperty(propertyName);
        return data;
    }

}

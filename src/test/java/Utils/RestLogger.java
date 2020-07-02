package Utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RestLogger {

    private static Logger logger = null;
    private static RestLogger restLog = null;

    public static RestLogger getLogger(Class<?> T) {
        if (logger == null) {
            Properties props = new Properties();
            try {

                String envPath = System.getProperty("user.dir") +
                        File.separator + "/src/test/java/Utils/logger.properties";
                System.out.println(envPath);
                InputStream is = new FileInputStream(envPath);
                props.load(is);
            } catch (IOException e) {
                e.printStackTrace();
            }

            PropertyConfigurator.configure(props);
            logger = Logger.getLogger(T);
            restLog = new RestLogger();
        }
        return restLog;
    }



    public void info(Object msg) {
        logger.info(msg);
    }

    public void debug(Object msg) {
        logger.debug(msg);
    }

    public void warn(Object msg) {
        logger.warn(msg);
    }

    public void error(Object msg) {
        logger.error(msg);
    }
}

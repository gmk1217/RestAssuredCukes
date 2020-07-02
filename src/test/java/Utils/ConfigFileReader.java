package Utils;

import Helper.Constants;

public class ConfigFileReader {

    public String getReportConfigPath(){
        String reportConfigPath = Constants.REPORT_CONFIG;
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the config.xml file for the Key:reportConfigPath");
    }

    public String getConfigProperties(){
        String reportConfigPath = Constants.CONFIG_PROPERTIES;
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }

}

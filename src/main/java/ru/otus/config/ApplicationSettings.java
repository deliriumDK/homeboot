package ru.otus.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("application")
public class ApplicationSettings {

    private String csvFilePath;
    private String localeProp;
    private String defEncoding;
    private String bundleBasename;

    public String getCsvFilePath(){ return  csvFilePath; }
    public String getLocaleProp(){ return  localeProp; }
    public String getBundleBasename() { return bundleBasename; }
    public String getDefEncoding() { return defEncoding; }

    public void setCsvFilePath(String csvFilePath) { this.csvFilePath = csvFilePath; }
    public void setLocaleProp(String localeProp) { this.localeProp = localeProp; }
    public void setBundleBasename(String bundleBasename) { this.bundleBasename = bundleBasename; }
    public void setDefEncoding(String defEncoding) { this.defEncoding = defEncoding; }
}

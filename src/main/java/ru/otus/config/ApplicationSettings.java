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
    private String msgName;
    private String msgAge;
    private String msgError;
    private String msgResult;
    private int defaultMark;
    private int rightAnswer;
    private int[] lineOptions;
    private int lineAnswer;
    private int lineText;
    private int lineLocale;

    public String getMsgResult() { return msgResult; }
    public String getMsgError() { return msgError; }
    public String getMsgAge() { return msgAge; }
    public String getMsgName() { return msgName; }
    public String getCsvFilePath(){ return  csvFilePath; }
    public String getLocaleProp(){ return  localeProp; }
    public String getBundleBasename() { return bundleBasename; }
    public String getDefEncoding() { return defEncoding; }
    public int getDefaultMark() { return defaultMark; }
    public int getRightAnswer() { return rightAnswer; }
    public int getLineAnswer() { return lineAnswer; }
    public int getLineLocale() { return lineLocale; }
    public int getLineText() { return lineText; }
    public int[] getLineOptions() { return lineOptions; }

    public void setMsgName(String msgName) { this.msgName = msgName; }
    public void setMsgAge(String msgAge) { this.msgAge = msgAge; }
    public void setMsgError(String msgError) { this.msgError = msgError; }
    public void setMsgResult(String msgResult) { this.msgResult = msgResult; }
    public void setDefaultMark(int defaultMark) { this.defaultMark = defaultMark; }
    public void setRightAnswer(int rightAnswer) { this.rightAnswer = rightAnswer; }
    public void setCsvFilePath(String csvFilePath) { this.csvFilePath = csvFilePath; }
    public void setLocaleProp(String localeProp) { this.localeProp = localeProp; }
    public void setBundleBasename(String bundleBasename) { this.bundleBasename = bundleBasename; }
    public void setDefEncoding(String defEncoding) { this.defEncoding = defEncoding; }
    public void setLineAnswer(int lineAnswer) { this.lineAnswer = lineAnswer; }
    public void setLineLocale(int lineLocale) { this.lineLocale = lineLocale; }
    public void setLineOptions(int[] lineOptions) { this.lineOptions = lineOptions; }
    public void setLineText(int lineText) { this.lineText = lineText; }
}
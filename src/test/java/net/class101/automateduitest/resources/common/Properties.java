package net.class101.automateduitest.resources.common;

import java.util.Map;

public class Properties {
    public long timeout;
    public String browser;
    public Map<String, Url> urls;
    public Map<String, Account> accounts;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public Properties() {
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public Map<String, Url> getUrls() {
        return urls;
    }

    public void setUrls(Map<String, Url> value) {
        this.urls = value;
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, Account> value) {
        this.accounts = value;
    }

    public static class Account {

        public String id;
        public String pw;

        public String getID() {
            return id;
        }

        public void setID(String value) {
            this.id = value;
        }

        public String getPw() {
            return pw;
        }

        public void setPw(String value) {
            this.pw = value;
        }
    }

    public static class Url {

        public String dev;
        public String staging;

        public Url() {
        }

        public String getDev() {
            return dev;
        }

        public void setDev(String dev) {
            this.dev = dev;
        }

        public String getStaging() {
            return staging;
        }

        public void setStaging(String staging) {
            this.staging = staging;
        }
    }
}

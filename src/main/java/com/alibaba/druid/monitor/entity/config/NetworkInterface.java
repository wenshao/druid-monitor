package com.alibaba.druid.monitor.entity.config;

public class NetworkInterface {

    private String inetAddr;
    private String macAddr;

    /**
     * 速率
     */
    private long   rate;

    public String getInetAddr() {
        return inetAddr;
    }

    public void setInetAddr(String inetAddr) {
        this.inetAddr = inetAddr;
    }

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    public long getRate() {
        return rate;
    }

    public void setRate(long rate) {
        this.rate = rate;
    }
}
package com.alibaba.druid.monitor.entity.config;

import com.alibaba.druid.monitor.annotation.MField;

public class NetCard {

    @MField(name = "地址")
    private String inetAddr;

    @MField(name = "物理地址")
    private String macAddr;

    @MField(name = "速率", desc = "速率，单位(M)")
    private int    speed;

    @MField(name = "槽位号")
    private String slotNum;

    @MField(name = "序列号")
    private String serialNum;

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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSlotNum() {
        return slotNum;
    }

    public void setSlotNum(String slotNum) {
        this.slotNum = slotNum;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

}

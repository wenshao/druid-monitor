package com.alibaba.druid.monitor.entity.config;

import com.alibaba.druid.monitor.annotation.MField;

public class CPU {

    @MField(name = "CPU型号")
    private String model;

    @MField(name = "CPU数量")
    private int    count;

    @MField(name = "每CPU核数")
    private int    coreCount;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }
}

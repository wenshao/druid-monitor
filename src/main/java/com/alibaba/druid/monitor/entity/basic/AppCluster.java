package com.alibaba.druid.monitor.entity.basic;

import com.alibaba.druid.monitor.entity.Entity;

public class AppCluster extends Entity {

    private long appId;

    public long getAppId() {
        return appId;
    }

    public void setAppId(long appId) {
        this.appId = appId;
    }

}

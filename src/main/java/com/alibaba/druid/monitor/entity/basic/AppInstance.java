package com.alibaba.druid.monitor.entity.basic;

import com.alibaba.druid.monitor.entity.Entity;

public class AppInstance extends Entity {

    private long appId;
    private long clusterId;
    private long serverId;

    public long getAppId() {
        return appId;
    }

    public void setAppId(long appId) {
        this.appId = appId;
    }

    public long getClusterId() {
        return clusterId;
    }

    public void setClusterId(long clusterId) {
        this.clusterId = clusterId;
    }

    public long getServerId() {
        return serverId;
    }

    public void setServerId(long serverId) {
        this.serverId = serverId;
    }

}

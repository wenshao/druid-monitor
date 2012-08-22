package com.alibaba.druid.monitor.entity.config;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.druid.monitor.annotation.MType;

@MType(name = "服务器配置信息")
public class ServerConfig {

    private long             serverId;

    private OS               os;

    private List<ConfigFile> configFiles = new ArrayList<ConfigFile>();
    private List<NetCard>    netCards    = new ArrayList<NetCard>();

    public long getServerId() {
        return serverId;
    }

    public void setServerId(long serverId) {
        this.serverId = serverId;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public List<ConfigFile> getConfigFiles() {
        return configFiles;
    }

    public void setConfigFiles(List<ConfigFile> configFiles) {
        this.configFiles = configFiles;
    }

    public List<NetCard> getNetCards() {
        return netCards;
    }

    public void setNetCards(List<NetCard> netCards) {
        this.netCards = netCards;
    }

}

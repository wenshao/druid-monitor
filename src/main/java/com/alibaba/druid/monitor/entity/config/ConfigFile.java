package com.alibaba.druid.monitor.entity.config;

import com.alibaba.druid.monitor.annotation.MType;

@MType(name = "服务器配置文件")
public class ConfigFile {

    private String path;
    private String content;

    private String contentMD5;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentMD5() {
        return contentMD5;
    }

    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

}

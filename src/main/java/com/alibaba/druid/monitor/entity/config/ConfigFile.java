package com.alibaba.druid.monitor.entity.config;

/**
 * 服务器配置文件
 * 
 * @author wenshao<szujobs@hotmail.com>
 */
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

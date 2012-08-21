package com.alibaba.druid.monitor.entity.stat;

import java.util.Date;

public class JavaProcess {

    private int    pid;
    private Date   upTime;

    /**
     * 采集自sun.java.command第一个空格之前的部分
     */
    private String mainClass;

    /**
     * 采集自java.class.path
     */
    private String classPath;

    /**
     * 采集自java.vm.name
     */
    private String vmName;

    /**
     * 采集自java.version
     */
    private String javaVersion;

    private String fileEncoding;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public String getClassPath() {
        return classPath;
    }

    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    public String getVmName() {
        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public String getFileEncoding() {
        return fileEncoding;
    }

    public void setFileEncoding(String fileEncoding) {
        this.fileEncoding = fileEncoding;
    }

}

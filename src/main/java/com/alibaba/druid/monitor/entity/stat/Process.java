package com.alibaba.druid.monitor.entity.stat;

import java.util.Date;

/**
 * 服务器的进程信息
 * 
 * @author wenshao<szujobs@hotmail.com>
 */
public class Process {

    private int    pid;

    /**
     * 启动时间
     */
    private Date   upTime;

    /**
     * 用户
     */
    private String user;

    /**
     * 内存
     */
    private int    memory;

    /**
     * 虚拟内存
     */
    private int    virtaulMemory;

    private float  cpuRate;

    private String tty;

    private String command;

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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getVirtaulMemory() {
        return virtaulMemory;
    }

    public void setVirtaulMemory(int virtaulMemory) {
        this.virtaulMemory = virtaulMemory;
    }

    public float getCpuRate() {
        return cpuRate;
    }

    public void setCpuRate(float cpuRate) {
        this.cpuRate = cpuRate;
    }

    public String getTty() {
        return tty;
    }

    public void setTty(String tty) {
        this.tty = tty;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

}

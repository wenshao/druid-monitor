package com.alibaba.druid.monitor.entity.stat;

public class NetStat {

    private String protocol;
    private String local;
    private String remote;
    private String status;
    private int    pid;
    private String program;
    private String user;

    /**
     * 发送队列
     */
    private int    recvQ;
    /**
     * 接收对列
     */
    private int    sendQ;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getRemote() {
        return remote;
    }

    public void setRemote(String remote) {
        this.remote = remote;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getRecvQ() {
        return recvQ;
    }

    public void setRecvQ(int recvQ) {
        this.recvQ = recvQ;
    }

    public int getSendQ() {
        return sendQ;
    }

    public void setSendQ(int sendQ) {
        this.sendQ = sendQ;
    }

}

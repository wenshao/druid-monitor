package com.alibaba.druid.monitor.entity.stat;

import java.util.Date;

public class DruidDataSourceStat {

    private long physicalConnectCount;
    private long physicalCloseCount;
    private long physicalConnectErrorCount;
    private long physicalConnectTimeMillis;
    private Date physicalConnectLastErrorTime;

    private long logicConnectCount;
    private long logicCloseCount;
    private long logicConnectErrorCount;

    private long commitCount;
    private long rollbackCount;

    private long activeCount;
    private long poolingCount;
    private int  waitThreadCount;
    private long notEmptyWaitCount;

    private long pscacheAccessCount;
    private long pscacheHitCount;
    private long pscacheMissCount;
    private long pscacheCount;

    private long errorCount;
    private Date errorLastTime;

    public long getPhysicalConnectCount() {
        return physicalConnectCount;
    }

    public void setPhysicalConnectCount(long physicalConnectCount) {
        this.physicalConnectCount = physicalConnectCount;
    }

    public long getPhysicalCloseCount() {
        return physicalCloseCount;
    }

    public void setPhysicalCloseCount(long physicalCloseCount) {
        this.physicalCloseCount = physicalCloseCount;
    }

    public long getPhysicalConnectErrorCount() {
        return physicalConnectErrorCount;
    }

    public void setPhysicalConnectErrorCount(long physicalConnectErrorCount) {
        this.physicalConnectErrorCount = physicalConnectErrorCount;
    }

    public long getPhysicalConnectTimeMillis() {
        return physicalConnectTimeMillis;
    }

    public void setPhysicalConnectTimeMillis(long physicalConnectTimeMillis) {
        this.physicalConnectTimeMillis = physicalConnectTimeMillis;
    }

    public Date getPhysicalConnectLastErrorTime() {
        return physicalConnectLastErrorTime;
    }

    public void setPhysicalConnectLastErrorTime(Date physicalConnectLastErrorTime) {
        this.physicalConnectLastErrorTime = physicalConnectLastErrorTime;
    }

    public long getLogicConnectCount() {
        return logicConnectCount;
    }

    public void setLogicConnectCount(long logicConnectCount) {
        this.logicConnectCount = logicConnectCount;
    }

    public long getLogicCloseCount() {
        return logicCloseCount;
    }

    public void setLogicCloseCount(long logicCloseCount) {
        this.logicCloseCount = logicCloseCount;
    }

    public long getLogicConnectErrorCount() {
        return logicConnectErrorCount;
    }

    public void setLogicConnectErrorCount(long logicConnectErrorCount) {
        this.logicConnectErrorCount = logicConnectErrorCount;
    }

    public long getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(long commitCount) {
        this.commitCount = commitCount;
    }

    public long getRollbackCount() {
        return rollbackCount;
    }

    public void setRollbackCount(long rollbackCount) {
        this.rollbackCount = rollbackCount;
    }

    public long getActiveCount() {
        return activeCount;
    }

    public void setActiveCount(long activeCount) {
        this.activeCount = activeCount;
    }

    public long getPoolingCount() {
        return poolingCount;
    }

    public void setPoolingCount(long poolingCount) {
        this.poolingCount = poolingCount;
    }

    public int getWaitThreadCount() {
        return waitThreadCount;
    }

    public void setWaitThreadCount(int waitThreadCount) {
        this.waitThreadCount = waitThreadCount;
    }

    public long getNotEmptyWaitCount() {
        return notEmptyWaitCount;
    }

    public void setNotEmptyWaitCount(long notEmptyWaitCount) {
        this.notEmptyWaitCount = notEmptyWaitCount;
    }

    public long getPscacheAccessCount() {
        return pscacheAccessCount;
    }

    public void setPscacheAccessCount(long pscacheAccessCount) {
        this.pscacheAccessCount = pscacheAccessCount;
    }

    public long getPscacheHitCount() {
        return pscacheHitCount;
    }

    public void setPscacheHitCount(long pscacheHitCount) {
        this.pscacheHitCount = pscacheHitCount;
    }

    public long getPscacheMissCount() {
        return pscacheMissCount;
    }

    public void setPscacheMissCount(long pscacheMissCount) {
        this.pscacheMissCount = pscacheMissCount;
    }

    public long getPscacheCount() {
        return pscacheCount;
    }

    public void setPscacheCount(long pscacheCount) {
        this.pscacheCount = pscacheCount;
    }

    public long getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(long errorCount) {
        this.errorCount = errorCount;
    }

    public Date getErrorLastTime() {
        return errorLastTime;
    }

    public void setErrorLastTime(Date errorLastTime) {
        this.errorLastTime = errorLastTime;
    }

}

package com.alibaba.druid.monitor.entity.basic;

import java.util.Date;

/**
 * @author wenshao<szujobs@hotmail.com>
 */
public class AppFollower {

    private long appId;
    private long followerId;

    private Date createdTime;

    public long getAppId() {
        return appId;
    }

    public void setAppId(long appId) {
        this.appId = appId;
    }

    public long getFollowerId() {
        return followerId;
    }

    public void setFollowerId(long followerId) {
        this.followerId = followerId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

}

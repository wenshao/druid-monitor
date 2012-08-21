package com.alibaba.druid.monitor.entity;

public class App extends Entity {

    /**
     * ownerId可能是UserId或者OrganizationId
     */
    private long   ownerId;

    private String description;

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

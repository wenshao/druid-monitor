package com.alibaba.druid.monitor.entity.stat;

import com.alibaba.fastjson.annotation.JSONField;

public class ThrowableInfo {

    @JSONField(name = "Class")
    private String type;

    @JSONField(name = "Message")
    private String message;

    @JSONField(name = "StackTrace")
    private String stackTrace;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

}

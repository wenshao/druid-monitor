package com.alibaba.druid.monitor.service;

public class SequenceService {

    public final static String SEQ_USER = "user.id";

    public long generateId(String sequenceName) {
        throw new UnsupportedOperationException();
    }

    public long generateUserId() {
        return generateId(SEQ_USER);
    }
}

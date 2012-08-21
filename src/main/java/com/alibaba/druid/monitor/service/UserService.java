package com.alibaba.druid.monitor.service;

import java.util.Date;

import com.alibaba.druid.monitor.dao.UserMapper;
import com.alibaba.druid.monitor.entity.User;

public class UserService {

    private SequenceService sequenceService;

    private UserMapper      userMapper;

    public SequenceService getSequenceService() {
        return sequenceService;
    }

    public void setSequenceService(SequenceService sequenceService) {
        this.sequenceService = sequenceService;
    }

    public User createUser(String name, String email, String password) {
        long id = sequenceService.generateUserId();

        String digestedPassword = passwordDigest(password);

        User user = new User();

        user.setId(id);
        user.setName(name);
        user.setEmail(email);
        user.setPassword(digestedPassword);

        user.setCreatedTime(new Date());
        user.setLastModified(user.getCreatedTime());

        userMapper.addUser(user);

        return user;
    }

    public String passwordDigest(String password) {
        throw new UnsupportedOperationException();
    }
}

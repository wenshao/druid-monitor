package com.alibaba.druid.monitor.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.alibaba.druid.monitor.entity.User;

public interface UserMapper {

    @Insert("insert into t_User (id, name, password, email, lastModified, createdTime) " + //
            "values (#{user.id}, #{user.name}, #{user.password}, #{user.email}, #{user.lastModified}, #{user.createdTime})")
    void addUser(@Param("user") User user);
}

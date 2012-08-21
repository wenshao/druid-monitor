package com.alibaba.druid.monitor.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.alibaba.druid.monitor.entity.User;

public interface UserMapper {

    @Insert(value = "insert into t_User (id, name) values (#{user.id}, #{user.name})")
    void addUser(@Param("user") User user);
}

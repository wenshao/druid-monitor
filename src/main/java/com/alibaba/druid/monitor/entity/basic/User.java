package com.alibaba.druid.monitor.entity.basic;

import com.alibaba.druid.monitor.entity.Entity;

/**
 * @author wenshao<szujobs@hotmail.com>
 */
public class User extends Entity {

    private String email;

    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

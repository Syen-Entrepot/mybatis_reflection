package com.cn.pojo;

import java.io.Serializable;

/**
 * @author Syen
 * @date 2019/7/22 0022-上午 1:27
 */
public class UserDetail implements Serializable {
    private Integer id;

    //oop写法
    private User user;

    private String address;

    private String cid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", cid='" + cid + '\'' +
                '}';
    }
}

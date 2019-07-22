package com.cn.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Syen
 * @date 2019/7/22 0022-上午 1:21
 */
/*Serializable序列化*/
public class User implements Serializable {
    private Integer id;
    private String phone;
    private String password;
    private Date creatdate;
    private Integer states;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(Date creatdate) {
        this.creatdate = creatdate;
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", creatdate=" + creatdate +
                ", states=" + states +
                '}';
    }
}

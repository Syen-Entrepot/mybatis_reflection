package com.cn.pojo;

/**
 * @author Syen
 * @date 2019/7/22 0022-上午 1:33
 */
public class UserWithDetail extends User {


    private UserDetail userDetail;

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", phone='" + getPhone() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", creatdate=" + getCreatdate() +
                ", states=" + getStates() +
                '}'+"UserWithDetail{" +
                "userDetail=" + userDetail +
                '}';
    }
}

package com.bjpowernode.pojo;

public class User {
    private Integer userId;
    private String uName;
    private String uPass;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", uName='" + uName + '\'' +
                ", uPass='" + uPass + '\'' +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }

    public User() {
    }

    public User(Integer userId, String uName, String uPass) {
        this.userId = userId;
        this.uName = uName;
        this.uPass = uPass;
    }
}

package com.study.pojo;

public class User {
    private String userId;
    private String cardType;
    private String cardNo;
    private String userName;
    private String userSex;
    private Integer useAge;
    private String useRole;

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", useAge=" + useAge +
                ", useRole='" + useRole + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Integer getUseAge() {
        return useAge;
    }

    public void setUseAge(Integer useAge) {
        this.useAge = useAge;
    }

    public String getUseRole() {
        return useRole;
    }

    public void setUseRole(String useRole) {
        this.useRole = useRole;
    }

    public User(String userId, String cardType, String cardNo, String userName, String userSex, Integer useAge, String useRole) {
        this.userId = userId;
        this.cardType = cardType;
        this.cardNo = cardNo;
        this.userName = userName;
        this.userSex = userSex;
        this.useAge = useAge;
        this.useRole = useRole;
    }

    public User() {
    }
}

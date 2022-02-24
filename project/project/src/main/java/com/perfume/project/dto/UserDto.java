package com.perfume.project.dto;

public class UserDto {

    private String userName;
    private String userId;
    private String userPw;
    private String userZipcode;
    private String userAddress;
    private String userBirth;
    private String userGender;
    private String userTel;

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public String getUserId() {

        return userId;
    }

    public void setUserId(String userId) {

        this.userId = userId;
    }

    public String getUserPw() {

        return userPw;
    }

    public void setUserPw(String userPw) {

        this.userPw = userPw;
    }

    public String getUserZipcode() {

        return userZipcode;
    }

    public void setUserZipcode(String userZipcode) {

        this.userZipcode = userZipcode;
    }

    public String getUserAddress() {

        return userAddress;
    }

    public void setUserAddress(String userAddress) {

        this.userAddress = userAddress;
    }

    public String getUserBirth() {

        return userBirth;
    }

    public void setUserBirth(String userBirth) {

        this.userBirth = userBirth;
    }

    public String getUserGender() {

        return userGender;
    }

    public void setUserGender(String userGender) {

        this.userGender = userGender;
    }

    public String getUserTel() {

        return userTel;
    }

    public void setUserTel(String userTel) {

        this.userTel = userTel;
    }

    public String toString() {

        return "UserDto [userName=" + userName + "userId=" + userId + "userPw=" + userPw + "userZipcode=" + userZipcode +"userAddress=" + userAddress +"userBirth=" + userBirth +"userGender=" + userGender +"userTel=" + userTel +"]";
    }
}

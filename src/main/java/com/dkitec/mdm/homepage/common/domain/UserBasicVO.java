package com.dkitec.mdm.homepage.common.domain;

public class UserBasicVO {
    private String userId;
    private String userName;
    private int loginFailed;
    private String password;
    private String activation;
    private String token;
    private String regId;
    private String tabLoginFlag;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLoginFailed() {
        return loginFailed;
    }

    public void setLoginFailed(int loginFailed) {
        this.loginFailed = loginFailed;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getTabLoginFlag() {
        return tabLoginFlag;
    }

    public void setTabLoginFlag(String tabLoginFlag) {
        this.tabLoginFlag = tabLoginFlag;
    }
}

package uestc.pojo;

public class UserLog {
    private int ULuserID;

    private  String userLoginTime;

    private String userIpAddress;

    public int getULuserID() {
        return ULuserID;
    }

    public void setULuserID(int ULuserID) {
        this.ULuserID = ULuserID;
    }

    public String getUserIpAddress() {
        return userIpAddress;
    }

    public void setUserIpAddress(String userIpAddress) {
        this.userIpAddress = userIpAddress;
    }

    public String getUserLoginTime() {
        return userLoginTime;
    }

    public void setUserLoginTime(String userLoginTime) {
        this.userLoginTime = userLoginTime;
    }
}

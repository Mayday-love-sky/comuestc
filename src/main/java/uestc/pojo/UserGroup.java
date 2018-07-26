package uestc.pojo;

public class UserGroup {
    private int UGgroupID;

    private int UGuserID;

    private String userJoinTime;

    private String userType;

    public int getUGgroupID() {
        return UGgroupID;
    }

    public void setUGgroupID(int UGgroupID) {
        this.UGgroupID = UGgroupID;
    }

    public int getUGuserID() {
        return UGuserID;
    }

    public void setUGuserID(int UGuserID) {
        this.UGuserID = UGuserID;
    }

    public String getUserJoinTime() {
        return userJoinTime;
    }

    public void getUserJoinTime(String userJoinTime) {
        this.userJoinTime = userJoinTime;
    }

    public String getUserType() {
        return userType;
    }

    public void getUserType(String userType) {
        this.userType = userType;
    }
}

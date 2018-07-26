package uestc.pojo;

public class UserActivity {
    private int UAactID;

    private int UAuserID;

    private String userActJoinTime;

    private String userActType;

    public int getUAactID() {
        return UAactID;
    }

    public void setUAactID(int UAactID) {
        this.UAactID = UAactID;
    }

    public int getUAuserID() {
        return UAuserID;
    }

    public void setUAuserID(int UAuserID) {
        this.UAuserID = UAuserID;
    }

    public String getUserActJoinTime() {
        return userActJoinTime;
    }

    public void getUserActJoinTime(String userActJoinTime) {
        this.userActJoinTime = userActJoinTime;
    }

    public String getUserActType() {
        return userActType;
    }

    public void getUserActType(String userActType) {
        this.userActType = userActType;
    }
}

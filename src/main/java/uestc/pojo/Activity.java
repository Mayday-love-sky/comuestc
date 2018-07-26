package uestc.pojo;

public class Activity {
    //数据库自动生成，用于标识活动
    private int actID;

    private String actName;

    private String actDescripation;

    private int actOwner;

    private String actCreateTime;

    private int actGroupID;

    public int getActID() {
        return actID;
    }

    public void setActID(int actID) {
        this.actID = actID;
    }

    public String getActName() {
        return actName;
    }

    public void getActName(String groupName) {
        this.actName = actName;
    }

    public String getActDescripation() {
        return actDescripation;
    }

    public void setActDescripation(String actDescripation) {
        this.actDescripation = actDescripation;
    }

    public String getActCreateTime() {
        return actCreateTime;
    }

    public void setActCreateTime(String actCreateTime) {
        this.actCreateTime = actCreateTime;
    }

    public int getActOwner() { return actOwner; }

    public void setActOwner(int actOwner) { this.actOwner = actOwner; }

    public int getActGroupID(){ return actGroupID;}

    public void setActGroupID(int actGroupID) { this.actGroupID = actGroupID; }
}

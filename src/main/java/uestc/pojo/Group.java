package uestc.pojo;

public class Group {
    //数据库自动生成，用于标识圈子
    private int groupID;

    private String groupName;

    private int groupOwner;

    private String groupType;

    private String groupDescripation;

    private String groupCreateTime;

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void getGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getGroupDescripation() {
        return groupDescripation;
    }

    public void setGroupDescripation(String groupDescripation) {
        this.groupDescripation = groupDescripation;
    }

    public String getGroupCreateTime() {
        return groupCreateTime;
    }

    public void setGroupCreateTime(String groupCreateTime) {
        this.groupCreateTime = groupCreateTime;
    }

    public int getGroupOwner() {
        return groupOwner;
    }

    public void setGroupOwner(int groupOwner) {
        this.groupOwner = groupOwner;
    }
}

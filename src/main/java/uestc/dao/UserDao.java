package uestc.dao;

import uestc.pojo.User;

public interface UserDao {

    //查找用户
    int hasUser(User user);
    //更新用户

    //新建用户
    int insertUser(User user);

    //删除用户


}

package uestc.serivice;

import uestc.pojo.Response.loginResponse;
import uestc.pojo.User;
import uestc.pojo.Response.registerResponse;

//用户服务类接口
public interface UserService {

    registerResponse addUser(User user);

    loginResponse loginUser(User user);
}

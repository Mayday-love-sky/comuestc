package uestc.serivice;

import uestc.pojo.User;
import uestc.pojo.registerResponse;

//用户服务类接口
public interface UserService {

    registerResponse addUser(User user);


}

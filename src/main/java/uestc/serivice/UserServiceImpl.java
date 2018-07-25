package uestc.serivice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uestc.dao.UserDao;
import uestc.pojo.User;
import uestc.pojo.registerResponse;


@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public registerResponse addUser(User user) {

        int status=userDao.insert(user);
        //简要的具体步骤
        //1.调用Service层的用户注册逻辑
        //2.返回响应 例如规定：注册成功：1 账户名存在：2 密码格式有误：3
        registerResponse registerResponse=new registerResponse();
        if(status==1){
            registerResponse.setStatus(101);
        }
        registerResponse.setResponseMessage("注册成功");
        return registerResponse;
    }
}

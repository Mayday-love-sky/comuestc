package uestc.serivice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uestc.dao.UserDao;
import uestc.pojo.User;
import uestc.pojo.registerResponse;


@Service(value = "userService")
public class UserServiceImpl implements UserService {
    //响应码
    //100：账户已存在，无法注册
    //1：注册成功
    private static int ACCOUNT_EXISTS=100;
    private static int REGISTER_SUCCESS=1;

    @Autowired
    UserDao userDao;

    @Override
    public registerResponse addUser(User user) {

        int status=0;
        int hasUser=userDao.hasUser(user);
        if(hasUser!=0){
            //100代表账户已存在，无法注册
            status=ACCOUNT_EXISTS;
        }else{
            status=userDao.insertUser(user);
        }
        //简要的具体步骤
        //1.调用Service层的用户注册逻辑
        //2.返回响应 例如规定：注册成功：1 账户名存在：2 密码格式有误：3
        registerResponse registerResponse=new registerResponse();
        if(status==REGISTER_SUCCESS){
            registerResponse.setStatus(REGISTER_SUCCESS);
            registerResponse.setResponseMessage("注册成功");
        }else if(status==ACCOUNT_EXISTS){
            registerResponse.setStatus(ACCOUNT_EXISTS);
            registerResponse.setResponseMessage("账户已存在");
        }
        return registerResponse;
    }
}

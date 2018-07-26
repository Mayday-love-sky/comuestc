package uestc.serivice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uestc.dao.UserDao;
import uestc.pojo.Response.loginResponse;
import uestc.pojo.Response.registerResponse;
import uestc.pojo.User;
import uestc.pojo.statsAccount;


@Service(value = "userService")
public class UserServiceImpl implements UserService {
    //响应码
    //100：账户已存在，无法注册
    //1：注册成功


    @Autowired
    UserDao userDao;

    @Override
    public registerResponse addUser(User user) {

        int status=0;
        int hasUser=userDao.hasUser(user);
        if(hasUser!=0){
            //100代表账户已存在，无法注册
            status=statsAccount.ACCOUNT_EXISTS;
        }else{
            status=userDao.insertUser(user);
        }
        //简要的具体步骤
        //1.调用Service层的用户注册逻辑
        //2.返回响应 例如规定：注册成功：1 账户名存在：2 密码格式有误：3
        registerResponse registerResponse=new registerResponse();
        if(status==statsAccount.REGISTER_SUCCESS){
            registerResponse.setStatus(statsAccount.REGISTER_SUCCESS);
            registerResponse.setResponseMessage("注册成功");
        }else if(status==statsAccount.ACCOUNT_EXISTS){
            registerResponse.setStatus(statsAccount.ACCOUNT_EXISTS);
            registerResponse.setResponseMessage("账户已存在");
        }
        return registerResponse;
    }

    @Override
    public loginResponse loginUser(User user) {
        int status=0;
        int hasUser=userDao.hasUser(user);
        int checkUser=userDao.checkUser(user);
        if(hasUser ==0){
            //103代表账户不存在
            status=statsAccount.ACCOUNT_UNEXISTS;
        }
        else if (checkUser ==0){
            //102代表密码错误
            status=statsAccount.PASSWORD_WRONG;
        }
        else {
            //1000代表登录成功
            status=statsAccount.LOGIN_SUCCESS;
        }

        loginResponse loginResponse=new loginResponse();
        if(status==statsAccount.LOGIN_SUCCESS){
            loginResponse.setStatus(statsAccount.LOGIN_SUCCESS);
            loginResponse.setResponseMessage("登录成功");
        }else if(status==statsAccount.ACCOUNT_UNEXISTS){
            loginResponse.setStatus(statsAccount.ACCOUNT_EXISTS);
            loginResponse.setResponseMessage("账户不存在");
        }else if(status==statsAccount.PASSWORD_WRONG){
            loginResponse.setStatus(statsAccount.PASSWORD_WRONG);
            loginResponse.setResponseMessage("密码错误");
        }
        return loginResponse;
    }
}

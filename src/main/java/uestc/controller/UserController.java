package uestc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import uestc.pojo.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @PostMapping("/user")
    public @ResponseBody int  userRegister(User user){
        //控制层接受前端通过URL发出的请求
        //调用Service层进行逻辑处理
        //根据Service层的处理结果返回相应的响应信息


        //简要的具体步骤
        //1.检查请求的数据合法性，如用户名的长度、格式、是否为空等等，所有的数据均需要做检测
        //2.调用Service层的用户注册逻辑
        //3.返回响应 例如规定：注册成功：1 账户名存在：2 密码格式有误：3
        return 1;
    }
}

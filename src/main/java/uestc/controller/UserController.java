package uestc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import uestc.pojo.Response.loginResponse;
import uestc.pojo.Response.registerResponse;
import uestc.pojo.User;
import uestc.pojo.statsAccount;
import uestc.serivice.UserService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    //数组非法的响应码

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public @ResponseBody
    registerResponse userRegister(@RequestBody@Valid User user, BindingResult result){
        //控制层接受前端通过URL发出的请求
        //首先进行数据检验
        if(result.hasErrors()){
            List<ObjectError> list=result.getAllErrors();
            FieldError error=(FieldError)list.get(0);
            System.out.println(error.getObjectName()+","+error.getField()+","+error.getDefaultMessage());
            registerResponse registerResponse=new registerResponse();
            //如果数据校验不通过，则响应码为：101   响应信息为:错误信息
            registerResponse.setStatus(statsAccount.INVALID_DATA);
            registerResponse.setResponseMessage(error.getDefaultMessage());
            return registerResponse;
        }
        //调用Service层进行逻辑处理
        //根据Service层的处理结果返回相应的响应信息
            return userService.addUser(user);
    }

    @PostMapping("/login")
    public @ResponseBody loginResponse userLogin(@RequestBody@Valid User user, BindingResult result){
        //控制层接受前端通过URL发出的请求
        //首先进行数据检验
        if(result.hasErrors()){
            List<ObjectError> list=result.getAllErrors();
            FieldError error=(FieldError)list.get(0);
            System.out.println(error.getObjectName()+","+error.getField()+","+error.getDefaultMessage());
            loginResponse loginResponse=new loginResponse();
            //如果数据校验不通过，则响应码为：101   响应信息为:错误信息
            loginResponse.setStatus(statsAccount.INVALID_DATA);
            loginResponse.setResponseMessage(error.getDefaultMessage());
            return loginResponse;
        }
        //调用Service层进行逻辑处理
        //根据Service层的处理结果返回相应的响应信息
        return userService.loginUser(user);

    }
}

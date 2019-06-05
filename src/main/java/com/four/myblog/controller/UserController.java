package com.four.myblog.controller;

import com.four.myblog.entity.User;
import com.four.myblog.service.UserService;
import com.four.myblog.utils.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/4 20:28
 */
@RestController
@RequestMapping({"/user"})
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping({"/register"})
    public RestResult register(User user, HttpSession session) {
        System.out.println(user);
        int n = this.userService.insertUser(user);
        if (n != 0) {
            session.setAttribute("user", user);
            return new RestResult(RestResult.SUCCESS,user);
        } else {
            return new RestResult(RestResult.FAILED,"用户名已存在,请重新输入");
        }
    }

    @RequestMapping(
            value = {"/login"},
            method = {RequestMethod.POST}
    )
    public RestResult login(String username, String password, HttpSession session) {
        User user = this.userService.checkLogin(username, password);
        if (user == null) {
            return new RestResult(RestResult.SUCCESS,"用户名/密码错误");
        } else {
            session.setAttribute("user", user);
            return new RestResult(RestResult.FAILED,"登录成功", user);
        }
    }
}

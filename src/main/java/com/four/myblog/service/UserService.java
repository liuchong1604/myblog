package com.four.myblog.service;

import com.four.myblog.entity.User;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/4 20:40
 */
public interface UserService {
    User checkLogin(String username, String password);

    int insertUser(User user);
}

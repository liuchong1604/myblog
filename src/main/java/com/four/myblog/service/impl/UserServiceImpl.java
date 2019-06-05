package com.four.myblog.service.impl;

import com.four.myblog.entity.User;
import com.four.myblog.mapper.UserMapper;
import com.four.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/4 20:40
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User checkLogin(String username, String password) {
        return this.userMapper.findFirstByNameAndPassword(username, password);
    }

    public int insertUser(User user) {
        User user1 = this.userMapper.findUserByName(user);
        if (user1 == null) {
            int n = this.userMapper.insertUser(user);
            return n;
        } else {
            return 0;
        }
    }
}

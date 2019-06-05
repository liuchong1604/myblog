package com.four.myblog.mapper;

import com.four.myblog.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/4 20:37
 */
@Repository("userMapper")
@Mapper
public interface UserMapper {
    @Select({"select * from user where username=#{username} and password=#{password}"})
    User findFirstByNameAndPassword(String username, String password);

    @Insert({"insert into user(username,password) values(#{username},#{password})"})
    int insertUser(User user);

    @Select({"select * from user where username=#{username}"})
    User findUserByName(User user);
}

package com.four.myblog.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/4 20:27
 */
@Entity
public class User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id;

    @NotNull(
            message = "用户名不能为空"
    )
    @Size(
            min = 5,
            max = 20,
            message = "用户名应设为5到20位"
    )
    @Column(
            unique = true,
            name = "username",
            nullable = false
    )
    private String username;
    @NotNull(
            message = "密码不能为空"
    )
    @Size(
            min = 6,
            max = 18,
            message = "密码应设为6到18位"
    )
    @Column(
            name = "password",
            nullable = false
    )
    private String password;

    public User() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String usename) {
        this.username = usename;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{id=" + this.id + ", username='" + this.username + '\'' + ", password='" + this.password + '\'' + '}';
    }
}

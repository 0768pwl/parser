package com.cz.pwl.parser.dao.user.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 描述:系统用户实体
 *
 * @author panwl
 * @create 2018-07-07
 */
@Entity
@Table(name = "t_user")
public class UserEntity implements Serializable {

    /**
     * 用户id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    @Basic
    @Column(name = "username")
    private String username;

    /**
     * 用户密码
     */
    @Basic
    @Column(name = "password")
    private String password;

    /**
     * 最后登录时间
     */
    @Basic
    @Column(name = "last_login_time")
    private Integer lastLoginTime;

    /**
     * 修改时间
     */
    @Basic
    @Column(name = "update_time")
    private Integer updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Integer lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}

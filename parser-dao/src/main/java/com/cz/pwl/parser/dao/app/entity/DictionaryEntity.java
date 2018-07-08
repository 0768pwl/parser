package com.cz.pwl.parser.dao.app.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 描述:字典表实体
 *
 * @author panwl
 * @create 2018-07-08
 */
@Entity
@Table(name = "t_dictionary")
public class DictionaryEntity implements Serializable {

    /**
     * 字典Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 字典标识
     */
    @Basic
    @Column(name = "code")
    private String code;

    /**
     * 字典值
     */
    @Basic
    @Column(name = "value")
    private String value;

    /**
     * 是否删除
     */
    @Basic
    @Column(name = "status")
    private Integer status;

    /**
     * 创建时间
     */
    @Basic
    @Column(name = "create_time")
    private Integer createTime;

    /**
     * 更新时间
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}

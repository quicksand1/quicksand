package com.quicksand.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sys_role")
public class SysRole {
    private Long id;

    private String name;

    private Integer status;

    private Boolean isAffect;

    private Date createTime;

    private Long createUser;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getIsaffect() {
        return isAffect;
    }

    public void setIsaffect(Boolean isaffect) {
        this.isAffect = isaffect;
    }

    public Date getCreatetime() {
        return createTime;
    }

    public void setCreatetime(Date createtime) {
        this.createTime = createtime;
    }

    public Long getCreateuser() {
        return createUser;
    }

    public void setCreateuser(Long createuser) {
        this.createUser = createuser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
package com.itstudy.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
    public Integer id;
    public String username;
    public String password;
    public String name;
    public Short gender;
    public String image;
    public Short job;
    public LocalDate entrydate;
    public Integer deptId;
    public LocalDateTime createTime;
    public LocalDateTime updateTime;

    public User() {
    }

    public User(Integer id, String username, String password, String name, Short gender, String image, Short job, LocalDate entrydate, Integer deptId, LocalDateTime createTime, LocalDateTime updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.image = image;
        this.job = job;
        this.entrydate = entrydate;
        this.deptId = deptId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return gender
     */
    public Short getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(Short gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取
     * @return job
     */
    public Short getJob() {
        return job;
    }

    /**
     * 设置
     * @param job
     */
    public void setJob(Short job) {
        this.job = job;
    }

    /**
     * 获取
     * @return entrydate
     */
    public LocalDate getEntrydate() {
        return entrydate;
    }

    /**
     * 设置
     * @param entrydate
     */
    public void setEntrydate(LocalDate entrydate) {
        this.entrydate = entrydate;
    }

    /**
     * 获取
     * @return deptId
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 设置
     * @param deptId
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取
     * @return createTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置
     * @param createTime
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取
     * @return updateTime
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置
     * @param updateTime
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", password = " + password + ", name = " + name + ", gender = " + gender + ", image = " + image + ", job = " + job + ", entrydate = " + entrydate + ", deptId = " + deptId + ", createTime = " + createTime + ", updateTime = " + updateTime + "}";
    }
}

package com.clean.study.chapter03.java;

import com.clean.study.chapter03.Role;

import java.time.Instant;

public class Account {
    private String id;
    private String name;
    private String phone;
    private Role role;
    private String company;
    private Long createAt = Instant.now().toEpochMilli();
    private Long updateAt = Instant.now().toEpochMilli();

    public Account(String name, String phone, Role role) {
        this.name = name;
        this.phone = phone;
        this.role = role;
    }

    public Account(String name, String phone, Role role, String company) {
        this.name = name;
        this.phone = phone;
        this.role = role;
        this.company = company;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }
}

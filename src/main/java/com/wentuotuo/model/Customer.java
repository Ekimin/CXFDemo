package com.wentuotuo.model;

import java.util.Date;

/**
 * Created by Ekimin on 2017/7/21.
 */
public class Customer {
    private String id;
    private String name;
    private Date birthday;

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

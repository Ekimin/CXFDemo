package com.wentuotuo.impl;

import com.wentuotuo.service.HelloWorld;

/**
 * Created by Ekimin on 2017/7/21.
 */
public class HellowWorldImpl implements HelloWorld {
    public String sayHi(String text) {
        String msg = "HHHHHHellow, " + text;
        return msg;
    }
}

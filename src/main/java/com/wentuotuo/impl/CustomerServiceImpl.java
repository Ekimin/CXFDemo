package com.wentuotuo.impl;

import com.wentuotuo.model.Customer;
import com.wentuotuo.service.CustomerService;

import java.util.Date;

/**
 * Created by Ekimin on 2017/7/21.
 */
public class CustomerServiceImpl implements CustomerService {
    public Customer getCustomer(String id) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setBirthday(new Date());
        customer.setName("customer" + id);
        return customer;
    }
}

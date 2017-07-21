package com.wentuotuo.service;

import com.wentuotuo.model.Customer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by Ekimin on 2017/7/21.
 */
@WebService
public interface CustomerService {
    @WebMethod
    @WebResult
    Customer getCustomer(@WebParam String id);
}

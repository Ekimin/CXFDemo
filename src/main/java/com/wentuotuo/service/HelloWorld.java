package com.wentuotuo.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by Ekimin on 2017/7/21.
 */
@WebService
public interface HelloWorld {
    @WebMethod
    @WebResult
    String sayHi(@WebParam String text);
}

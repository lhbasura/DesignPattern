package com.example.webservice.service.impl;

import com.example.webservice.service.HelloService;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Component
public class HelloServiceImpl implements HelloService {
    @WebMethod
    @Override
    public String sayHello(@WebParam(name="name") String name) {
        return "hello " + name;
    }
}

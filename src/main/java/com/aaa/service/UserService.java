package com.aaa.service;

import com.aaa.entity.Car;
import com.aaa.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface UserService {

    @WebMethod
    public String sayHello(String name);

    @WebMethod
    public List<Car> findCarsByUser(User user);

}

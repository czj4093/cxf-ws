package com.aaa.cxf;

import com.aaa.service.UserService;
import com.aaa.service.UserServiceImpl;

import javax.xml.ws.Endpoint;

public class Server {

    public static void main(String[] args) {
        // 使用CXF 将 UserService服务 注册到网络上
        // 1 、 服务实现对象
        UserService userService = new UserServiceImpl();
        // 2、 发布服务地址
        String address = "http://localhost:9999/userService";
        // 3、 发布服务
        Endpoint.publish(address, userService);
        System.out.println("服务已经启动...");
    }

}

package com.aaa.cxf;

import com.chenzejin.entity.User;
import com.chenzejin.service.UserService;
import org.apache.cxf.ext.logging.LoggingInInterceptor;
import org.apache.cxf.ext.logging.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {

    public static void main(String[] args) {
        // 编写客户端 调用发布WebService服务
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(UserService.class);
        jaxWsProxyFactoryBean.setAddress("http://localhost:9999/userService");

        jaxWsProxyFactoryBean.getInInterceptors().add(
                new LoggingInInterceptor());
        jaxWsProxyFactoryBean.getOutInterceptors().add(
                new LoggingOutInterceptor());

        // 创建调用远程服务代理对象
        UserService proxy = (UserService) jaxWsProxyFactoryBean.create();
        // 调用代理对象 任何一个方法，都将通过网络 调用web服务
        System.out.println(proxy.sayHello("陈泽进"));

        User user = new User();
        user.setUsername("xiaoming");
        System.out.println(proxy.findCarsByUser(user));
    }

}

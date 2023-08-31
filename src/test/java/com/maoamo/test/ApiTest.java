package com.maoamo.test;

import com.maoamo.test.bean.UserService;
import com.maomao.BeanDefinition;
import com.maomao.BeanFactory;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory(){
        //1.初始化beanfactory
        BeanFactory beanFactory=new BeanFactory();

        //2.注册bean
        BeanDefinition beanDefinition=new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}

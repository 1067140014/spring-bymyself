package com.maomao;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//bean工厂
public class BeanFactory {
    //创建一个hashmap用来存放bean
    private Map<String,BeanDefinition> beanDefinitionMap=new ConcurrentHashMap<>();

    //通过名字获取bean
    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    //通过名字注册bean
    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }



}

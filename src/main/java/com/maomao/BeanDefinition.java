package com.maomao;

//bean定义
public class BeanDefinition {

    private Object bean;

    //代参构造方法
    public BeanDefinition(Object bean){
        this.bean=bean;
    }

    //获取当前bean
    public Object getBean(){
        return bean;
    }
}

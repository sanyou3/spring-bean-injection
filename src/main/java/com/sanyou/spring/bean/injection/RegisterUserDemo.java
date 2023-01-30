package com.sanyou.spring.bean.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author yisuan
 * @date 2023/1/29 23:45
 */
public class RegisterUserDemo {

    @Resource
    private User user;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(RegisterUserBeanFactoryPostProcessor.class);
        applicationContext.register(RegisterUserDemo.class);
        applicationContext.refresh();
        User user = applicationContext.getBean(User.class);
        System.out.println(user);
        RegisterUserDemo registerBeanDemo = applicationContext.getBean(RegisterUserDemo.class);
        System.out.println(registerBeanDemo);
    }

}

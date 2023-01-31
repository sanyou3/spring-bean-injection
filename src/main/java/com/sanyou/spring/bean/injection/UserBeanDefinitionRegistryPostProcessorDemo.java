package com.sanyou.spring.bean.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2023/1/29 22:05
 */
public class UserBeanDefinitionRegistryPostProcessorDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(UserBeanDefinitionRegistryPostProcessor.class);
        applicationContext.refresh();
        User user = applicationContext.getBean(User.class);
        System.out.println(user);
    }

}

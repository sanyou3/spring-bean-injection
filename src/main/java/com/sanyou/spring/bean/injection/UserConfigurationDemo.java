package com.sanyou.spring.bean.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2023/1/28 23:33
 */
@ComponentScan
public class UserConfigurationDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        applicationContext.register(UserConfigurationDemo.class);

        applicationContext.refresh();

        User user = applicationContext.getBean(User.class);

        System.out.println(user);
    }

}

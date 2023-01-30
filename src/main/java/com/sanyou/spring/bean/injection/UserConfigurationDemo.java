package com.sanyou.spring.bean.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * TODO
 *
 * @author yisuan
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

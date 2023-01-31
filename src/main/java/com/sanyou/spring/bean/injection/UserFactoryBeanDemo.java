package com.sanyou.spring.bean.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2023/1/30 12:36
 */
public class UserFactoryBeanDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //将UserFactoryBean注入到Spring容器中
        applicationContext.register(UserFactoryBean.class);
        applicationContext.refresh();
        User user = applicationContext.getBean(User.class);
        System.out.println(user);
    }

}

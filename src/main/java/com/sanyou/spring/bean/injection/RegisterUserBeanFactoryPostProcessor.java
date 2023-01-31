package com.sanyou.spring.bean.injection;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2023/1/29 23:44
 */
public class RegisterUserBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        //创建一个User对象
        User user = new User();
        user.setUsername("三友的java日记");
        //将这个User对象注入到Spring容器中
        beanFactory.registerSingleton("user", user);
    }

}

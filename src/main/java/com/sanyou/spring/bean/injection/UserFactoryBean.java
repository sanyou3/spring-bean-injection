package com.sanyou.spring.bean.injection;

import org.springframework.beans.factory.FactoryBean;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/16 23:20
 */
public class UserFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setUsername("三友的java日记");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

}

package com.sanyou.spring.bean.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2023/1/28 23:32
 */
@Configuration
public class UserConfiguration {

    @Bean
    public User user() {
        return new User();
    }

}

package com.sanyou.spring.bean.injection;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 微信公众号：三友的java日记
 *
 * @author snayou
 * @date 2022/7/16 21:53
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class User {

    private String username;

}

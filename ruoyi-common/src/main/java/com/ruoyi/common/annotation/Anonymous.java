package com.ruoyi.common.annotation;

/**
 * @ClassName: Anonymous
 * @ProjectName : ruo-yi-vue-blog
 * @Author : 16088
 * @Time : 2022/06/19 21:30
 * @Description : 匿名访问不鉴权注解
 */

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Anonymous
{
}


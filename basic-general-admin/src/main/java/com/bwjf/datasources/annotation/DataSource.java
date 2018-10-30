package com.bwjf.datasources.annotation;

import java.lang.annotation.*;

/**
 * @ClassName: DataSource
 * @Description: TODO 多数据源注解
 * @author admin
 * @date 2018年10月30日
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
	String name() default "";
}

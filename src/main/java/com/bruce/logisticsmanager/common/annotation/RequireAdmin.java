package com.bruce.logisticsmanager.common.annotation;

import java.lang.annotation.*;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 14:10
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequireAdmin {
}
